# 🧑‍🎓 Student Management System

A simple web-based Student Management System built using **Spring Boot**, **MySQL**, and **Thymeleaf**. This system allows you to **create**, **read**, **update**, and **delete (CRUD)** student records.

---

## 📌 Features

- Create a new student
- View all students
- Edit existing student information
- Delete a student
- Friendly error handling for invalid inputs
- Server-side validation using Spring MVC

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Thymeleaf
- Bootstrap 5

## 🔗 API Endpoints (Web Routes)

| Method | Path                     | Description                     |
|--------|--------------------------|---------------------------------|
| GET    | `/students`              | List all students               |
| GET    | `/students/new`          | Show form to create new student|
| POST   | `/students`              | Save new student                |
| GET    | `/students/edit/{id}`    | Show form to edit student       |
| POST   | `/students/{id}`         | Update existing student         |
| GET    | `/students/{id}`         | Delete a student                |

---



## 📸 Screenshots


### 🎯 Student List Page

![image](https://github.com/user-attachments/assets/b7ae0003-1b32-4f45-a3a9-523f57bb03f4)

### ➕ Add New Student Page

![Screenshot 2025-06-26 120731](https://github.com/user-attachments/assets/b442d33e-c83c-474f-b764-161733d6738d)

### ✏️ Edit Student Page

![image](https://github.com/user-attachments/assets/ad3bf6f2-f7d0-4bb3-94d9-f4df0a05c034)


### ⚠️ Error Page

![image](https://github.com/user-attachments/assets/1c99dc96-4319-47d6-b5bb-9c93cc2a7c6e)

















