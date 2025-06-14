package javaapplication3;

public class LibraryTest {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create Marvel comic books
        Book book1 = new Book("The Amazing Spider-Man", "Stan Lee", 10);
        Book book2 = new Book("Iron Man: Extremis", "Warren Ellis", 5);
        Book book3 = new Book("X-Men: Days of Future Past", "Chris Claremont", 7);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display before update
        System.out.println("Before update:");
        library.displayLibrary();

        // Update one title
        library.updateBookTitle(book1, "Spider-Man: No Way Home");

        // Display after update
        System.out.println("\nAfter updating book title:");
        library.displayLibrary();

        // Demonstrate primitive data
        int issueNumber = 75;
        System.out.println("\nOriginal issue number before method call: " + issueNumber);
        library.attemptPrimitiveChange(issueNumber);
        System.out.println("Original issue number after method call: " + issueNumber);
    }
}
