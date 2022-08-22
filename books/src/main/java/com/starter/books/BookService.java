package com.starter.books;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record BookService(
    BookRepository bookRepository
) {

    public void add(BookAddRequest request){
        Book book = Book.builder()
                .bookName(request.bookName())
                .authorName(request.authorName())
                .price(request.price())
                .build();

        bookRepository.save(book);
        //validation
    }

    public List<Book> list(){
        return bookRepository.findAll();
    }

    public Book one(Integer bookId){
        return bookRepository.getOne(bookId);
    }
}
