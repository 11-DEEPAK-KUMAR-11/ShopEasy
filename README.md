# ShopEasy
E-commerce Application

E-commerce Application that is used for the buying and selling of products. This application can be used by various buyers and sellers to buy or sale products.


## Tech Stack

- Core Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- PostMan
- Swagger
- Lombok

## User Module

# User should  be able to perform below operations:  

- Search functionality
- Search by category
- Add to cart
- See cart details and total price in it
- Make a purchase, and track status
- Payment ,Checkout pages
- Login, Register Pages 

## Admin Module

# Admin should be able to perform below operations:

- Product List
- Add new products
- Update Products
- User management
- See users, and details
- admin and users ( different login )

### Features

## Authentication and validation for customer and admin using the session uuid.

# Admin Features :

  - Role of the entire application's administrator.
  - Only logged-in admin with active session tokens can add, update, or delete customers, products and orders from the main database.
  - The admin has access to information on various customers, products and orders, etc.

# Customer Features :

  - On the platform, a customer can register and update their details.
  - Customer can add the product to the cart.
  - After adding the product to a cart, he can buy a product.  
  - The customer has the option to remove the product from the cart.

## Installation & Run

- You need update the database configuration in the application.properties file before launching the API server.
- Change the port number, username, and password to match your local database configuration.

```
    server.port=8889

    spring.datasource.url=jdbc:mysql://localhost:3306/shopEasy;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=3511

```

## API Root Endpoint

`http://localhost:8889/swagger-ui/`

## API Module Endpoints

### Login Module

- `POST //api/userlogin` : Customer can login with mobile number and password provided at the time of registation

### Sample API Response for Customer Login

`POST localhost:8089/admin/login`

- Request Body

```
	{
  		"adminId": 1,
  		"password": "qwerty123"
	}
```

- Response

```
   CurrentAdminSession(userId=2, uuid=WcEy8Z, localDateTime=2022-11-30T16:01:29.137960400)

```

## Video Explainer of flow control

<a href="https://drive.google.com/file/d/1Rd4X7QPTFs5r3PWmyLEfo6529FRw_oXs/view?usp=sharing">**Video Drive Link** </a> 

### E-R Diagram Of Ecommerce API

---

<!-- ![E-R Diagram](https://user-images.githubusercontent.com/36689521/204775807-af1af7f7-e7a4-4cf5-ba44-f8d145512229.png) -->
![ER-3](https://user-images.githubusercontent.com/101390725/204780741-7c8f1719-aef2-487e-b71c-47bfb03473c1.png)


---

### Swagger UI

---

![1](https://user-images.githubusercontent.com/36689521/204775957-97b0b6e9-7eac-4a52-8dec-3036bcf922e0.png)

---

### Admin Controller

---

![2](https://user-images.githubusercontent.com/36689521/204776180-c20e7aae-af75-400a-be59-e12c2947d5c4.png)

---

### Customer Controller

---

![3](https://user-images.githubusercontent.com/36689521/204776471-93b31bcc-37bf-444e-9223-991c3206c8e5.png)

---

### Order Controller

---

![4](https://user-images.githubusercontent.com/36689521/204776721-dcadef7a-8b84-4839-8f51-12cdf8c29928.png)

---

### Product Controller

---

![5](https://user-images.githubusercontent.com/36689521/204778140-2bf511b3-37a5-4739-9f2f-86cffc63aa2d.png)

---

 ![6](https://user-images.githubusercontent.com/36689521/204778350-49507557-c070-477b-a571-052fc593ea72.jpg)

---
