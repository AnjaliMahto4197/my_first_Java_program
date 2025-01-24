//creation of class
class Book{

    //creation of variables

    private String title;
    private String author;
    private long isbn;

    //default constructor
    public Book()
    {
        this.title="Unknown";
        this.author="Unknown";
        this.isbn = 123450L ;
    }
// parameterized constructor
    public Book(String title, String author, Long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    // Method to display book details
    public void Display(){
        System.out.println("___BOOK LIBRARY___");
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);
        System.out.println("ISBN :" + isbn);
    }
}

public class BookLibrary {
    public static void main(String[] args) {

        // default call of constructor
        Book B1 = new Book() ;
        System.out.println("Default Parameters:");
        B1.Display();

        // Parameterized call of constructor
        Book B2 = new Book("Pawan Kumar","Rahul Kumar", 13345L);
        System.out.println("Parameterized Parameters:");
        B2.Display();
    }
}
