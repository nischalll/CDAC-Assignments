# SECTION 2
1. List the name, employee code and designation of each employee of the office
```sql
SELECT empname,empcode,desigcode from emp;
```

2. List all the departments and the budgets
```sql
SELECT * from dept;
```

3. List the employees and their respective department names
```sql
SELECT empname,deptname FROM emp JOIN dept USING(deptcode);
```

4. List the employees who are not having any superior to work under
```sql 
SELECT * FROM emp WHERE supcode IS NULL;
``` 

5. List the employees who are working directly under superior most employee of the
office. (Assume the superior most employee is the employee who does not have a
supervisor)
```sql
SELECT * FROM emp where supcode IN(SELECT empcode FROM emp WHERE supcode IS NULL);
```

6. List the employee(s) who is senior most in the office
```sql
SELECT * from emp where joindate=(SELECT min(joindate) FROM emp);
```

7. List the employees who will retire from the office next.
```sql
SELECT *,YEAR(NOW())-YEAR(birthdate) AS age FROM emp WHERE YEAR(NOW())-YEAR(birthdate)>60;
```

8. List the departments with the respective department managers
```sql
SELECT empname,desigcode,deptname,deptcode  FROM emp JOIN dept USING(deptcode) WHERE desigcode="MNGR";
```

9. List the employees who work as ‘manager’ to at least one department.
```sql
SELECT * FROM emp WHERE desigcode="MNGR";
```

10. List the number of employees working for either ‘accounts’ or ‘personal’ or ‘purchase’ departments
```sql
SELECT * FROM emp WHERE deptcode IN ("ACCT","PERS","PRCH");
```

11. List the employees working for ‘accounts’ or ‘personal’ department
```sql
SELECT * FROM emp WHERE deptcode = "ACCT" OR deptcode = "PERS";
```

12. List the employees working for ‘accounts’ and ‘personal’ department
```sql
SELECT * FROM emp WHERE deptcode = "ACCT" AND deptcode = "PERS";
```

13. List the employees working for ‘accounts’ but not for ‘personal’ department
```sql
SELECT * FROM emp WHERE deptcode = "ACCT" AND deptcode NOT IN ("PERS");
```

14. List the youngest employee of the office
```sql
SELECT * from emp where YEAR(birthdate) =(SELECT MAX(YEAR(birthdate)) FROM emp);
```

15. List the employees who are drawing basic pay not equal to 12400.
```sql
SELECT * from emp where basicpay <> 12400;
```

16. List the employees who are drawing basic salary between 11000 and 12000.
```sql
SELECT * from emp where basicpay BETWEEN 11000 AND 12000;
```

17. List the employees who are drawing basic salary not between 11000 and 12000
```sql
SELECT * from emp where basicpay NOT BETWEEN 11000 AND 12000;
```

18. List the employees who got salary allowance between Rs.1000 to Rs.1500 in the month of January 2012.
```sql
SELECT * from emp JOIN salary USING(empcode) where (allow BETWEEN 1000 AND 1500)
AND (salmonth>='2012-01-01' AND salmonth < '2012-02-01');
```

19. List the employees whose name ends with ‘i’ or ‘y’.
```sql
SELECT empname from emp WHERE empname LIKE '%y' OR empname LIKE '%i';
```

20. List the employees who have atleast 25 years of experience
```sql
SELECT * from emp WHERE YEAR(NOW())-YEAR(joindate)>25;
```

21. List the ‘Salesmen’ who have minimum 30 to 20 years of experience
```sql
SELECT *,YEAR(NOW())-YEAR(joindate) exp from emp WHERE deptcode='SALE' AND YEAR(NOW())-YEAR(joindate)BETWEEN 20 AND 30;
```

22. List the basic salary and half of the basic salary for each employee.
```sql
SELECT empname, basicpay, basicpay/2 half_of_basic FROM emp;
```

23. List the employees and the latest take-home-pay of each employee. (Hint: Take-home-pay = basic + allowance - deductions)
``` sql
SELECT empname,((basic+allow)-deduct) AS 'take-home-pay' FROM emp JOIN salary USING(empcode) where salmonth =(SELECT max(salmonth) FROM salary);
```

24. List the employees and the latest take-home-pay of each employee of ‘Accounts’ department.
```sql
SELECT empname, deptcode,((basic+allow)-deduct) AS 'take-home-pay' FROM emp JOIN salary USING(empcode) where salmonth =(SELECT max(salmonth) FROM salary) AND deptcode='ACCT';
```

25. List employees and their respective ages.
```sql
SELECT empname, YEAR(NOW())-YEAR(birthdate) AS AGE FROM emp;
```

26. List all the ‘Accounts’ department employees, first ordered by their age and then by their names.
```sql
SELECT * FROM emp WHERE deptcode='ACCT' ORDER BY birthdate,empname;
```

27. List the number of employees directly reporting to ‘Reddy’
```sql
SELECT * FROM emp WHERE supcode=(select empcode from emp where empname='reddy');
```

28. List the employees who have atleast one person working under him/her and the number of their subordinates. List the employee with highest number of subordinates first, next the person with next highest number of subordinates and so on.
```sql
SELECT * FROM emp WHERE empcode IN (SELECT supcode FROM emp);
```

29. List the employees who have minimum 3 employees working under him/her.
```sql
 SELECT supcode,count(empcode) FROM emp WHERE supcode IN
	(SELECT empcode FROM emp WHERE empcode IN
	(SELECT DISTINCT supcode from emp)
	)
	GROUP BY supcode
	having count(empcode)>3
```

30. List the minimum and maximum salaries drawn in each grade code.
``` sql
SELECT gradecode,MAX(basicpay),MIN(basicpay) FROM emp GROUP BY gradecode;
```

31. List the employees with names of their supervisors (Hint: Use Join).
```sql
SELECT e.empcode, e.empname, sup.empcode, sup.empname FROM emp e JOIN 
	(SELECT * FROM emp WHERE empcode IN(SELECT DISTINCT supcode FROM emp)) AS sup
	ON e.supcode=sup.empcode;
```

32. List the number of officers reporting to each supervisor having more than 3
people working under them
``` sql
SELECT supcode,count(empcode) AS no_of_emp from emp group by supcode>3;
```

33. List the employees who have not got any promotion till now.
```sql
SELECT * FROM emp WHERE empcode NOT IN(SELECT DISTINCT empcode FROM history);
```

34. List the employee with maximum number of promotions. Also list the number of
promotions that he/she got.
```sql
SELECT DISTINCT empcode, empname, count(changedate)AS 
	no_of_promotions FROM history
	JOIN emp USING(empcode)
	GROUP BY empcode ORDER BY no_of_promotions DESC;
```

35. List the employees who got promoted in the year 1991.
```sql
SELECT empcode, empname, changedate from history JOIN emp USING(empcode) WHERE YEAR(changedate)=1991;
```

36. List the department budget and the total salary drawn (by the employees of this department).
```sql
SELECT empcode,empname,deptcode,deptname,budget, basicpay from dept JOIN emp USING(deptcode);
```

37. Display the employee names in full uppercase.
```sql
SELECT empcode,UPPER(empname) from emp;
```

38. List all the employees drawing salary higher than the salary drawn by ‘Jain’
```sql
SELECT * from emp WHERE basicpay>(SELECT basicpay from emp where empname='Jain');
```

39. List all the employees who have higher salary than all the employees who draw
salary in the range of 11000 to 12000.
```sql
SELECT * FROM emp WHERE basicpay > (SELECT AVG(basicpay) from emp WHERE basicpay BETWEEN 11000 AND 12000);
```

40. List all the employees who have greater than average pay. Display the result in the
increasing order of the salary.
```sql
SELECT * FROM emp WHERE basicpay > (SELECT AVG(basicpay) from emp);
```

41. List the employees who draws highest salary
```sql
SELECT * FROM emp WHERE basicpay > (SELECT AVG(basicpay) from emp) ORDER BY basicpay DESC;
```

42. List all the employees other than the employees who draw highest salary
```sql
 SELECT * FROM emp WHERE basicpay <> (SELECT MAX(basicpay) from emp);
```

43. List the employees who draw highest salary in each department
``` sql
SELECT * from emp e where basicpay=(SELECT MAX(basicpay) from emp WHERE deptcode = e.deptcode);
```

44. List the employee(s) getting second highest salary
``` sql
SELECT basicpay FROM 
	(SELECT basicpay FROM emp order by basicpay DESC LIMIT 2) 
	AS employee ORDER BY basicpay LIMIT 1;
```

45.List the employee(s) who are getting fifth highest salary.
```sql
SELECT basicpay FROM 
	(SELECT basicpay FROM emp order by basicpay DESC LIMIT 5) 
	AS employee order by basicpay LIMIT 1;
```

46. List the female employee who draws the highest salary higher than any other
female employee
```sql
SELECT basicpay FROM emp WHERE SEX='F' order by basicpay DESC LIMIT 1;
```

47. List the department name of the female employee who draws the highest salary
higher than any other female employee
```sql
SELECT basicpay, deptname FROM emp JOIN dept USING(deptcode) WHERE SEX='F' order by basicpay DESC LIMIT 1;
```

48. List the department manager of the department, in which the female employee
who draws the highest salary higher than any other female employee works in
``` sql
SELECT * FROM emp WHERE 
	deptcode= (SELECT deptcode FROM emp WHERE SEX='F' order by basicpay DESC LIMIT 1)
	AND
	desigcode ="MNGR";
```

49. List all male employees who draw salary greater than atleast one female employee
```sql
SELECT * FROM emp WHERE 
	basicpay > (SELECT basicpay FROM emp WHERE SEX='F' order by basicpay LIMIT 1);
```


50. List the departments in which average salary of employees is more than average
salary of the company
```sql
SELECT deptcode,AVG(basicpay) AS avg_sal_dept, 
	(SELECT AVG(basicpay) from emp) AS avg_sal_dep 
	FROM emp GROUP BY deptcode 
	having avg_sal_dept>(SELECT AVG(basicpay) from emp);
```

51. List the employees drawing salary lesser than the average salary of employees
working for ‘accounts’ department
```sql
SELECT *,(SELECT AVG(basicpay) from emp where deptcode='ACCT') AS avg_salary_acct FROM emp 
	where basicpay < (SELECT AVG(basicpay) from emp where deptcode='ACCT');
```


