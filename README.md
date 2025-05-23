
# 📚 Java Library Management System

A simple command-line **Library Management System** in Java to demonstrate key concepts like:

- **Java Collections** (`HashMap`, `ArrayList`)
- **Exception Handling**
- **Object-Oriented Programming (OOP)**

This project is designed for learning and revision purposes. It simulates basic operations of a library such as adding books, searching, borrowing, and returning books.

---

## 🛠️ Features

- Add books to the library
- List all available books
- Search books by:
  - ISBN
  - Title
  - Author
- Borrow a book (marks it unavailable)
- Return a borrowed book (marks it available again)
- Graceful error handling using custom exceptions

---

## 📂 Project Structure

java-library-management/
├── Book.java // Represents a book
├── Library.java // Core library logic using HashMap & ArrayList
└── LibraryApp.java // Main driver class (user interface)


---

## 🚀 How to Run

1. **Clone the repository** or copy the files.

2. Compile the Java files:
   ```bash
   javac *.java

3. Run the application:
   java LibraryApp

🎯 Sample Output

📚 Welcome to ChunChun's Library 📚

Choose an option:
1. List all books
2. Search by ISBN
3. Search by Title
4. Search by Author
5. Borrow a Book
6. Return a Book
7. Exit
Enter choice:

🧠 Learning Objectives
This project helps you practice and understand:

Efficient lookup with HashMap

Flexible searching using ArrayList filters

Exception handling (try-catch, custom exceptions)

Java class design and real-world modeling

👨‍💻 Author
ChunChun – Future Backend Developer 🚀
Learning Java one project at a time.


📌 Notes
This is a beginner-friendly project and can be extended with:

User login & registration

Book reservation system

File/database storage

Feel free to fork, contribute, or star ⭐ the repo if you find it useful!