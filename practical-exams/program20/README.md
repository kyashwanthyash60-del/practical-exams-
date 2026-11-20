# Program 20: Spring Boot REST CRUD with MongoDB

Requirements: JDK 17+, MongoDB Server and STS.

Start MongoDB. Import this folder into STS as an Existing Maven Project. Run `Program20Application.java` as Spring Boot App.

REST base URL: `http://localhost:8086/students`
- GET `/students`
- POST `/students` JSON: `{"regNo":"201","name":"Kiran","branch":"CSE"}`
- PUT `/students/{id}` with the updated student JSON
- DELETE `/students/{id}`

MongoDB database: `program20db`, collection: `students`.
