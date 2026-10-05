
#  Student Management CRUD System

A production-ready, full-stack Student Management System built using **Spring Boot**, **Java 21**, **Spring Data JPA**, and **MySQL**, featuring a clean layered architecture and a responsive frontend web UI.

---

##  Key Features

- **Full CRUD Functionality:** Create, Read, Update, and Delete student records in real time.
- **Layered Architecture:** Clear separation of concerns across Controller, Service, Repository, Entity, DTO, and Config layers.
- **DTO Pattern:** Clean encapsulation of internal database models from API payload structures.
- **CORS Support:** Pre-configured Cross-Origin Resource Sharing policy for modern frontend frameworks.
- **Embedded Web Client:** Interactive, responsive HTML5, CSS3, and JavaScript UI included directly in static resources.
- **Auto Schema Generation:** Hibernate automatically creates and synchronizes database tables upon startup.

---

##  Architecture & Project Structure

The project strictly follows the industry-standard Spring Boot layered architecture:

com.example.studentcrud
│
├── config/              # Security and CORS Configuration
│   └── CorsConfig.java
│
├── controller/          # REST Endpoints (@RestController)
│   └── StudentController.java
│
├── dto/                 # Data Transfer Objects
│   ├── StudentRequestDTO.java
│   └── StudentResponseDTO.java
│
├── entity/              # JPA Database Models (@Entity)
│   └── Student.java
│
├── repository/          # Spring Data JPA Repositories
│   └── StudentRepository.java
│
├── service/             # Business Logic Interfaces and Implementations
│   ├── StudentService.java
│   └── impl/
│       └── StudentServiceImpl.java
│
└── StudentCrudApplication.java   # Main Application Entry Point

### Data Flow Pipeline:
Browser UI  ──(HTTP Requests)──>  Controller  ──(RequestDTO)──>  Service  ──(Entity Model)──>  Repository  ──(SQL)──>  MySQL Database

---

##  Tech Stack

- **Backend Framework:** Spring Boot 4.x / 3.x
- **Language:** Java 21
- **Persistence Framework:** Spring Data JPA / Hibernate ORM
- **Database:** MySQL 8.x
- **Frontend Technologies:** HTML5, CSS3, JavaScript (Fetch API)
- **Build Automation:** Apache Maven
- **Version Control:** Git & GitHub

---

##  REST API Specifications

Base URL: http://localhost:8080/api/students (also mapped to /api/v1/students)

| Method | Endpoint | Description | Status Code |
| :--- | :--- | :--- | :--- |
| **POST** | /api/students | Create a new student record | **201 Created** |
| **GET** | /api/students | Retrieve all student records | **200 OK** |
| **GET** | /api/students/{id} | Retrieve a specific student by ID | **200 OK** |
| **PUT** | /api/students/{id} | Update an existing student record | **200 OK** |
| **DELETE** | /api/students/{id} | Delete a student record by ID | **204 No Content** |

### Sample Request Payload (POST / PUT):
```json
{
  "name": "Ravindu Anushka",
  "course": "Software Engineering"
}
```

### Sample Response Payload:
```json
{
  "id": 1,
  "name": "Ravindu Anushka",
  "course": "Software Engineering"
}
```

---

##  Setup & Execution Guide

### 1. Prerequisites
- **JDK 21** or later installed
- **MySQL Server 8.0+** running locally
- **Git** and **Maven**

### 2. Database Initialization
Log in to MySQL (via MySQL Workbench or MySQL CLI) and execute:

CREATE DATABASE student_db;

*(Hibernate automatically creates and manages all table schemas upon launching the application).*

### 3. Running the Application
Using the Maven Wrapper in your terminal:

./mvnw spring-boot:run

Or open `StudentCrudApplication.java` and click the **Run (▶)** button in IntelliJ IDEA.

### 4. Accessing the Web Application
Once the application starts, navigate to the following URL in your web browser:

http://localhost:8080/

You can visually create, view, modify, and delete student records directly from the web interface.

---

##  Git Branching Strategy

This project was developed following Git flow best practices using isolated feature branches and Pull Requests:

- **feature/entity-layer**
- **feature/repository-layer**
- **feature/dto-layer**
- **feature/service-layer**
- **feature/controller-layer**
- **feature/config-layer**
- **feature/mysql-database**
- **feature/project-documentation**
```