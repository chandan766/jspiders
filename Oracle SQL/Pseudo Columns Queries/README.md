
# Pseudo Columns Queries on EMP Table

# EMP Table

| EMPNO | ENAME  | JOB      | MGR  | HIREDATE  | SAL  | COMM | DEPTNO |
|-------|--------|----------|------|-----------|------|------|--------|
| 7369  | SMITH  | CLERK    | 7902 | 17-DEC-80 | 800  |      | 20     |
| 7499  | ALLEN  | SALESMAN | 7698 | 20-FEB-81 | 1600 | 300  | 30     |
| 7521  | WARD   | SALESMAN | 7698 | 22-FEB-81 | 1250 | 500  | 30     |
| 7566  | JONES  | MANAGER  | 7839 | 02-APR-81 | 2975 |      | 20     |
| 7654  | MARTIN | SALESMAN | 7698 | 28-SEP-81 | 1250 | 1400 | 30     |
| 7698  | BLAKE  | MANAGER  | 7839 | 01-MAY-81 | 2850 |      | 30     |
| 7782  | CLARK  | MANAGER  | 7839 | 09-JUN-81 | 2450 |      | 10     |
| 7788  | SCOTT  | ANALYST  | 7566 | 19-APR-87 | 3000 |      | 20     |
| 7839  | KING   | PRESIDENT|      | 17-NOV-81 | 5000 |      | 10     |
| 7844  | TURNER | SALESMAN | 7698 | 08-SEP-81 | 1500 | 0    | 30     |
| 7876  | ADAMS  | CLERK    | 7788 | 23-MAY-87 | 1100 |      | 20     |
| 7900  | JAMES  | CLERK    | 7698 | 03-DEC-81 | 950  |      | 30     |
| 7902  | FORD   | ANALYST  | 7566 | 03-DEC-81 | 3000 |      | 20     |
| 7934  | MILLER | CLERK    | 7782 | 23-JAN-82 | 1300 |      | 10     |

----

# DEPT Table

| DEPTNO | DNAME        | LOC      |
|--------|--------------|----------|
| 10     | ACCOUNTING   | NEW YORK |
| 20     | RESEARCH     | DALLAS   |
| 30     | SALES        | CHICAGO  |
| 40     | OPERATIONS   | BOSTON   |

----

1. **Get 1st Half of the Records from Employee Table:**
   ```sql
   SELECT *
   FROM (SELECT EMP.*, ROWNUM SL_NO
         FROM EMP)
   WHERE SL_NO > (SELECT COUNT(*) / 2
                   FROM EMP);
   ```

2. **Get 1st Half (50%) of the Records from EMP Table with 'A' in Their Names:**
   ```sql
   SELECT *
   FROM (SELECT EMP.*, ROWNUM SL_NO
         FROM EMP)
   WHERE ENAME LIKE '%A%' AND 
         SL_NO <= (SELECT COUNT(*) / 2
                    FROM EMP);
   ```

3. **Get Even Number of Records from EMP Table:**
   ```sql
   SELECT *
   FROM (SELECT EMP.*, ROWNUM SL_NO
         FROM EMP)
   WHERE MOD(SL_NO, 2) = 0;
   ```

4. **Get Last Record from Employee Table:**
   ```sql
   SELECT *
   FROM (SELECT EMP.*, ROWNUM SL_NO
         FROM EMP)
   WHERE SL_NO = (SELECT COUNT(*)
                   FROM EMP);
   ```

5. **Delete 3rd Record from DEPT Table:**
   ```sql
   DELETE
   FROM (SELECT DEPT.*, ROWNUM SL_NO
         FROM DEPT)
   WHERE SL_NO = 3;
   ```

6. **Get 3rd Maximum Salary of an Employee Using Pseudo Columns:**
   ```sql
   SELECT SAL
   FROM (SELECT ROWNUM SL_NO, SAL
         FROM (SELECT DISTINCT SAL
               FROM EMP
               ORDER BY SAL DESC))
   WHERE SL_NO = 3;
   ```

7. **Get 5th Minimum Salary of an Employee Using Pseudo Columns:**
   ```sql
   SELECT SAL
   FROM (SELECT ROWNUM SL_NO, SAL
         FROM (SELECT DISTINCT SAL
               FROM EMP
               ORDER BY SAL ASC))
   WHERE SL_NO = 5;
   ```

8. **Update the 1st Record Employee Salary to 5000:**
   ```sql
   UPDATE EMP
   SET SAL = 5000
   WHERE ROWNUM = 1;
   ```

9. **Delete 1st 4 Records from EMP Table:**
   ```sql
   DELETE
   FROM EMP
   WHERE ROWNUM <= 4;
   ```

10. **Remove Last Record from DEPT Table:**
    ```sql
    DELETE
    FROM (SELECT DEPT.*, ROWNUM SL_NO
          FROM DEPT)
    WHERE SL_NO = (SELECT COUNT(*)
                    FROM DEPT);
    ```
