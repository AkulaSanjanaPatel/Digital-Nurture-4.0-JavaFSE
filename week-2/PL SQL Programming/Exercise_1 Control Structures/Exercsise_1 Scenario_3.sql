DECLARE
    v_name VARCHAR2(50);
BEGIN
    FOR l IN (SELECT l.DueDate, c.Name
              FROM Loans l
              JOIN Customers c ON l.CustomerID = c.CustomerID
              WHERE l.DueDate <= SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan is due for ' || l.Name || ' on ' || TO_CHAR(l.DueDate, 'DD-Mon-YYYY'));
    END LOOP;
END;
/

SET SERVEROUTPUT ON;