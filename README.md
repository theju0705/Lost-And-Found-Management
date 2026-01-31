🔍 **Lost & Found Management System**

📖 Description

The **Lost & Found Management System** is a Java–MySQL based application developed to manage lost and found items within a college campus or organization. The system allows users to add details of lost and found items and stores them securely in a MySQL database using JDBC. It applies SQL JOIN logic to match items based on category and location, helping users identify possible matches efficiently.

This project is beginner-friendly and demonstrates real-world use of Java, JDBC, and SQL.

---

🎯 Features

* Add lost item details
* Add found item details
* Store records in MySQL database
* Match lost and found items using SQL JOIN
* Console-based output for simplicity
* Clean and modular Java code structure

---

🛠️ Technologies Used

* **Java (Core Java)**
* **JDBC (MySQL Connector/J)**
* **MySQL**
* **Eclipse IDE**
* **MySQL Workbench**

---

🗂️ Project Structure

```
LostAndFoundSystem
│
├── AddLostItem.java
├── AddFoundItem.java
├── DBConnection.java
├── MatchItem.java
├── MainApp.java
├── TestConnection.java
└── MySQL.sql
```

---

🗄️ Database Details

**Database Name:** `lost_found_db`

Tables:

* `lost_items`
* `found_items`

Each table stores item name, category, date, and location.

---

▶️ How to Run the Project

1. Install **MySQL** and start the MySQL server
2. Execute the SQL script (`MySQL.sql`) in MySQL Workbench
3. Open the project in **Eclipse IDE**
4. Add **MySQL Connector/J** to the project build path
5. Update database credentials in `DBConnection.java`
6. Run `TestConnection.java` to verify DB connection
7. Run `MainApp.java` to execute the project

---

✅ Sample Output

```
Database Connected
Lost item added
Found item added
Matching Items:
Wallet | Accessories | Library
```

---

🧠 Learning Outcomes

* JDBC database connectivity
* SQL INSERT and SELECT operations
* SQL INNER JOIN usage
* Java class and package organization
* Real-world problem solving

---

🚀 Future Enhancements

* Swing or JavaFX user interface
* Admin verification system
* User login and authentication
* Image upload for items
* Status tracking (Matched / Unmatched)

---

👩‍💻 Author
Thejas
