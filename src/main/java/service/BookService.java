package service;

import domain.Book;
import repository.BookRepository;

import java.util.*;
import java.util.function.Predicate;

public class BookService implements BookRepository {

    private List<Book> books = Arrays.asList(
            new Book("Greek Mithology"),
            new Book("Egipcian Mithology"),
            new Book("Nordic Mithology"),
            new Book("Persian Mithology"),
            new Book("Brazilian Mithology")
    );

    public BookService() {
    }

    @Override
    public Optional<Book> findBy(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .findFirst();
    }

    public Optional<Book> findById(Long id) {
        return findBy(book -> book.getId().equals(id));
    }

    public Optional<Book> findByTitle(String title) {
        return findBy(book -> book.getTitle().equals(title));
    }


}
