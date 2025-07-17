# Employee Management System

A Spring Boot web application with Thymeleaf and MySQL to manage employee records via CRUD operations.

---

## 🎯 Features

- Add, view, update, and delete employee records  
- MVC architecture with `Controller` → `Service` → `Repository`  
- Server-side rendering using Thymeleaf templates  
- Form validation, clean user interface  
- Screenshots included to showcase key views

---

## 🛠️ Tech Stack

| Layer       | Technologies                      |
|-------------|-----------------------------------|
| Backend     | Spring Boot, Java                 |
| Frontend    | Thymeleaf, HTML, CSS              |
| Database    | MySQL                             |
| Build Tool  | Maven                             |
| Versioning  | Git, GitHub                       |

---

## 🚀 Setup & Run

1. **Clone the repo**  
   ```bash
   git clone https://github.com/Saikumar-Ravirala/employee-management-springboot.git
   cd employee-management-springboot
2. **Prepare the database (MySQL)**
   CREATE DATABASE employee_db;
   Update src/main/resources/application.properties with your MySQL credentials.
3. **Build & run application**
    mvn clean install
    mvn spring-boot:run
    Access the app at http://localhost:8080.

---

## 🖼️ Screenshots

**Home Page**

   <img src="imgs/employee-management-img1.PNG" width="100%" height="500" />

 **Add Employee Form**
 
   <img src="imgs/employee-management-img2.PNG" width="500" height="500" />

---

## 🧩 Project Structure

src/
├── main/
│   ├── java/com/sai/springboot/cruddemo/
│   │   ├── controller/
│   │   ├── entity/
│   │   ├── repository/
│   │   └── service/
│   └── resources/
│       ├── templates/   ← Thymeleaf HTML views
│       └── application.properties
└── test/

