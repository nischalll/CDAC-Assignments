# stored procedure

1)Create a procedure for adding a row in emp table. Display number of rows added. Handle corresponding exception
```sql
DROP PROCEDURE IF EXISTS add_row_in_emp_table;
DELIMITER &&
CREATE PROCEDURE add_row_in_emp_table
(
	empcode VARCHAR(15),
    empname VARCHAR(15),
    deptcode VARCHAR(15),
    birthdate DATE,
    joindate DATE,
    sex CHAR(1),
    desigcode varchar(15),
    supcode varchar(15),
    gradecode varchar(15),
    gradelevel varchar(15),
    basicpay INT
)
BEGIN
	INSERT INTO emp
    values(
    empcode,empname,deptcode,birthdate,joindate,sex,desigcode,
    supcode,gradecode,gradelevel,basicpay
    );
END &&
DELIMITER ;
```
```sql
call add_row_in_emp_table(
"9999","Nischal","ACCT","2001-01-19","2018-10-15",
'M',"MNGR","7839","GC1","GL1",20000
);
```

2)Create a procedure which takes employee number as parameter and delete the employee record. Procedure must return the empname whose record has be deleted.
```sql
ALTER TABLE history DROP FOREIGN KEY history_ibfk_2; 

ALTER TABLE history ADD CONSTRAINT history_ibfk_2 
FOREIGN KEY (desigcode) REFERENCES emp(desigcode)
ON DELETE CASCADE ON UPDATE CASCADE;

DROP PROCEDURE IF EXISTS delete_emp_by_id;
DELIMITER &&
CREATE PROCEDURE delete_emp_by_id
(
	empcode VARCHAR(15)
)
BEGIN
	DELETE FROM emp e WHERE e.empcode = empcode;
END &&
DELIMITER ;

CALL delete_emp_by_id("9999");
```

3)Create a procedure which takes department name as paramater and displays all the employee records, no of employee in that department. 
```sql
DROP PROCEDURE IF EXISTS find_emp_by_deptcode;
DELIMITER &&
CREATE PROCEDURE find_emp_by_deptcode
(
	deptcode VARCHAR(15)
)
BEGIN
	SELECT * from emp e where e.deptcode = deptcode;
END &&
DELIMITER ;

CALL find_emp_by_deptcode("ACCT");
```


4)Create a procedure which takes empno as IN parameter and gives
OUT entire record of the employee
```sql
DROP PROCEDURE IF EXISTS find_emp_by_id;
DELIMITER &&
CREATE PROCEDURE find_emp_by_id
(
	empcode VARCHAR(15)
)
BEGIN
	SELECT * from emp e where e.empcode = empcode;
END &&
DELIMITER ;

CALL find_emp_by_id("7192");
```

5)create a prcedure which would accept 2 dates as arguments and returns   difference between them in years and months Eg: "3 years 6 months"
```sql
DROP PROCEDURE IF EXISTS find_diff_in_date;
DELIMITER &&
CREATE PROCEDURE find_diff_in_date
(
	firstdate DATE,
    seconddate DATE
)
BEGIN
	SELECT year(firstdate)-year(seconddate);
    SELECT (year(firstdate)-year(seconddate)) AS year, MONTH(firstdate)-MONTH(seconddate)AS month;
END &&
DELIMITER ;

CALL find_diff_in_date("2022-10-15","2001-01-19");
CALL find_diff_in_date("2022-10-15","2001-01-19");
```

6) Create table with following structures

* emp_bonus(empno,ename,annual_salary,bonus)
* using cursor program fetch empno,ename,sal,comm from emp table.
* for each record fetched find annual salary which includes comm
* compute various percentage of bonus based on annual salary.
```sql
DROP PROCEDURE IF EXISTS fetch_emp_bonus;
DELIMITER &&
CREATE PROCEDURE fetch_emp_bonus()
BEGIN
    DECLARE finished INT DEFAULT 0;
    DECLARE no INT;
    DECLARE name VARCHAR(15) DEFAULT "";
    DECLARE sal INT;
    DECLARE bonus_sal INT;
    DECLARE cur CURSOR FOR SELECT empno, ename, annual_salary,bonus FROM emp_bonus eb;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished=1;
    
    OPEN cur;
		fetch_emp:LOOP
			FETCH cur INTO no,name,sal,bonus_sal;
            IF finished = 1 THEN
				LEAVE fetch_emp;
            END IF;
            select no,name,sal,bonus_sal, bonus_sal/sal*100 AS perc;
        END LOOP fetch_emp;
    CLOSE cur;
END &&
DELIMITER ;

CALL fetch_emp_bonus();
```

* insert empno,ename,annual_salary,bonus into emp_bonus table
* display number of rows inserted.
```sql
DELIMITER $$
DROP TRIGGER IF EXISTS emp_bonus_after_insert;
CREATE TRIGGER emp_bonus_after_insert
	AFTER INSERT ON emp_bonus
    FOR EACH ROW  
BEGIN
    SET @count:= @count+1;
END$$

DELIMITER ;

select @count;
```

7)Design a cursor program in which you select empno,ename,job,sal
into a collection and display the same for any department number passed as argument to cursor. 
```sql
========SKIPPED=======
```

8)Write a procedure  to create a cursor displays the name and salary of each employee in the EMPLOYEES table whose salary is less than that specified by a passed-in parameter value.
```sql
DELIMITER $$
DROP PROCEDURE IF EXISTS less_than_spec;
CREATE PROCEDURE less_than_spec(
salary INT
)
BEGIN
	DECLARE finished INT DEFAULT 0;
	DECLARE p_empname VARCHAR(15);
    DECLARE p_basicpay VARCHAR(15);
    DECLARE cur CURSOR FOR SELECT empname,basicpay from emp where basicpay < salary;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished=1;
    
    OPEN cur;
		fetch_emp:LOOP
        FETCH cur INTO p_empname,p_basicpay;
        IF finished = 1 THEN
			LEAVE fetch_emp;
		END IF;
			SELECT p_empname,p_basicpay;
        END LOOP fetch_emp;
    CLOSE cur;
END$$
DELIMITER ;

CALL less_than_spec(12000);
```

9)Write a procedure to display employee id, name, hire date, and the incentive amount they achieved according to their working experiences, 
### NOTE:NOT A VALID ANSWER
```sql
DELIMITER $$
CREATE PROCEDURE emp_inc()
BEGIN
	SELECT empcode, empname, joindate, YEAR(NOW())-YEAR(joindate) AS exp, basicpay 
	FROM emp ORDER BY exp DESC;
END$$
DELIMITER ;

CALL emp_inc();
```


10)Write procedure to display the  department with more than five employees.
```sql
DELIMITER $$
DROP PROCEDURE IF EXISTS dept_with_more;-- 
CREATE PROCEDURE dept_with_more()
BEGIN
	SELECT deptcode, COUNT(*)AS no_of_emp FROM emp GROUP BY deptcode HAVING no_of_emp>5;
END$$
DELIMITER ;

CALL dept_with_more();
```

# stored functions

1)Create a function which takes department name as paramater and 
  return the  no of employee working in that department. 
```sql
DELIMITER $$
DROP FUNCTION IF EXISTS dept_by_code;
CREATE FUNCTION dept_by_code(
	p_deptcode VARCHAR(15)
)
RETURNS INTEGER
READS SQL DATA
BEGIN
	DECLARE counter INT DEFAULT 0;
	SELECT COUNT(*) INTO counter FROM emp GROUP BY deptcode HAVING deptcode = p_deptcode;
    RETURN counter; 
END$$
DELIMITER ;

SELECT dept_by_code("ACCT");
```

2)Write function to return the  department no having more than five employees
```sql
DELIMITER $$
DROP FUNCTION IF EXISTS dept_having_more;
CREATE FUNCTION dept_having_more()
RETURNS VARCHAR(15)
READS SQL DATA
BEGIN
	DECLARE result VARCHAR(15);
	SELECT deptcode INTO result FROM emp GROUP BY deptcode HAVING COUNT(*)>5;
    RETURN result; 
END$$
DELIMITER ;

SELECT dept_having_more();
```

3)write a function to return the employee who is earning second max salary from a perticular department.
```sql
DELIMITER $$
DROP FUNCTION IF EXISTS second_highest;
CREATE FUNCTION second_highest()
RETURNS VARCHAR(15)
READS SQL DATA
BEGIN
	DECLARE result VARCHAR(15);
	SELECT empcode INTO result FROM emp order by basicpay DESC LIMIT 1,1;
    RETURN result; 
END$$
DELIMITER ;

SELECT second_highest();
```

4)write a function to return the employee who is having maximum experience from the emp table.
```sql
DELIMITER $$
DROP FUNCTION IF EXISTS most_exp;
CREATE FUNCTION most_exp()
RETURNS VARCHAR(15)
READS SQL DATA
BEGIN
	DECLARE result VARCHAR(15);
	SELECT empcode INTO result FROM emp ORDER BY joindate LIMIT 1;
    RETURN result; 
END$$
DELIMITER ;

SELECT most_exp();
```
