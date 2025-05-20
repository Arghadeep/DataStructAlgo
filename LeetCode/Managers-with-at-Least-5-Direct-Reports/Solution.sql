# Write your MySQL query statement below
SELECT e.name FROM 
(SELECT managerId FROM Employee GROUP BY managerId HAVING count(*) >= 5) AS cte JOIN Employee as e ON cte.managerId = e.id
