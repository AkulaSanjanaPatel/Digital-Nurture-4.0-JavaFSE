CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_customerID IN NUMBER,
    p_name IN VARCHAR2,
    p_email IN VARCHAR2
)
IS
    v_exists NUMBER;
BEGIN
    -- Check for duplicate ID
    SELECT COUNT(*) INTO v_exists FROM Customers WHERE CustomerID = p_customerID;

    IF v_exists > 0 THEN
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Customer ID ' || p_customerID || ' already exists');
        RAISE_APPLICATION_ERROR(-20003, 'Duplicate Customer ID');
    END IF;

    -- Insert new customer
    INSERT INTO Customers(CustomerID, CustomerName, Email)
    VALUES (p_customerID, p_name, p_email);

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Error inserting customer ID ' || p_customerID || ': ' || SQLERRM);
END;
/