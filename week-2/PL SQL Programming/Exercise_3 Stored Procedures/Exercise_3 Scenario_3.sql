CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acct IN NUMBER,
    to_acct IN NUMBER,
    amount IN NUMBER
) AS
    insufficient_funds EXCEPTION;
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = from_acct;

    IF v_balance < amount THEN
        RAISE insufficient_funds;
    END IF;

    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - amount
    WHERE AccountID = from_acct;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + amount
    WHERE AccountID = to_acct;

    COMMIT;

EXCEPTION
    WHEN insufficient_funds THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in source account.');
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: One of the accounts does not exist.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error occurred.');
END;
/

EXEC TransferFunds(1, 2, 3000);
