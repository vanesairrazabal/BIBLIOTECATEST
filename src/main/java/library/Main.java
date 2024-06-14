package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("123456789", "The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("987654321", "1984", "George Orwell");
        library.addMember("1", "Alice");
        library.addMember("2", "Bob");

        library.borrowBook("123456789", "1");
        System.out.println("Available Books: " + library.listAvailableBooks());
        System.out.println("Alice's Borrowed Books: " + library.listBorrowedBooks("1"));

        library.returnBook("123456789", "1");
        System.out.println("Available Books: " + library.listAvailableBooks());
        System.out.println("Alice's Borrowed Books: " + library.listBorrowedBooks("1"));
    }
}
