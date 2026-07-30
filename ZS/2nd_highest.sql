SELECT MAX(salary) AS SecondHighestSalary
From Employee
WHERE salary <(SELECT MAX (salary)FROM Employee);