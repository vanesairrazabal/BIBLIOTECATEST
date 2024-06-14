package library;
import java.util.*;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();

    public boolean addBook(String isbn, String title, String author) {
        if (books.containsKey(isbn)) {
            return false;
        }
        books.put(isbn, new Book(isbn, title, author));
        return true;
    }

    public boolean addMember(String id, String name) {
        if (members.containsKey(id)) {
            return false;
        }
        members.put(id, new Member(id, name));
        return true;
    }

    public boolean borrowBook(String isbn, String memberId) {
        Book book = books.get(isbn);
        Member member = members.get(memberId);
        if (book == null || member == null || book.isBorrowed()) {
            return false;
        }
        book.setBorrowed(true);
        member.borrowBook(book);
        return true;
    }

    public boolean returnBook(String isbn, String memberId) {
        Book book = books.get(isbn);
        Member member = members.get(memberId);
        if (book == null || member == null || !book.isBorrowed()) {
            return false;
        }
        book.setBorrowed(false);
        member.returnBook(book);
        return true;
    }

    public List<Book> listAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (!book.isBorrowed()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public List<? extends Object> listBorrowedBooks(String memberId) {
        Member member = members.get(memberId);
        if (member == null) {
            return Collections.emptyList();
        }
        return member.getBorrowedBooks();
    }
}

