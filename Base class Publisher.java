// Base class: Publisher
class Publisher {
    private String publisherName;
    private String publisherAddress;

    public Publisher(String publisherName, String publisherAddress) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }

    public void displayPublisherDetails() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Address: " + publisherAddress);
    }
}

// Base class: Book
class Book extends Publisher {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String publisherName, String publisherAddress, String title, String author, int publicationYear) {
        super(publisherName, publisherAddress);
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayBookDetails() {
        displayPublisherDetails();  // Call Publisher details method
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + publicationYear);
    }
}

// Derived class: Literature (inherits from Book)
class Literature extends Book {
    private String genre;

    public Literature(String publisherName, String publisherAddress, String title, String author, int publicationYear, String genre) {
        super(publisherName, publisherAddress, title, author, publicationYear);
        this.genre = genre;
    }

    public void displayLiteratureDetails() {
        System.out.println("Literature Book Details:");
        displayBookDetails();
        System.out.println("Genre: " + genre);
        System.out.println("----------------------------------------");
    }
}

// Derived class: Fiction (inherits from Book)
class Fiction extends Book {
    private String subGenre;

    public Fiction(String publisherName, String publisherAddress, String title, String author, int publicationYear, String subGenre) {
        super(publisherName, publisherAddress, title, author, publicationYear);
        this.subGenre = subGenre;
    }

    public void displayFictionDetails() {
        System.out.println("Fiction Book Details:");
        displayBookDetails();
        System.out.println("Sub-genre: " + subGenre);
        System.out.println("----------------------------------------");
    }
}

// Main program to read information and display book details
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter details for Literature Book:");
        Literature literatureBook = new Literature("Penguin Books", "New York, USA", "War and Peace", "Leo Tolstoy", 1869, "Historical Fiction");
        literatureBook.displayLiteratureDetails();

        System.out.println("Enter details for Fiction Book:");
        Fiction fictionBook = new Fiction("HarperCollins", "London, UK", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, "Fantasy");
        fictionBook.displayFictionDetails();
    }
}
