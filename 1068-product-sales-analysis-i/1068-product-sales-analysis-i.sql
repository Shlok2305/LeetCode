SELECT E.PRODUCT_NAME , S.YEAR ,S.PRICE
FROM Sales S
INNER JOIN Product E
ON S.product_id = E.product_id;
