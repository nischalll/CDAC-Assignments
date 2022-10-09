1.Create emp_index on table emp on the field birthdate.
```sql
CREATE INDEX emp_index ON emp(birthdate);
```

2.Create unique index dept_index on table dept on the field deptname.
```sql
CREATE INDEX dept_index ON dept(deptname);
```

3.Create students table, with filed id, name, age, gender, index on id
```sql
CREATE TABLE students2
(
	student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    age TINYINT NOT NULL,
    GENDER CHAR(1) NOT NULL
);
```
```sql
CREATE INDEX idx_std_id ON students(student_id);
```

4.Drop index of table emp
```sql
ALTER TABLE emp DROP INDEX emp_index;
```

5.Find all the index of table dept
```sql
SHOW INDEXES IN dept;
```

6.Create a temporary table student with field with filed id, name, age, gender
```sql
CREATE TEMPORARY TABLE student
(
	student_id INT,
	name VARCHAR(45),
    age TINYINT,
    gender CHAR(1)
);
```


7.Logout from session and login again to check if temporary table exists.
```
No, tempory table does not exists after relogin.
```

8.Create a temporary table test
```sql
CREATE TEMPORARY TABLE test
(
	test VARCHAR(45)
);
```
```sql
DESC test;
```

9.Drop temporary table test
```sql
DROP TABLE test;
```
