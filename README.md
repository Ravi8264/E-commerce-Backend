# E-commerce Backend

A robust and scalable E-commerce Backend application built with Spring Boot and PostgreSQL.

## 🚀 Features

- **User Management**

  - User registration and authentication
  - Role-based access control (Admin/User)
  - Secure password handling
  - User profile management

- **Product Management**

  - CRUD operations for products
  - Product categorization
  - Stock management
  - Image handling for products
  - Product search functionality

- **Database**
  - PostgreSQL database integration
  - JPA/Hibernate for data persistence
  - Efficient data modeling

## 🛠️ Technologies Used

- Java 21
- Spring Boot 3.2.3
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Docker

## 📋 Prerequisites

- Java 21 or higher
- Maven
- PostgreSQL
- Docker (optional)

## 🔧 Installation

1. Clone the repository

```bash
git clone https://github.com/Ravi8264/E-commerce-Backend.git
```

2. Configure PostgreSQL

   - Create a database named 'Ecommerce'
   - Update application.properties with your database credentials

3. Build the project

```bash
mvn clean install
```

4. Run the application

```bash
mvn spring-boot:run
```

## ⚙️ Configuration

The application can be configured through `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/Ecommerce
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## 📚 API Documentation

### Customer Endpoints

- `GET /api/customer/all` - Get all customers
- `GET /api/customer/{id}` - Get customer by ID
- `POST /api/customer/signin` - Register new customer
- `POST /api/customer/login` - Customer login
- `PUT /api/customer/{id}` - Update customer
- `DELETE /api/customer/{id}` - Delete customer
- `GET /api/customer/email/{email}` - Get customer by email

### Product Endpoints

- `GET /api/product/all` - Get all products
- `GET /api/product/{id}` - Get product by ID
- `GET /api/product/{id}/image` - Get product image
- `GET /api/product/search` - Search products
- `POST /api/product` - Add new product
- `PUT /api/product/{id}` - Update product
- `DELETE /api/product/{id}` - Delete product

## 🐳 Docker Support

Build and run using Docker:

```bash
docker build -t ecommerce-backend .
docker run -p 8080:8080 ecommerce-backend
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👥 Authors

- **Ravi** - _Initial work_ - [Ravi8264](https://github.com/Ravi8264)

## 🙏 Acknowledgments

- Spring Boot Team
- PostgreSQL Community
- All contributors who have helped in the development of this project
