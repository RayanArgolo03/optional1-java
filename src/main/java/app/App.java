
package app;

import domain.Book;
import service.BookService;

import java.util.Optional;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        //Search by title - True
        Optional<Book> bookTitle = bookService.findByTitle("Greek Mithology");
        Consumer<Book> setNewTitle = book -> book.setTitle("Title");
        bookTitle.ifPresent(setNewTitle);

        //Search by title - Faalse
        try {
            bookService.findByTitle("Musk Biograph")
                    .orElseThrow(() -> new IllegalArgumentException("Error!"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Search by ID false with new instance of book
        Book bookId = bookService.findById(10L).orElse(new Book("Caribean Pirates"));
        System.out.println(bookId);

    }

}