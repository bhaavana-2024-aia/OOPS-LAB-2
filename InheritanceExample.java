// Demonstrating Single and Multilevel Inheritance in Java

// Base class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Derived class (Single Inheritance from Book)
class EBook extends Book {
    double fileSizeMB;

    EBook(String title, String author, double fileSizeMB) {
        super(title, author); // Call to Book constructor
        this.fileSizeMB = fileSizeMB;
    }

    void displayEBookInfo() {
        displayBookInfo();
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

// Derived from EBook (Multilevel Inheritance)
class InteractiveEBook extends EBook {
    boolean hasAudioNarration;

    InteractiveEBook(String title, String author, double fileSizeMB, boolean hasAudio) {
        super(title, author, fileSizeMB); // Call to EBook constructor
        this.hasAudioNarration = hasAudio;
    }

    void displayInteractiveFeatures() {
        displayEBookInfo();
        System.out.println("Audio Narration Available: " + (hasAudioNarration ? "Yes" : "No"));
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Single inheritance example
        System.out.println("--- Single Inheritance Example ---");
        EBook ebook = new EBook("Java Programming", "James Gosling", 5.2);
        ebook.displayEBookInfo();

        // Multilevel inheritance example
        System.out.println("\n--- Multilevel Inheritance Example ---");
        InteractiveEBook interactiveBook = new InteractiveEBook("Learn Java", "Herbert Schildt", 15.8, true);
        interactiveBook.displayInteractiveFeatures();
    }
}
