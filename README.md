# Relationships
## @One-To-One
+ **Account** has one **Balance**

![img.png](screenshots/img.png)

+ **Balance** belongs to **Account**

![img_1.png](screenshots/img_1.png)

## @One-To-Many и @Many-To-One
+ **User** has many **Account**

![img_2.png](screenshots/img_2.png)

+ **Account** belongs to **User**

![img_3.png](screenshots/img_3.png)

## @Many-To-Many (1-st option)

**User** owns **Product**:

![img_4.png](screenshots/img_4.png)

**Product** belongs to **User**:

![img_5.png](screenshots/img_5.png)

## @Many-To-Many (2-nd option)
**UserItem** table:

![img_7.png](screenshots/img_7.png)

**User**:

![img_8.png](screenshots/img_8.png)

**Item**:

![img_9.png](screenshots/img_9.png)