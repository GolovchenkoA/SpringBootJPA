package ua.art.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="authors")
public class Author {

    @Id
    @GeneratedValue // default AUTO
    private Long id;

    @Column(name="author_name")
    private String name;

    @ManyToMany
    @JoinTable(name="authors_books")
    private Set<Book> books;
}
