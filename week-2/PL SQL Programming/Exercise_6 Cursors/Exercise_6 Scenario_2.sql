SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_accounts IS
        SELECT AccountID, Balance FROM Accounts;

    v_acc Accounts.AccountID%TYPE;
    v_bal Accounts.Balance%TYPE;
    v_fee NUMBER := 100;
BEGIN
    OPEN c_accounts;
    LOOP
        FETCH c_accounts INTO v_acc, v_bal;
        EXIT WHEN c_accounts%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - v_fee
        WHERE AccountID = v_acc;

        DBMS_OUTPUT.PUT_LINE('Annual fee applied to Account ' || v_acc ||
                             '. New Balance = ' || (v_bal - v_fee));
    END LOOP;
    CLOSE c_accounts;
END;
/
