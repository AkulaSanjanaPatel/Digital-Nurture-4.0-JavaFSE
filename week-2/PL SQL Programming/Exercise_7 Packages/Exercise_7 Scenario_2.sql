CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_dept VARCHAR2);
    PROCEDURE UpdateEmployee(p_id NUMBER, p_salary NUMBER, p_position VARCHAR2);
    FUNCTION CalculateAnnualSalary(p_id NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_dept VARCHAR2) IS
    BEGIN
        INSERT INTO Employees(EmployeeID, Name, Position, Salary, Department, HireDate)
        VALUES (p_id, p_name, p_position, p_salary, p_dept, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Employee hired: ' || p_name);
    END;

    PROCEDURE UpdateEmployee(p_id NUMBER, p_salary NUMBER, p_position VARCHAR2) IS
    BEGIN
        UPDATE Employees
        SET Salary = p_salary,
            Position = p_position
        WHERE EmployeeID = p_id;
        DBMS_OUTPUT.PUT_LINE('Employee updated: ' || p_id);
    END;

    FUNCTION CalculateAnnualSalary(p_id NUMBER) RETURN NUMBER IS
        v_salary NUMBER;
    BEGIN
        SELECT Salary INTO v_salary FROM Employees WHERE EmployeeID = p_id;
        RETURN v_salary * 12;
    END;

END EmployeeManagement;
/

