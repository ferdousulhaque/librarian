package com.starter.books;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Component
public class BookService {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private final BookRepository bookRepository;

    @Value("${message}")
    private String message;

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
        logger.info(message);
        return bookRepository.findAll();
    }

    public Book one(Integer bookId){
        return bookRepository.getOne(bookId);
    }
}
