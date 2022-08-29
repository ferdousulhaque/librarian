package com.librarian.rent;

import com.librarian.octopus.books.BookResponse;
import com.librarian.octopus.books.BooksAgent;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class RentService {

    @Autowired
    private final BooksAgent booksAgent;

    public List<Rented> rented(){
        return new ArrayList<Rented>();
    }

    public BookResponse oneBook(Integer bookId){
        return this.booksAgent.oneOnly(bookId);
    }
}
