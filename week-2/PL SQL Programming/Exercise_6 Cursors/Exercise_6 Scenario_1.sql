SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_monthly IS
        SELECT c.CustomerName, t.Amount, t.Type, t.TxnDate
        FROM Customers c
        JOIN Transactions t ON c.CustomerID = t.CustomerID
        WHERE TRUNC(t.TxnDate, 'MM') = TRUNC(SYSDATE, 'MM')
        ORDER BY c.CustomerName;

    v_name Customers.CustomerName%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_type Transactions.Type%TYPE;
    v_date Transactions.TxnDate%TYPE;
BEGIN
    OPEN c_monthly;
    LOOP
        FETCH c_monthly INTO v_name, v_amount, v_type, v_date;
        EXIT WHEN c_monthly%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer: ' || v_name ||
                             ' | Date: ' || v_date ||
                             ' | Type: ' || v_type ||
                             ' | Amount: ' || v_amount);
    END LOOP;
    CLOSE c_monthly;
END;
/
