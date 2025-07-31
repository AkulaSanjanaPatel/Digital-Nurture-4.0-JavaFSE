--CheckTransactionRules

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_balance NUMBER;
BEGIN
    -- Get current account balance
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;

    -- Check deposit rule
    IF :NEW.Type = 'Deposit' AND :NEW.Amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20010, 'Deposit amount must be positive');
    END IF;

    -- Check withdrawal rule
    IF :NEW.Type = 'Withdrawal' AND :NEW.Amount > v_balance THEN
        RAISE_APPLICATION_ERROR(-20011, 'Insufficient balance for withdrawal');
    END IF;
END;
/

--Test Scenario 
--Valid Deposit:
INSERT INTO Transactions(AccountID, Amount, Type) VALUES (101, 200, 'Deposit');

--Invalid Deposit (Negative Amount):
INSERT INTO Transactions(AccountID, Amount, Type) VALUES (101, -50, 'Deposit');

--Invalid Withdrawal (Exceeds Balance):
INSERT INTO Transactions(AccountID, Amount, Type) VALUES (102, 1000, 'Withdrawal');


