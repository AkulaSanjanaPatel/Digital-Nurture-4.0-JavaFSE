SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_loans IS
        SELECT LoanID, InterestRate FROM Loans;

    v_loan Loans.LoanID%TYPE;
    v_rate Loans.InterestRate%TYPE;
BEGIN
    OPEN c_loans;
    LOOP
        FETCH c_loans INTO v_loan, v_rate;
        EXIT WHEN c_loans%NOTFOUND;

        IF v_rate < 10 THEN
            UPDATE Loans
            SET InterestRate = v_rate + 1
            WHERE LoanID = v_loan;
            DBMS_OUTPUT.PUT_LINE('Loan ' || v_loan || ' interest increased to ' || (v_rate + 1));
        ELSE
            UPDATE Loans
            SET InterestRate = v_rate + 0.5
            WHERE LoanID = v_loan;
            DBMS_OUTPUT.PUT_LINE('Loan ' || v_loan || ' interest increased to ' || (v_rate + 0.5));
        END IF;
    END LOOP;
    CLOSE c_loans;
END;
/
