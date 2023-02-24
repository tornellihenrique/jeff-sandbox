package io.jeff.sandbox.service;

import io.jeff.sandbox.entity.Book;
import io.jeff.sandbox.entity.dto.BookRequest;
import io.jeff.sandbox.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return this.bookRepository.findAllBy();
    }

    public List<Book> create(BookRequest request) {
        this.bookRepository.save(new Book(request.getTitle(), request.getAuthor()));

        return this.getAll();
    }

}
