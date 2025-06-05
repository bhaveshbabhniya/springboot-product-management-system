# Spring Boot Product Management System

This is a mid-level **Product Management System** built with **Spring Boot**, **MySQL**, and **Spring Data JPA**. It provides a REST API to manage product records, including support for insert, filtering, updating, and deleting products.

📁 Project Path: [`/product_management_system`](https://github.com/bhaveshbabhniya/springboot-product-management-system)

---

## 🚀 Features

- Create products
- Get product by ID
- Get all products
- Update product details
- Delete product by ID
- DTO-based structure
- Validation using Jakarta Validation
- Clean layered architecture (Controller, Service, Repository)

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven (Dependency Management)
- Jakarta Validation
- Lombok
- Postman for testing

---

## 📂 Project Structure
```
springboot-product-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── springboot/
│   │   │           └── product_management_system/
│   │   │               ├── controller/
│   │   │               │   └── ProductController.java
│   │   │               │
│   │   │               ├── dto/
│   │   │               │   ├── ProductDTO.java
│   │   │               │
│   │   │               ├── entity/
│   │   │               │   └── Product.java
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── ProductRepository.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   ├── ProductService.java
│   │   │               │   └── ProductServiceImpl.java
│   │   │               │
│   │   │               └── ProductManagementSystemApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
├── pom.xml
└── README.md
```
---

## ⚙️ Setup Instructions

- Java 17+
- Maven 3.6+
- MySQL Server
- Postman (for API testing)
- Git (optional, for cloning)

### 1. Clone the Repository
```bash
git clone https://github.com/bhaveshbabhniya/springboot-product-management-system.git
cd springboot-product-management-system
```

### 2. Create database in MYSQL
```bash
CREATE DATABASE productsdb;
```
Update your application.properties file with your MySQL credentials:
```
spring.datasource.username=root
spring.datasource.password=your_password
```

### 3. ▶️ Run the Application
```bash
./mvnw spring-boot:run
```
Or in Eclipse IDE, run ProductManagementSystemApplication.java as a Java application.

---

## 📫 API Endpoints
```
GET | /api/products            #Get all Products
GET | /api/products/{id}       #Get product by ID
POST | /api/products           #Create new product
PUT | /api/products/{id}       #Update existing product
DELETE | /api/products/{id}    #Delete product by ID
```
### 🧪 Sample JSON for Testing
✅ Add Product (POST /api/products)
```
{
    "name": "John Doe",
    "position": "Developer",
    "salary" : 3000
}
```

## 🧪 Postman Collection

You can test the API using this ready-to-use Postman collection:

👉 [Click here to view in Postman](https://www.postman.com/lunar-module-observer-2885265/workspace/springboot/collection/19566605-e005393f-4d44-46da-9a25-e11459328e7f?action=share&creator=19566605)

To use:
- Open the link
- Click **"Fork"** or **"Import"** to your own workspace
- Make sure to update the environment variables (like `{{base_url}}`) if needed

---

# 📌 Notes
- Lombok must be installed and enabled in your IDE.
- Make sure MySQL is running and accessible.
- Consider securing the endpoints for production use.

---

# 👤 Author
  Bhavesh Babhniya
🔗 [`GitHub`](https://github.com/bhaveshbabhniya)
