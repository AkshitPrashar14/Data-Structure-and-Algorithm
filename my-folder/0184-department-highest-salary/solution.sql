# Write your MySQL query statement below
WITH CTE AS (
    Select departmentId,MAX(salary) as max_per_resp_dept from Employee
    GROUP BY departmentId
)
SELECT d.name as Department,e.name as Employee,e.salary as Salary 
from Department d 
JOIN CTE c On d.id=c.departmentId
JOIN Employee e On d.id=e.departmentId
Where salary=max_per_resp_dept;





