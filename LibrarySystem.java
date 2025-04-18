// Base class
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }
}

// Derived class: Fiction
class Fiction extends Book {
    Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    void displayDetails() {
        System.out.print("Fiction Book Details: ");
        super.displayDetails();
    }
}

// Derived class: Non-Fiction
class NonFiction extends Book {
    NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    void displayDetails() {
        System.out.print("Non-Fiction Book Details: ");
        super.displayDetails();
    }
}

// Main class to test
public class LibrarySystem {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction book2 = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        book1.displayDetails();
        book2.displayDetails();
    }
}
