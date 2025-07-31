CREATE OR REPLACE FUNCTION HasSufficientBalance (
    p_accountID NUMBER,
    p_amount NUMBER
) RETURN BOOLEAN
IS
    v_balance NUMBER;
BEGIN
    -- Get balance
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_accountID;

    -- Compare
    IF v_balance >= p_amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE; -- Account doesn't exist
END;
/

--Test Scenario 3
DECLARE
    v_result BOOLEAN;
BEGIN
    v_result := HasSufficientBalance(101, 500);

    IF v_result THEN
        DBMS_OUTPUT.PUT_LINE('Account 101 has sufficient balance');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Account 101 does NOT have sufficient balance');
    END IF;
END;
/

--If we check a high amount:
DECLARE
    v_result BOOLEAN;
BEGIN
    v_result := HasSufficientBalance(101, 5000);
    IF v_result THEN
        DBMS_OUTPUT.PUT_LINE('Sufficient balance');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance');
    END IF;
END;
/
