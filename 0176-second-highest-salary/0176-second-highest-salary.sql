# Write your MySQL query statement below
SELECT(
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary Desc
    LIMIT 1 OFFSET 1
) as SecondHighestSalary;