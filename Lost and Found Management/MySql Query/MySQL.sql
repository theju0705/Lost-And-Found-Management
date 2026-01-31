DROP DATABASE Items;
CREATE DATABASE Items;
USE Items;
CREATE TABLE lost_items (
    lost_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(50),
    category VARCHAR(30),
    lost_date DATE,
    location VARCHAR(50)
);
CREATE TABLE found_items (
    found_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(50),
    category VARCHAR(30),
    found_date DATE,
    location VARCHAR(50)
);
SHOW TABLES;
