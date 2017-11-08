-- // Create Changelog

-- Default DDL for changelog table that will keep
-- a record of the migrations that have been run.

-- You can modify this to suit your database before
-- running your first migration.

-- Be sure that ID and DESCRIPTION fields exist in
-- BigInteger and String compatible fields respectively.

CREATE TABLE IF NOT EXISTS COMPANY(NAME TEXT NOT NULL, AGE INT NOT NULL,ADDRESS CHAR(50),SALARY REAL);
--ALTER TABLE ${changelog}
--ADD CONSTRAINT PK_${changelog}
--PRIMARY KEY (id);

-- //@UNDO

--DROP TABLE ${changelog};
