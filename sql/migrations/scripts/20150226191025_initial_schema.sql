-- // single_id_refactor
-- Migration SQL that makes the change goes here.

-- Global id data
CREATE SEQUENCE idSequence;

CREATE TABLE IF NOT EXISTS COMPANY(NAME TEXT NOT NULL, AGE INT NOT NULL,ADDRESS CHAR(50),SALARY REAL);

