package domain;

public class Book {

    private static Long increment = 1L;
    private Long id;
    private String title;

    public Book(String title) {
        this.id = increment++;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book " + id + ", " + title;
    }
}
