package com.starter.books;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/books")
public record BookController (
        BookService bookService
) {

    @PostMapping
    public void add(@RequestBody BookAddRequest bookAddRequest){
        log.info("New Client Registration {}", bookAddRequest);
        bookService.add(bookAddRequest);
    }

    @GetMapping
    public List<Book> list(){
        return bookService.list();
    }
}
