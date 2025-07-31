CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(p_accID NUMBER, p_custID NUMBER, p_type VARCHAR2, p_balance NUMBER);
    PROCEDURE CloseAccount(p_accID NUMBER);
    FUNCTION GetTotalCustomerBalance(p_custID NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(p_accID NUMBER, p_custID NUMBER, p_type VARCHAR2, p_balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts(AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (p_accID, p_custID, p_type, p_balance, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Account ' || p_accID || ' opened for customer ' || p_custID);
    END;

    PROCEDURE CloseAccount(p_accID NUMBER) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = p_accID;
        DBMS_OUTPUT.PUT_LINE('Account ' || p_accID || ' closed');
    END;

    FUNCTION GetTotalCustomerBalance(p_custID NUMBER) RETURN NUMBER IS
        v_total NUMBER := 0;
    BEGIN
        SELECT NVL(SUM(Balance),0) INTO v_total
        FROM Accounts
        WHERE CustomerID = p_custID;
        RETURN v_total;
    END;

END AccountOperations;
/
