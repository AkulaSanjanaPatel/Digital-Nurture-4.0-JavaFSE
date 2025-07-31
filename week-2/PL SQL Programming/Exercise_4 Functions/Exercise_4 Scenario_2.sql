CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_amount NUMBER,
    p_annualRate NUMBER,
    p_years NUMBER
) RETURN NUMBER
IS
    v_monthlyRate NUMBER;
    v_months NUMBER;
    v_emi NUMBER;
BEGIN
    v_monthlyRate := p_annualRate / 12 / 100;
    v_months := p_years * 12;

    v_emi := (p_amount * v_monthlyRate) /
             (1 - POWER(1 + v_monthlyRate, -v_months));

    RETURN ROUND(v_emi, 2);
END;
/

SELECT CalculateMonthlyInstallment(100000, 12, 2) AS EMI FROM dual;
