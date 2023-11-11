package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

//POJO (Plain Old Java Objects)
@Entity
public class Author {

    //Defines id as the primary key
    //Database is responsible for auto-generating (incrementing) the primary key (id)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Defines a many-to-many relationship with books mapped by authors
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    //Instance Variables
    private String firstName;
    private String lastName;

    //Constructors
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    //Java Persistence API requires an empty constructor
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
