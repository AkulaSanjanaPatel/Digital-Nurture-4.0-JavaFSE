--LogTransaction

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (TransactionID, LogMessage)
    VALUES (:NEW.TransactionID,
            'Transaction of ' || :NEW.Amount || ' for Account ' || :NEW.AccountID);
END;
/

--Test Scenario 2
-- Insert a transaction
INSERT INTO Transactions(AccountID, Amount, Type)
VALUES (101, 500, 'Deposit');

-- Check Audit Log
SELECT * FROM AuditLog;
