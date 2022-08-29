package com.starter.books;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/books")
public class BookController{
    @Autowired
    private final BookService bookService;

    @PostMapping
    public void add(@RequestBody BookAddRequest bookAddRequest){
        log.info("New Client Registration {}", bookAddRequest);
        bookService.add(bookAddRequest);
    }

    @GetMapping
    public List<Book> list(){
        return bookService.list();
    }

    @GetMapping(path = "{bookId}")
    public ResponseEntity<Book> oneOnly(@PathVariable("bookId") Integer bookId){
        Book searchBook = bookService.one(bookId);
        return ResponseEntity.ok(searchBook);
    }
}
