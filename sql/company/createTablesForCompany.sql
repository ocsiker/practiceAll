--  select User, Host, plugin from mysql.user;  
SHOW DATABASES;


SHOW COLUMNS
FROM      employee;


-- CREATE DOMAIN Ssn_type as char(9);
-- create Domain not used in mysql any more
-- CREATE    TABLE employee (
--           Fname VARCHAR(15) NOT NULL,
--           Minit CHAR,
--           Lname VARCHAR(15) NOT NULL,
--           Ssn CHAR(9) NOT NULL,
--           Bdate DATE,
--           Address VARCHAR(30),
--           Sex CHAR
--           );
--

SELECT    authentication_string
FROM      mysql.user;


SHOW TABLES;


DROP      TABLE employee;


SELECT    USER,
          Host
FROM      mysql.user;
