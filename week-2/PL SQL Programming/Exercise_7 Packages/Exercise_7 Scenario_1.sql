CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(p_id NUMBER, p_name VARCHAR2, p_dob DATE, p_balance NUMBER) IS
    BEGIN
        INSERT INTO Customers(CustomerID, Name, DOB, Balance, LastModified)
        VALUES (p_id, p_name, p_dob, p_balance, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Customer added: ' || p_name);
    END;

    PROCEDURE UpdateCustomer(p_id NUMBER, p_name VARCHAR2, p_balance NUMBER) IS
    BEGIN
        UPDATE Customers
        SET Name = p_name,
            Balance = p_balance,
            LastModified = SYSDATE
        WHERE CustomerID = p_id;
        DBMS_OUTPUT.PUT_LINE('Customer updated: ' || p_name);
    END;

    FUNCTION GetCustomerBalance(p_id NUMBER) RETURN NUMBER IS
        v_balance NUMBER;
    BEGIN
        SELECT Balance INTO v_balance FROM Customers WHERE CustomerID = p_id;
        RETURN v_balance;
    END;

END CustomerManagement;
/

-- Add new customer
BEGIN
    CustomerManagement.AddCustomer(3, 'Charlie White', TO_DATE('1992-12-01','YYYY-MM-DD'), 2000);
END;
/

-- Update existing customer
BEGIN
    CustomerManagement.UpdateCustomer(1, 'John Doe Jr', 1200);
END;
/

-- Get customer balance
DECLARE
    v_bal NUMBER;
BEGIN
    v_bal := CustomerManagement.GetCustomerBalance(1);
    DBMS_OUTPUT.PUT_LINE('Customer 1 Balance: ' || v_bal);
END;
/