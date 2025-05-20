# Write your MySQL query statement below
-- WITH CTE AS (
--     SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
--     FROM Employee
-- )
-- SELECT salary AS SecondHighestSalary
-- FROM CTE
-- WHERE rnk = 2;
SELECT max(salary) AS SecondHighestSalary FROM Employee WHERE salary <(SELECT max(salary) FROM Employee)