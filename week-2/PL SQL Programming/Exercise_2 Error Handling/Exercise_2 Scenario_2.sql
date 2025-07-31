CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_empID IN NUMBER,
    p_percent IN NUMBER
)
IS
    v_exists NUMBER;
BEGIN
    -- Check if employee exists
    SELECT COUNT(*) INTO v_exists FROM Employees WHERE EmpID = p_empID;

    IF v_exists = 0 THEN
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Employee ID ' || p_empID || ' does not exist');
        RAISE_APPLICATION_ERROR(-20002, 'Employee does not exist');
    END IF;

    -- Update salary
    UPDATE Employees
    SET Salary = Salary + (Salary * p_percent / 100)
    WHERE EmpID = p_empID;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLog(ErrorMessage)
        VALUES('Error updating salary for EmpID ' || p_empID || ': ' || SQLERRM);
END;
/
