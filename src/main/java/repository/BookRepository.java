
package repository;

import domain.Book;
import java.util.Optional;
import java.util.function.Predicate;

public interface BookRepository {
    Optional<Book> findBy(Predicate<Book> predicate);
}
