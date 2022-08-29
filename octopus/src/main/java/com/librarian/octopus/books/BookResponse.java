package com.librarian.octopus.books;

import lombok.Data;

@Data
public class BookResponse {

    private int id;
    private String bookName;
    private String authorName;
    private float rating;
    private float price;
}
