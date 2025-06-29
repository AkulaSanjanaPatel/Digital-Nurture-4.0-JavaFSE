BEGIN
    FOR rec IN (SELECT l.LoanID, l.InterestRate, c.Age FROM Loans l
                JOIN Customers c ON l.CustomerID = c.CustomerID)
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;
END;
/

SELECT * FROM Loans;