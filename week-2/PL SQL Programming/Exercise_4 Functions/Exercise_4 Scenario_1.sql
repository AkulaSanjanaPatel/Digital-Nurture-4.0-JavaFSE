CREATE OR REPLACE FUNCTION CalculateAge (
    p_dob DATE
) RETURN NUMBER
IS
    v_age NUMBER;
BEGIN
    -- Calculate age using months difference
    v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, p_dob) / 12);
    RETURN v_age;
END;
/

SELECT CustomerName, CalculateAge(DateOfBirth) AS Age
FROM CustomersDOB;
