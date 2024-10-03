
# Pseudo Columns Queries on EMP Table

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
