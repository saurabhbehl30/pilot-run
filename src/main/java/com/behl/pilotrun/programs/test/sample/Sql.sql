select e. name from employee inner join department d on e.id = d.id;


| user_id | username    |
|---------|-------------|
| 1       | Alice       |
| 2       | Bob         |
| 3       | Charlie     |


| follower_id | user_id | follower_username |
|-------------|---------|-------------------|
| 101         | 1       | Bob               |
| 102         | 1       | Charlie           |
| 103         | 2       | Alice             |


 charlie has no followers .. so left join to find all users and their followers:

 select u.username from users u left join  followers f on u.user_id = f.user_id

 result -

 | user_id | username | follower_username |
 |---------|----------|-------------------|
 | 1       | Alice    | Bob               |
 | 1       | Alice    | Charlie           |
 | 2       | Bob      | Alice             |
 | 3       | Charlie  | NULL              |



 | order_id | product_id | quantity |
 |----------|------------|----------|
 | 1        | 101        | 2        |
 | 2        | 102        | 1        |
 | 3        | 103        | 3        |


| product_id | product_name | price |
|------------|--------------|-------|
| 101        | Laptop       | 800   |
| 102        | Smartphone   | 500   |
| 103        | Headphones   | 100   |
| 104        | Tablet       | 300   |


SELECT Orders.order_id, Products.product_name, Orders.quantity, Products.price
FROM Orders
INNER JOIN Products ON Orders.product_id = Products.product_id;




