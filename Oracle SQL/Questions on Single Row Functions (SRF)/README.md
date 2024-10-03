
# Questions on Single Row Functions (SRF)

1. **WAQTD details of the customer who are having more than 4 characters in their name.**  
   **ANS:** 
   ```sql
   SELECT * 
   FROM CUSTOMER
   WHERE LENGTH(CNAME) > 4;
   ```

2. **WAQTD details of the product, if product actual price is more than 4 digits and less than 7 characters in their category.**  
   **ANS:** 
   ```sql
   SELECT *
   FROM PRODUCT
   WHERE LENGTH(PRICE) > 4 AND LENGTH(CATEGORY) < 7;
   ```

3. **WAQTD join the given string ‘HI’ to all customer names.**  
   **ANS:** 
   ```sql
   SELECT CONCAT('HI ', CNAME)
   FROM CUSTOMER;
   ```

4. **WAQTD to join a string ‘HAPPY DIWALI’ to customer name, who are staying in the address which ends with ‘BTM’.**  
   **ANS:** 
   ```sql
   SELECT CONCAT('HAPPY DIWALI ', CNAME)
   FROM CUSTOMER
   WHERE ADDRESS LIKE '%BTM';
   ```

5. **WAQTD details of customers who have odd CID numbers.**  
   **ANS:** 
   ```sql
   SELECT *
   FROM CUSTOMER
   WHERE MOD(CID, 2) = 1;
   ```

6. **WAQTD name and price of the products, if the product price is in odd number and their product ID is in even.**  
   **ANS:** 
   ```sql
   SELECT PNAME, PRICE
   FROM PRODUCT
   WHERE MOD(PRICE, 2) = 1 AND MOD(PID, 2) = 0;
   ```

7. **WAQTD name, address, and mail ID of customers in upper case.**  
   **ANS:** 
   ```sql
   SELECT UPPER(CNAME), UPPER(ADDRESS), UPPER(MAIL_ID)
   FROM CUSTOMER;
   ```

8. **WAQTD name and category of products in lower case.**  
   **ANS:** 
   ```sql
   SELECT LOWER(PNAME), LOWER(CATEGORY)
   FROM PRODUCT;
   ```

9. **WAQTD name of customer in lower case and address in reverse, and mail ID should be initial letter in upper, remaining letters in lower, who are having alternative phone number.**  
   **ANS:** 
   ```sql
   SELECT LOWER(CNAME), REVERSE(ADDRESS), INITCAP(MAIL_ID)
   FROM CUSTOMER
   WHERE ALT_PH_NO IS NOT NULL;
   ```

10. **WAQTD round off actual price to the nearest value in the product table.**  
    **ANS:** 
    ```sql
    SELECT ROUND(ACTUAL_PRICE)
    FROM PRODUCT;
    ```

11. **WAQTD round off the price to the lowest value in the product table.**  
    **ANS:** 
    ```sql
    SELECT TRUNC(PRICE)
    FROM PRODUCT;
    ```

12. **WAQTD details of the customers who have more than 10 characters in their address.**  
    **ANS:** 
    ```sql
    SELECT *
    FROM CUSTOMER
    WHERE LENGTH(ADDRESS) > 10;
    ```

13. **WAQTD name and mail ID of the customers who have last character as ‘H’ in their name.**  
    **ANS:** 
    ```sql
    SELECT CNAME, MAIL_ID
    FROM CUSTOMER
    WHERE SUBSTR(CNAME, -1) = 'H';
    ```

14. **WAQTD name, price, quantity of products, if product name starts with character ‘I’.**  
    **ANS:** 
    ```sql
    SELECT PNAME, PRICE, QUANTITY
    FROM PRODUCT
    WHERE SUBSTR(PNAME, 1, 1) = 'I';
    ```

15. **WAQTD details of customers who have 2nd character as ‘A’ in their mail ID.**  
    **ANS:** 
    ```sql
    SELECT *
    FROM CUSTOMER
    WHERE SUBSTR(MAIL_ID, 2, 1) = 'A';
    ```

16. **WAQTD first half of customers' names.**  
    **ANS:** 
    ```sql
    SELECT SUBSTR(CNAME, 1, LENGTH(CNAME) / 2)
    FROM CUSTOMER;
    ```

17. **WAQTD second half of customer names.**  
    **ANS:** 
    ```sql
    SELECT SUBSTR(CNAME, LENGTH(CNAME) / 2 + 1)
    FROM CUSTOMER;
    ```

18. **WAQTD names and category of products, if they have character ‘O’ present in their category.**  
    **ANS:** 
    ```sql
    SELECT PNAME, CATEGORY	
    FROM PRODUCT
    WHERE INSTR(CATEGORY, 'O', 1, 1) > 0;
    ```

19. **WAQTD names, phone number, and alternative phone number of the customers, if they have character ‘A’ present at least twice in their name.**  
    **ANS:** 
    ```sql
    SELECT CNAME, PH_NO, ALT_PH_NO
    FROM CUSTOMER
    WHERE INSTR(CNAME, 'A', 1, 2) > 0;
    ```

20. **WAQTD all the products whose category starts with string ‘LAP’.**  
    **ANS:** 
    ```sql
    SELECT *
    FROM PRODUCT
    WHERE SUBSTR(CATEGORY, 1, 3) = 'LAP';
    ```

21. **WAQTD name of the customers by replacing character ‘A’ by ‘P’ in their name.**  
    **ANS:** 
    ```sql
    SELECT REPLACE(CNAME, 'A', 'P')
    FROM CUSTOMER;
    ```

22. **WAQTD details of the products, if they have character ‘A’ exactly twice in their product name.**  
    **ANS:** 
    ```sql
    SELECT *
    FROM PRODUCT
    WHERE (LENGTH(PNAME) - LENGTH(REPLACE(PNAME, 'A', ''))) = 2;
    ```

23. **WAQTD names and address of the customers whose name starts with vowels (all names are in upper case).**  
    **ANS:** 
    ```sql
    SELECT CNAME, ADDRESS
    FROM CUSTOMER
    WHERE SUBSTR(CNAME, 1, 1) IN ('A', 'E', 'I', 'O', 'U');
    ```

24. **WAQTD details of the customers whose address ends with consonants (all addresses are in upper case).**  
    **ANS:** 
    ```sql
    SELECT *
    FROM CUSTOMER
    WHERE SUBSTR(ADDRESS, -1) NOT IN ('A', 'E', 'I', 'O', 'U');
    ```

25. **WAQTD first 3 characters of name in lower case and remaining in upper case in customer table.**  
    **ANS:** 
    ```sql
    SELECT LOWER(SUBSTR(CNAME, 1, 3)) || UPPER(SUBSTR(CNAME, 4))
    FROM CUSTOMER;
    ```
