# Task 3 – Library Management System (Using OOP)

## Date
07/08/2025

## Objective
Design and implement a **Java-based Library Management System** using **OOP principles** in Eclipse IDE.

--------------------------

## Tools & Technologies
- Java (JDK 8 or above)
- Eclipse IDE
- Console-based interaction

-----------------------------

## Key OOP Concepts Used
-  Encapsulation
-  Abstraction
-  Inheritance
-  Polymorphism

----------------------------

## Class Structure

### Book.java
- Fields: `id`, `title`, `author`, `isIssued`
- Methods: `issueBook()`, `returnBook()`, `toString()`

### User.java
- Fields: `userId`, `name`, `ArrayList<Book> issuedBooks`
- Methods: `issueBook(Book)`, `returnBook(Book)`, `displayIssuedBooks()`

### Library.java
- Fields: `ArrayList<Book> books`, `ArrayList<User> users`
- Methods: `addBook()`, `removeBook()`, `listBooks()`, `issueBook()`, `returnBook()`

### Main.java
- CLI menu: Add, Remove, Issue, Return, View Books

-----------------------------

## Folder Structure (Eclipse)
LibraryManagementSystem/
├── src/
│ └── library/
│ ├── Book.java
│ ├── User.java
│ ├── Library.java
│ └── Main.java
└── README.md

-----------------------------

## How to Run (In Eclipse)

1. Open **Eclipse IDE**
2. **File → New → Java Project** → Name: `LibraryManagementSystem`
3. **Right-click `src` → New → Package** → Name: `library`
4. Create these Java classes inside the package:
   - `Book.java`
   - `User.java`
   - `Library.java`
   - `Main.java`
5. Paste respective code into each file
6. **Right-click `Main.java` → Run As → Java Application**

-------------------------------

## Sample Menu Options (Main.java)

------ Library Management System -------
1.Add Book
2.Remove Book
3.Issue Book
4.Return Book
5.View Available Books
6.Exit

-------------------------------

## Sample Answer
Book added: ID: 1, Title: Java, Author: Sai
Book issued successfully!
Available books: ID: 2, Title: OOP in Java, Author: Jnanesh

--------------------------------

## Outcome
By completing this task, you’ll:
- Understand real-world application of **OOP principles**
- Use **ArrayList** to manage collections of objects
- Build a **modular, scalable CLI application** in Java
