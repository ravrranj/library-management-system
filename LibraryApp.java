

import java.util.Scanner;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        
        
        // Sample Books 
        library.addBook(new Book("123456", "The Java Journey", "ChunChun"));
        library.addBook(new Book("234567", "Mastering OOPs", "Bud"));
        library.addBook(new Book("345678", "Data Structures in Java", "John Doe"));
        library.addBook(new Book ("456789", "Guide to become a Backend Developer", "Buddy"));

        System.out.println(" 📚 Welcome to ChunChun's Library 📚 ");
    
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. List All books");
            System.out.println("2. Search by ISBN");
            System.out.println("3. Search by Title");
            System.out.println("4. Search by Author");
            System.out.println("5. Borrow a Book");
            System.out.println("6. Return a Book");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            try {
                switch (choice) {
                    
                    case 1:
                         library.ListAllBooks();
                         break;
                         
                    case 2:
                          System.out.print("Enter ISBN: ");
                          String isbn = sc.nextLine();
                          Book bookByIsbn = library.searchByIsbn(isbn);
                          System.out.println("Found: " + bookByIsbn);
                          break;
                          
                    case 3:
                          System.out.print("Enter Title: ");
                          String title = sc.nextLine();
                          List<Book> booksByTitle = library.searchByTitle(title);
                          if(booksByTitle.isEmpty()) {
                            System.out.println("No books found with that title.");
                          }  else {
                            booksByTitle.forEach(System.out::println);
                          }
                          break;
                    
                    case 4:
                          System.out.print("Enter Author: ");
                          String author = sc.nextLine();
                          List<Book> booksByAuthor = library.searchByAuthor(author);
                          if(booksByAuthor.isEmpty()) {
                            System.out.println("No books found by the author.");
                          } else {
                            booksByAuthor.forEach(System.out::println);
                          }
                          break;

                    case 5:
                         System.out.print("Enter ISBN to borrow: ");
                         String borrowIsbn = sc.nextLine();
                         library.borrowBook(borrowIsbn);
                         break;
                         
                    case 6:
                         System.out.print("Enter ISBN to return: ");
                         String returnIsbn = sc.nextLine();
                         library.returnBook(returnIsbn);
                         break;
                         
                    case 7:
                         System.out.println("Exiting.. Thank you for visiting! 👋");
                         sc.close();
                         return;
                         
                    default:
                          System.out.println("Invalid option! Try again.");     
                }

        } catch (Exception e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }
}
}
