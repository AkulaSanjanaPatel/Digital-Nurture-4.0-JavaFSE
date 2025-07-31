CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    p_fromAcc IN NUMBER,
    p_toAcc IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    -- Start transaction implicitly in Oracle
    -- Check if sender has sufficient funds
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_fromAcc
    FOR UPDATE; -- Lock the row

    IF v_balance < p_amount THEN
        INSERT INTO ErrorLog(ErrorMessage) 
        VALUES('Insufficient funds for Account ' || p_fromAcc);
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
    END IF;

    -- Deduct from sender
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_fromAcc;

    -- Add to receiver
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_toAcc;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Error during fund transfer from ' || p_fromAcc || ' to ' || p_toAcc || ': ' || SQLERRM);
END;
/
