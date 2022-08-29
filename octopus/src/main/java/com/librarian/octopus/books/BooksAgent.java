package com.librarian.octopus.books;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("books")
public interface BooksAgent {

    @GetMapping(path = "api/v1/books/{bookId}")
    public BookResponse oneOnly(@PathVariable("bookId") Integer bookId);

}
