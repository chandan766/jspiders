# Oracle SQL Documentation

## Table of Contents
1. [Introduction](#introduction)
2. [History of Oracle SQL](#history-of-oracle-sql)
3. [Why Use Oracle SQL?](#why-use-oracle-sql)
4. [Importance of Oracle SQL](#importance-of-oracle-sql)
5. [EMP Table](#emp-table)
6. [DEPT Table](#dept-table)
7. [SALGRADE Table](#salgrade-table)

---

## Introduction
Oracle SQL (Structured Query Language) is a powerful language used for managing and manipulating relational databases. It is widely used in the industry for developing, querying, and managing databases.

## History of Oracle SQL
Oracle Corporation was founded in 1977 by Larry Ellison, Bob Miner, and Ed Oates. The first version of Oracle's database software was released in 1979, which supported SQL as its query language. Over the years, Oracle SQL has evolved significantly, incorporating features like advanced analytics, security, and scalability to meet the needs of modern applications.

## Why Use Oracle SQL?
Oracle SQL is known for its robustness, performance, and reliability. Organizations use Oracle SQL for various reasons, including:

- **Data Management**: Efficiently manage large volumes of data.
- **Complex Queries**: Perform complex queries and data analysis.
- **Data Integrity**: Enforce data integrity and security constraints.
- **Scalability**: Scale applications to handle growing data requirements.

## Importance of Oracle SQL
Oracle SQL plays a crucial role in:

- **Database Administration**: Essential for database administrators to manage databases effectively.
- **Business Intelligence**: Supports analytics and reporting tools for better decision-making.
- **Application Development**: A fundamental component for developers creating data-driven applications.

---

## Available Tables

| TNAME   | TABTYPE |
|---------|---------|
| EMP     | TABLE   |
| DEPT    | TABLE   |
| BONUS   | TABLE   |
| SALGRADE| TABLE   |

----

## EMP Table

| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
|-------|--------|----------|------|------------|------|------|--------|
| 7369  | SMITH  | CLERK    | 7902 | 17-DEC-80  | 800  |      | 20     |
| 7499  | ALLEN  | SALESMAN | 7698 | 20-FEB-81  | 1600 | 300  | 30     |
| 7521  | WARD   | SALESMAN | 7698 | 22-FEB-81  | 1250 | 500  | 30     |
| 7566  | JONES  | MANAGER  | 7839 | 02-APR-81  | 2975 |      | 20     |
| 7654  | MARTIN | SALESMAN | 7698 | 28-SEP-81  | 1250 | 1400 | 30     |
| 7698  | BLAKE  | MANAGER  | 7839 | 01-MAY-81  | 2850 |      | 30     |
| 7782  | CLARK  | MANAGER  | 7839 | 09-JUN-81  | 2450 |      | 10     |
| 7788  | SCOTT  | ANALYST  | 7566 | 19-APR-87  | 3000 |      | 20     |
| 7839  | KING   | PRESIDENT|      | 17-NOV-81  | 5000 |      | 10     |
| 7844  | TURNER | SALESMAN | 7698 | 08-SEP-81  | 1500 | 0    | 30     |
| 7876  | ADAMS  | CLERK    | 7788 | 23-MAY-87  | 1100 |      | 20     |
| 7900  | JAMES  | CLERK    | 7698 | 03-DEC-81  | 950  |      | 30     |
| 7902  | FORD   | ANALYST  | 7566 | 03-DEC-81  | 3000 |      | 20     |
| 7934  | MILLER | CLERK    | 7782 | 23-JAN-82  | 1300 |      | 10     |

---

## DEPT Table

| DEPTNO | DNAME        | LOC      |
|--------|--------------|----------|
| 10     | ACCOUNTING   | NEW YORK |
| 20     | RESEARCH     | DALLAS   |
| 30     | SALES        | CHICAGO  |
| 40     | OPERATIONS   | BOSTON   |

---
## SALGRADE Table

| GRADE | LOSAL | HISAL |
|-------|-------|-------|
| 1     | 700   | 1200  |
| 2     | 1201  | 1400  |
| 3     | 1401  | 2000  |
| 4     | 2001  | 3000  |
| 5     | 3001  | 9999  |

----
