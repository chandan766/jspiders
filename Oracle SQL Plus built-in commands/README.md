
```
# Oracle SQL Plus Built-in Commands

This document lists useful Oracle SQL Plus commands and their purposes. You can copy the commands from the code blocks below and run them in your SQL Plus environment.

---

## Table of Contents
1. [Show All Tables](#1-select--from-tab)
2. [Current System Date and Time](#2-select-sysdate-from-dual)
3. [Current User](#3-select-user-from-dual)
4. [String Length](#4-select-lengthstring-from-dual)
5. [Show User Tables](#5-select--from-user_tables)
6. [Describe Table Structure](#6-desc-tablename)
7. [Show Current User](#7-show-user)
8. [Set Page Size](#8-set-pagesize-n)
9. [Set Line Size](#9-set-linesize-n)
10. [Toggle Row Count Display](#10-set-feedback-onoff)
11. [Toggle Column Headers](#11-set-heading-onoff)
12. [Toggle Substitution Variable Display](#12-set-verify-onoff)
13. [Toggle Command Display in Script](#13-set-echo-onoff)
14. [Enable PL/SQL Output](#14-set-serveroutput-on)
15. [Show All Accessible Tables](#15-select--from-all_tables)
16. [Customize SQL Prompt](#16-set-sqlprompt)
17. [Count Table Rows](#17-select-count-from-tablename)
18. [Show Owned Tables](#18-select-tablename-from-user_tables)
19. [Format Column Display](#19-column-column_name-format-format_specification)
20. [Write Output to File](#20-spool-filename)

---

### 1. `SELECT * FROM TAB`
This is used to fetch or display all the tables and views from the current database schema.

```sql
SELECT * FROM TAB;
```

---

### 2. `SELECT SYSDATE FROM DUAL`
This is used to retrieve the current system date and time. The `DUAL` table is a special built-in table used for selecting system values or performing calculations.

```sql
SELECT SYSDATE FROM DUAL;
```

---

### 3. `SELECT USER FROM DUAL`
This returns the username of the current Oracle session.

```sql
SELECT USER FROM DUAL;
```

---

### 4. `SELECT LENGTH('string') FROM DUAL`
This returns the length of the specified string.

```sql
SELECT LENGTH('string') FROM DUAL;
```

---

### 5. `SELECT * FROM USER_TABLES`
This is used to display all the tables owned by the current user.

```sql
SELECT * FROM USER_TABLES;
```

---

### 6. `DESC table_name`
This describes the structure of the given table, showing columns, data types, and constraints.

```sql
DESC table_name;
```

---

### 7. `SHOW USER`
This displays the current user logged into the session.

```sql
SHOW USER;
```

---

### 8. `SET PAGESIZE n`
This command sets the number of lines per page in query output. `n` is the number of lines.

```sql
SET PAGESIZE n;
```

---

### 9. `SET LINESIZE n`
This sets the width of the output for each line to `n` characters.

```sql
SET LINESIZE n;
```

---

### 10. `SET FEEDBACK ON/OFF`
This turns the display of row count information after SQL execution on or off.

```sql
SET FEEDBACK ON;
```
or
```sql
SET FEEDBACK OFF;
```

---

### 11. `SET HEADING ON/OFF`
This turns the display of column headers in query results on or off.

```sql
SET HEADING ON;
```
or
```sql
SET HEADING OFF;
```

---

### 12. `SET VERIFY ON/OFF`
This controls whether SQL*Plus displays substitution variables in queries before execution.

```sql
SET VERIFY ON;
```
or
```sql
SET VERIFY OFF;
```

---

### 13. `SET ECHO ON/OFF`
This controls whether SQL*Plus displays the commands in a script file as they are executed.

```sql
SET ECHO ON;
```
or
```sql
SET ECHO OFF;
```

---

### 14. `SET SERVEROUTPUT ON`
This enables the output from `DBMS_OUTPUT.PUT_LINE` or other PL/SQL blocks to be displayed on the console.

```sql
SET SERVEROUTPUT ON;
```

---

### 15. `SELECT * FROM ALL_TABLES`
This displays all the tables accessible to the current user, including tables owned by other users.

```sql
SELECT * FROM ALL_TABLES;
```

---

### 16. `SET SQLPROMPT`
This customizes the SQL prompt.

```sql
SET SQLPROMPT 'custom_prompt> ';
```

---

### 17. `SELECT COUNT(*) FROM table_name`
This counts the number of rows in the specified table.

```sql
SELECT COUNT(*) FROM table_name;
```

---

### 18. `SELECT table_name FROM user_tables`
This is used to retrieve the names of tables owned by the user.

```sql
SELECT table_name FROM user_tables;
```

---

### 19. `COLUMN column_name FORMAT format_specification`
This sets the display format for a column in query results.

```sql
COLUMN column_name FORMAT A20;
```

---

### 20. `SPOOL file_name`
This is used to write output to a file rather than the console.

```sql
SPOOL output_file_name.txt;
```

---


```
