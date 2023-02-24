package io.jeff.sandbox.resource;

import io.jeff.sandbox.entity.Book;
import io.jeff.sandbox.entity.dto.BookRequest;
import io.jeff.sandbox.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return this.bookService.getAll();
    }

    @PostMapping
    public List<Book> create(@RequestBody BookRequest request) {
        return this.bookService.create(request);
    }

}
