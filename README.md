# Spring Boot Project

## Overview
This is a basic Spring Boot project that demonstrates the use of Spring MVC, Spring Data JPA, and Spring Security. The project includes entities for `Student` and `Subject`, with REST APIs to manage these entities.

## Project Setup

1. **Clone the Repository**
2. **Build the Project**
Make sure you have Maven installed and then run:
3. **Run the Application**
Run the Spring Boot application with:
The application will start on port `8080` by default.

## REST API Endpoints

### Student

- **Create Student**
- **POST** `/students`
- **Request Body:**
 ```json
 {
   "name": "John Doe",
   "address": "123 Main St"
   "subjectIds": [1,2]
 }
 ```
- **POST** `/students/bulk`
- - **Request Body:**
 ```json
[
{
   "name": "John Doe",
   "address": "123 Main St"
    "subjectIds": [1,2,3]
 },
{
   "name": "John Doe new",
   "address": "123 Main St123"
   "subjectIds": [1,2]
 }
]

- **Get All Students**
- **GET** `/students`

### Subject

- **Create Subject**
- **POST** `/subjects`
- **Request Body:**
 ```json
 {
   "name": "Mathematics"
 }
 ```
- **POST** `/subjects/bulk`
- **Request Body:**
 ```json
   [
    {
       "name": "Mathematics"
    },
    {
         "name": "English"
    },
    {
       "name": "Hindi"
    }
  ]
```

- **Get All Subjects**
- **GET** `/subjects`

## Database
The application uses an H2 in-memory database. You can access the H2 console at:
http://localhost:8080/h2-console

The JDBC URL is `jdbc:h2:mem:mydb`, and the username is `sa` with no password.

## Security
Security part is left.
