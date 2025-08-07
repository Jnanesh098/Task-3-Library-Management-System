package library;

import java.util.ArrayList;

public class User 
{
    private int userId;
    private String name;
    private ArrayList<Book> issuedBooks;

    public User(int userId, String name) 
    {
        this.userId = userId;
        this.name = name;
        this.setIssuedBooks(new ArrayList<>());
    }
    public void issueBook(Book book) 
    {
        getIssuedBooks().add(book);
    }
    public void returnBook(Book book) 
    {
        getIssuedBooks().remove(book);
    }
    public void displayIssuedBooks() 
    {
        if (getIssuedBooks().isEmpty()) 
        {
            System.out.println("No books issued.");
        }
        else 
        {
            for (Book b : getIssuedBooks()) 
            {
                System.out.println(b);
            }
        }
    }
    public int getUserId() { return userId; }
    public String getName() { return name; }
	public ArrayList<Book> getIssuedBooks() {
		return issuedBooks;
	}
	public void setIssuedBooks(ArrayList<Book> issuedBooks) {
		this.issuedBooks = issuedBooks;
	}
}

