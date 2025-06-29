CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept IN VARCHAR2,
    bonus_pct IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_pct / 100)
    WHERE Department = dept;
END;
/

EXEC UpdateEmployeeBonus('IT', 10);
