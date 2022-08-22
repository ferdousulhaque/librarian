package com.librarian.octopus.books;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("books")
public interface BooksAgent {

}
