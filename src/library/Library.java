package library;

import java.util.ArrayList;

public class Library 
{
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() 
    {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    public void addBook(Book book) 
    {
        books.add(book);
        System.out.println("Book added: " + book);
    }
    public void removeBook(int id) 
    {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book with ID " + id + " removed.");
    }
    public void listBooks() 
    {
        for (Book book : books) 
        {
            if (!book.isIssued()) 
            {
                System.out.println(book);
            }
        }
    }
    public Book getBookById(int id) 
    {
        for (Book book : books) 
        {
            if (book.getId() == id && !book.isIssued()) 
            {
                return book;
            }
        }
        return null;
    }
    public void issueBook(int bookId, User user) 
    {
        Book book = getBookById(bookId);
        if (book != null) 
        {
            book.issueBook();
            user.issueBook(book);
            System.out.println("Book issued successfully to " + user.getName());
        }
        else 
        {
            System.out.println("Book not available.");
        }
    }
    public void returnBook(int bookId, User user) 
    {
        for (Book book : user.getIssuedBooks()) 
        {
            if (book.getId() == bookId) 
            {
                book.returnBook();
                user.returnBook(book);
                System.out.println("Book returned successfully by " + user.getName());
                return;
            }
        }
        System.out.println("Book not found in user's issued list.");
    }
    
    public void addUser(User user) 
    {
        users.add(user);
    }
    public User getUserById(int id) 
    {
        for (User u : users) 
        {
            if (u.getUserId() == id) return u;
        }
        return null;
    }
}
