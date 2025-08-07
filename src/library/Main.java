package library;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Create some users
        lib.addUser(new User(1, "Alice"));
        lib.addUser(new User(2, "Bob"));

        while (true) 
        {
            System.out.println("---------- Library Management System -----------");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Available Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
            case 1 -> 
            {
            	System.out.print("Enter book ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear buffer
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                lib.addBook(new Book(id, title, author));
            }
            case 2 -> 
            {
            	System.out.print("Enter book ID to remove: ");
                int id = sc.nextInt();
                lib.removeBook(id);
            }
            case 3 -> lib.listBooks();
            case 4 -> 
            {
            	System.out.print("Enter user ID: ");
                int userId = sc.nextInt();
                User user = lib.getUserById(userId);
                if (user == null)
                {
                	 System.out.println("User not found.");
                     break;
                }
                System.out.print("Enter book ID to issue: ");
                int bookId = sc.nextInt();
                lib.issueBook(bookId, user);
                }
                case 5 -> 
                {
                    System.out.print("Enter user ID: ");
                    int userId = sc.nextInt();
                    User user = lib.getUserById(userId);
                    if (user == null) 
                    {
                        System.out.println("User not found.");
                        break;
                    }
                    System.out.print("Enter book ID to return: ");
                    int bookId = sc.nextInt();
                    lib.returnBook(bookId, user);
                }
                case 6 -> 
                {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
