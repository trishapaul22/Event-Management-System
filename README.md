# 🎉 Event Management System (Full Stack Project)

## 📌 Project Overview

The **Event Management System** is a full-stack web application designed to manage and display events across different departments. It allows users to browse events and enables administrators to securely add, update, and manage event details.

This project demonstrates real-world implementation of a **client-server architecture** using modern backend and frontend technologies.

---

## 🚀 Features

### 👤 User Features

* View events by department
* See event details (title, date, venue, description)
* View event posters
* Access registration links

### 🛠️ Admin Features

* Secure admin login
* Add new events
* Upload event posters
* Manage events dynamically

---

## 🧱 Tech Stack

### 🔹 Frontend

* HTML
* CSS
* JavaScript (Fetch API)

### 🔹 Backend

* Java (Spring Boot)
* REST APIs
* MVC Architecture

### 🔹 Database

* MySQL

---

## 🏗️ Project Structure

```
Event-Management-System/
│
├── backend/ (eventdashboard)
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   └── config/
│
├── frontend/ (frontendems)
│   ├── index.html
│   ├── admin-dashboard.html
│   ├── admin-login.html
│   └── department-events.html
```

---

## 🔄 Workflow

1. User selects a department from frontend
2. Frontend sends API request to backend
3. Backend processes request using service layer
4. Data is fetched from MySQL database
5. Response is sent back as JSON
6. Frontend dynamically displays events

---

## 🔐 Security Features

* Admin authentication
* Role-based access (Admin/User)
* CORS configuration for secure API communication

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/Event-Management-System.git
```

### 2️⃣ Backend Setup

* Open backend folder in IDE
* Configure database in `application.properties`
* Run Spring Boot application

### 3️⃣ Frontend Setup

* Open frontend folder
* Run HTML files in browser

---

---

⭐ If you like this project, give it a star on GitHub!
