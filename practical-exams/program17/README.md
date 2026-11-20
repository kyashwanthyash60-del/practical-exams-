# Program 17: Spring Boot REST CRUD with MySQL

## Requirements
JDK 17+, MySQL Server and STS. Create database `program17_db` in MySQL Workbench or let the JDBC option create it if your MySQL user has permission.

## Configure
Edit `src/main/resources/application.properties`. Replace `CHANGE_ME` with your local MySQL password. Never commit a real password to a public repository.

## Import and run
Import this folder in STS as Existing Maven Project. Wait for Maven dependencies. Run `Program17Application.java` as Spring Boot App.

Base URL: `http://localhost:8085/students`

## Test with Postman
- GET `/students`
- POST `/students` JSON: `{"regNo":"101","name":"Asha","branch":"CSE"}`
- PUT `/students/1` JSON: `{"regNo":"101","name":"Asha R","branch":"CSE"}`
- DELETE `/students/1`

The generated database table is `student`.
