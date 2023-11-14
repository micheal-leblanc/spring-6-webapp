package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

//POJO (Plain Old Java Objects)

@Entity
public class Book {
    //Defines id as the primary key
    //Database is responsible for auto-generating (incrementing) the primary key (id)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Defines a many-to-many relationship
    //author_book table holds the relationship between records in the author and book table
    //@JoinTable configures the properties of the table
        //joinColumns: One or more @JoinColumn annotations, specifying foreign key column
        //mappings to the table of the owning side
        //inverseJoinColumns: One or more @JoinColumn annotations, specifying foreign key
        //column mappings to the table of the unowned side
        //@JoinColumn: Map an association to a foreign key column
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    //Instance Variables
    private String title;
    private String isbn;

    //Constructors
    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    //Java Persistence API requires an empty constructor
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //This checks that id is unique and not null
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Provides useful information about the object
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authors=" + authors +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
