
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
