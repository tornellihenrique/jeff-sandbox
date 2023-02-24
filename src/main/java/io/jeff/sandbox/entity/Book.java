package io.jeff.sandbox.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Id
    public String id;

    public String title;
    public String author;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
