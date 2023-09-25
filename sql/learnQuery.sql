-- example 0:
-- Retrieve the birth date and address of the employee(s) whose name is 'John B. Smith'
SELECT    Bdate,
          Address
FROM      Employee
WHERE     Fname = 'John'
AND       Minit = 'B'
AND       Lname = 'Smith';
