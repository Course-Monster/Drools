-- Client Sample Data6
INSERT INTO DROOLS_TRAINING_INSURANCE.CLIENT(CLIENT_ID, CLIENT_NAME, BIRTHDATE, IS_SMOKER, IS_EMPLOYED, ANNUAL_INCOME)
VALUES
( '01','James Smith', CURRENT_DATE,FALSE,TRUE,138000),
( '02','Maria Smith', CURRENT_DATE,FALSE,TRUE,57000),
( '03','Robert Johnson', CURRENT_DATE,FALSE,TRUE,90000),
( '04','Linda Johnson', CURRENT_DATE,FALSE,TRUE,120000),
( '05','Michael Wilson', CURRENT_DATE,FALSE,TRUE,21000),
( '06','Elizabeth Anderson', CURRENT_DATE,FALSE,TRUE,119000),
( '07','David Lee', CURRENT_DATE,FALSE,TRUE,75000),
( '08','Emily Taylor', CURRENT_DATE,FALSE,TRUE,147000),
( '09','William Brown', CURRENT_DATE,FALSE,TRUE,135000),
( '10','Jessica Thompson', CURRENT_DATE,FALSE,TRUE,89000);
-- Client Ids
INSERT INTO DROOLS_TRAINING_INSURANCE.CLIENT_IDENTIFICATION(IDENTIFICATION_NUMBER, CLIENT_ID, IS_EXPIRED)
VALUES ('ID-100','01',FALSE ),
       ('ID-101','02',TRUE ),
       ('ID-102','03',FALSE ),
       ('ID-103','04',FALSE ),
       ('ID-104','05',FALSE ),
       ('ID-105','06',FALSE ),
       ('ID-106','07',FALSE ),
       ('ID-107','08',FALSE ),
       ('ID-108','09',FALSE ),
       ('ID-109','10',FALSE );
-- Applications
INSERT INTO DROOLS_TRAINING_INSURANCE.APPLICATION(APPLICATION_NUMBER, CLIENT_ID, PEC, RISK, BMI)
VALUES ('A-100', '01',FALSE,'High','21' ),
       ('A-101', '02',TRUE,'Medium','23' ),
       ('A-102', '03',FALSE,'High','25'),
       ('A-103', '04',FALSE,'Low','32'),
       ('A-104', '05',TRUE,'Low','20' ),
       ('A-105', '06',FALSE,'Medium','27' ),
       ('A-106', '07',TRUE,'High','31' ),
       ('A-107', '08',FALSE,'Low','18' ),
       ('A-108', '09',TRUE,'Low','28'),
       ('A-109', '10',FALSE,'Medium','23' );

-- Policies
INSERT INTO DROOLS_TRAINING_INSURANCE.POLICY(POLICY_NUMBER, CLIENT_ID, PREMIUM, COVERAGE, STATUS)
VALUES ('P-100','01',140,14000,'Paid' ),
       ('P-101','02',220,22000,'Unpaid' ),
       ('P-102','03',150,15000,'Unpaid' ),
       ('P-103','04',90,9000,'Paid' ),
       ('P-104','05',400,40000,'Paid' ),
       ('P-105','06',230,23000,'Paid' ),
       ('P-106','07',180,18000,'Paid' ),
       ('P-107','08',240,24000,'Paid' ),
       ('P-108','09',120,12000,'Unpaid' ),
       ('P-109','10',210,21000,'Paid' );