package com.wrapy.internaldb.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fName;
    private String lName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books= new HashSet<>();

    public Author(String fName, String lName, Set<Book> books) {
        this.fName = fName;
        this.lName = lName;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
