-- Client Sample Data6
INSERT INTO DROOLS_TRAINING_INSURANCE.CLIENT(CLIENT_ID, CLIENT_NAME, BIRTHDATE, IS_SMOKER, IS_EMPLOYED, ANNUAL_INCOME)
VALUES
( '01','James Smith', '19790103',FALSE,TRUE,138000),
( '02','Maria Smith', '20171103',FALSE,TRUE,57000),
( '03','Robert Johnson', '20100103',FALSE,FALSE,90000),
( '04','Linda Johnson', '20170103',FALSE,TRUE,120000),
( '05','Michael Wilson', '20170103',FALSE,TRUE,21000),
( '06','Elizabeth Anderson', '20170103',FALSE,TRUE,119000),
( '07','David Lee', '20170103',FALSE,TRUE,75000),
( '08','Emily Taylor', '20170103',FALSE,TRUE,147000),
( '09','William Brown','20170103',FALSE,TRUE,135000),
( '10','Jessica Thompson','20170103',FALSE,TRUE,89000);
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

INSERT INTO DROOLS_TRAINING_INSURANCE.CLAIM(CLAIM_ID, POLICY_NUMBER, DATE_OF_CLAIM, CLAIM_AMOUNT)
VALUES ('CLID-100','P-101','20230226',25000 ),
       ('CLID-102','P-102','20231011',40000 ),
       ('CLID-103','P-103','20231111',8000 ),
       ('CLID-104','P-104','20230720',50000 ),
       ('CLID-105','P-105','20230501',10000 );