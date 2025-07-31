--UpdateCustomerLastModified

CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON CustomersTrigger
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/

--Test Scenario 1

-- Update customer record
UPDATE CustomersTrigger
SET Email = 'david.new@mail.com'
WHERE CustomerID = 1;

-- Check result
SELECT * FROM CustomersTrigger;
