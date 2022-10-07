# Section -3
## Views Practice questions:
1. Write a view to compute the employee age of the organization
```sql
CREATE VIEW employe_age AS SELECT empname, YEAR(NOW())-YEAR(birthdate) AS Age FROM emp;
```

2. Write a view to compute the employee experience with the organization
```sql
CREATE VIEW emp_exp AS SELECT empcode, empname, YEAR(NOW())-YEAR(joindate) AS employe_exp FROM emp ;
```

3. Write a view that computes the employee pay for the current month for all the employees. Hint: Compute the employee pay as the Basic+Allowance-Deduction
```sql
CREATE VIEW emp_pay AS SELECT empcode, empname, basic+allow-deduct AS emp_pay FROM emp JOIN salary USING(empcode);
```

4. List the employees who are older than their supervisors. Hint: Use views to implement employee age
```sql
SELECT * from emp e where YEAR(NOW())-YEAR(birthdate)>(SELECT age from emp_age where empcode=e.supcode);
```

5. Write a view to display the total number of employees in each department
```sql
CREATE VIEW no_of_emp AS (SELECT deptcode, count(empcode) AS no_of_emp from emp group by deptcode);
```

6. Write a view to display the total number of employees in the organization
```sql
CREATE VIEW no_of_emp_org AS (SELECT count(*) AS no_of_emp from emp);
```

7. Use the views in Qn No 5 & Qn No 6, to display the percentage of employees in each department
```sql
SELECT deptcode, (no_of_emp/(SELECT * FROM no_of_emp_org))*100 AS percentage FROM no_of_emp;
```




