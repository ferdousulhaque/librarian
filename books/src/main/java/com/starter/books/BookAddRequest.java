package com.starter.books;

public record BookAddRequest(
        String bookName,
        String authorName,
        float price
) {
}
