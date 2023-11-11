package guru.springframework.spring6webapp.domain;

import java.util.Set;

//POJO (Plain Old Java Objects)
public class Author {
    //Instance variables
    private String firstName;
    private String lastName;
    private Set<Book> books;

    //Constructors
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
    //JPA requires an empty constructor
    public Author() {
    }

    //Getters & Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
