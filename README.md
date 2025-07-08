# 📚 Student Management REST API (Spring Boot)

A simple Spring Boot application that provides a RESTful API for managing student records. It supports basic CRUD operations such as adding, retrieving, and deleting students.

---

## 🚀 Features

- ✅ Add a new student
- 📋 Get all students
- 🔍 Get student by roll number
- ❌ Delete student by object or by roll numbe

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL / H2 (choose any)
- Maven

---

## 📦 Endpoints

| Method | Endpoint                                | Description                    |
|--------|-----------------------------------------|--------------------------------|
| GET    | `/`                                     | Home page                      |
| GET    | `/about`                                | About this project             |
| GET    | `/student`                              | Info/entry point               |
| POST   | `/student/newStudent`                   | Add new student                |
| GET    | `/students`                             | Get all students               |
| GET    | `/student/{rollNumber}`                 | Get student by roll number     |
| DELETE | `/student/deleteStudent`                | Delete student by request body |
| DELETE | `/student/deleteStudent/{rollNumber}`   | Delete student by ID           |

---


```json
{
  "rollNumber": 101,
  "name": "John Doe",
  "graduationMarks": 78.5,
  "tenthMarks": 88,
  "twelfthMarks": 91
}
