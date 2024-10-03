
# Questions on ORDER BY Clause

> **Note:** Candidates should be aware of subqueries.

### 1. WAQTD details of the product if the price of the product is more than 25000, arrange the records according to quantity in ascending.
```sql
SELECT *
FROM PRODUCT
WHERE PRICE > 25000
ORDER BY QUANTITY ASC;
```

### 2. WAQTD names and category of the products if the product discount is less than 50%, arrange the records according to price in descending.
```sql
SELECT PNAME, CATEGORY
FROM PRODUCT
WHERE DISCOUNT < '50%'
ORDER BY PRICE DESC;
```

### 3. WAQTD details of the customer if product quantity is more than 10, arrange the records according to customer_id in descending.
```sql
SELECT *
FROM CUSTOMER
WHERE PID IN (SELECT PID FROM PRODUCT WHERE QUANTITY > 10)
ORDER BY CID DESC;
```

### 4. WAQTD name and price along with actual_price if the actual_price is less than the price of 'SAMSUNG-F235G', arrange the records according to discount in ascending.
```sql
SELECT PNAME, PRICE, ACTUAL_PRICE
FROM PRODUCT
WHERE ACTUAL_PRICE < (SELECT ACTUAL_PRICE FROM PRODUCT WHERE PNAME = 'SAMSUNG-F235G')
ORDER BY DISCOUNT ASC;
```

### 5. WAQTD names and address of the customer who have product_id less than 'DINESH', arrange the records according to customer name in descending.
```sql
SELECT CNAME, ADDRESS
FROM CUSTOMER
WHERE PID < (SELECT PID FROM CUSTOMER WHERE ENAME = 'DINESH')
ORDER BY CNAME DESC;
```

### 6. WAQTD name, quantity and warranty of products if product quantity is less than 'HP-CELERON', arrange the records according to actual_price in descending.
```sql
SELECT PNAME, QUANTITY, WARRANTY
FROM PRODUCT
WHERE QUANTITY < (SELECT QUANTITY FROM PRODUCT WHERE PNAME = 'HP-CELERON')
ORDER BY ACTUAL_PRICE DESC;
```

### 7. WAQTD details of the customer if customer id is more than 'ANAND', arrange the records according to product_id in ascending.
```sql
SELECT *
FROM CUSTOMER
WHERE CID > (SELECT CID FROM CUSTOMER WHERE CNAME = 'ANAND')
ORDER BY PID ASC;
```

### 8. WAQTD name, quantity and discount of the product if the quantity is more than '5' and warranty is less than '4YEARS', arrange the records according to price in ascending and discount in descending.
```sql
SELECT PNAME, QUANTITY, DISCOUNT
FROM PRODUCT
WHERE QUANTITY > 5 AND WARRANTY < '4YEARS'
ORDER BY PRICE ASC, DISCOUNT DESC;
```

### 9. WAQTD details of the products if the product discount is more than 'SAMSUNG-F235G' and less than 'IPHONE13', arrange the records according to price in descending and quantity in ascending.
```sql
SELECT *
FROM PRODUCT
WHERE DISCOUNT > (SELECT DISCOUNT FROM PRODUCT WHERE PNAME = 'SAMSUNG-F235G') AND
      DISCOUNT < (SELECT DISCOUNT FROM PRODUCT WHERE PNAME = 'IPHONE13')
ORDER BY PRICE DESC, QUANTITY ASC;
```

### 10. WAQTD name, price, discount and warranty of the product if warranty is more than 'INFINIX-NOTE12PRO' but less than 'DELL-INSPIRON' and quantity of product should be more than product_id '2', arrange the records according to price in ascending and product_id in descending.
```sql
SELECT PNAME, PRICE, DISCOUNT, WARRANTY
FROM PRODUCT
WHERE WARRANTY > (SELECT WARRANTY FROM PRODUCT WHERE PNAME = 'INFINIX-NOTE12PRO') AND
      WARRANTY < (SELECT WARRANTY FROM PRODUCT WHERE PNAME = 'DELL-INSPIRON') AND
      QUANTITY > (SELECT QUANTITY FROM PRODUCT WHERE PID = 2)
ORDER BY PRICE ASC, PID DESC;
```

### 11. What are the details of teachers who are earning a salary? Arrange the salary in descending order.
```sql
SELECT *
FROM TEACHER
WHERE SALARY IS NOT NULL 
ORDER BY SALARY DESC;
```

### 12. What are the names and branches of students who are from Bangalore? Arrange the records according to student ID in descending order.
```sql
SELECT SNAME, BRANCH
FROM STUDENT
WHERE LOCATION = 'BANGLORE'
ORDER BY SID DESC;
```

### 13. What are the name, hire date, and experience of teachers who were hired after Harish? Arrange the records according to experience in ascending order.
```sql
SELECT TNAME, HIREDATE, EXPERIENCE
FROM TEACHER
WHERE HIREDATE > (SELECT HIREDATE
                  FROM TEACHER
                  WHERE TNAME = 'HARISH')
ORDER BY EXPERIENCE ASC;
```

### 14. What are the name, date of birth, and phone number of students who have the character 'A' in their location? Arrange records according to date of birth in ascending order.
```sql
SELECT SNAME, DOB, PH_NO
FROM STUDENT
WHERE LOCATION LIKE '%A%'
ORDER BY DOB ASC;
```

### 15. What are the details of teachers who are earning more than 29,000 but less than 50,000 and have more than 3 years of experience? Arrange the records according to their teacher ID in descending order.
```sql
SELECT *
FROM TEACHER
WHERE SALARY BETWEEN 29001 AND 49999 
  AND EXPERIENCE > 3 
ORDER BY TID DESC;
```

### 16. What are the name, salary, and experience of teachers who are earning less than Kumar? Arrange the records according to their experience in ascending order.
```sql
SELECT TNAME, SALARY, EXPERIENCE
FROM TEACHER
WHERE SALARY < (SELECT SALARY
                FROM TEACHER
                WHERE TNAME = 'KUMAR')
ORDER BY EXPERIENCE ASC;
```

### 17. What are the name, branch, phone number, and gender of students whose teacher has more than 2 years of experience? Arrange the records according to phone number.
```sql
SELECT SNAME, BRANCH, PH_NO, GENDER
FROM STUDENT
WHERE TID IN (SELECT TID
               FROM TEACHER
               WHERE EXPERIENCE > 2)
ORDER BY PH_NO ASC;
```

### 18. What are the details of the students who are studying in the branch 'ME-CS' and are from Delhi or Chennai? Arrange the records according to the age of students in ascending order.
```sql
SELECT *
FROM STUDENT
WHERE BRANCH = 'ME-CS' 
  AND LOCATION IN ('DELHI', 'CHENNAI')
ORDER BY AGE ASC;
```

### 19. What are the details of the students who are from locations except Bangalore and have the character 'E' in their branch? Arrange the records according to student ID in ascending and age in descending order.
```sql
SELECT *
FROM STUDENT
WHERE LOCATION NOT IN ('BANGLORE') 
  AND BRANCH LIKE '%E%' 
ORDER BY SID ASC, AGE DESC;
```

### 20. What are the name and salary of teachers who are earning more than Harish but were hired before Ram? Arrange the records according to their salary in descending and age in ascending order.
```sql
SELECT TNAME, SALARY
FROM TEACHER
WHERE SALARY > (SELECT SALARY
                FROM TEACHER
                WHERE TNAME = 'HARISH') 
  AND HIREDATE < (SELECT HIREDATE
                  FROM TEACHER
                  WHERE TNAME = 'RAM')
ORDER BY SALARY DESC, AGE ASC;
```
