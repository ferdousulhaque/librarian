package com.librarian.rent;

import com.librarian.octopus.books.BookResponse;
import com.librarian.octopus.books.BooksAgent;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RentService {

    @Autowired
    private final BooksAgent booksAgent;

    @Autowired
    private final RentRepository rentRepository;

    public List<Rented> rented(){
        return rentRepository.findAll();
    }

    public BookResponse oneBook(Integer bookId){
        return this.booksAgent.oneOnly(bookId);
    }

    public void rentABook(Integer bookId, Rented bookForRent){
        if(isRented(bookId)){
            throw new RuntimeException("Book is already rented");
        }
        rentRepository.save(bookForRent);
    }

    public boolean isRented(Integer bookId){
        return rentRepository.existsByBookId(bookId);
    }
}
