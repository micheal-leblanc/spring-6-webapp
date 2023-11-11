package guru.springframework.spring6webapp.domain;

import java.util.Set;

//POJO (Plain Old Java Objects)
public class Book {
    //Instance Variables
    private String title;
    private String isbn;
    private Set<Author> authors;

    //Constructors
    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }
    //JPA requires an empty constructor
    public Book() {
    }

    //Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
