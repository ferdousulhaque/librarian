package com.librarian.rent;

import com.librarian.octopus.books.BooksAgent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/rent")
public class RentController {
    @Autowired
    private final RentService rentService;


    @PostMapping(path = "{userId}")
    public void rent(@PathVariable("userId") Integer userId, @RequestBody RentRequest rentRequest){
        for(Integer singleBookId: rentRequest.bookIds()){
//            System.out.println(singleBookId);
//            if(singleBookId == 1){
//                log.info(rentService.oneBook(singleBookId).getBookName());
                LocalDateTime rightNow = LocalDateTime.now();
                Rented bookForRent = Rented.builder()
                                .bookId(singleBookId)
                                .userId(userId)
                                .rentedOn(rightNow)
                                .returnOn(null)
                                .build();
                rentService.rentABook(singleBookId, bookForRent);
//            }
        }
        log.info(userId.toString() + rentRequest.toString());
//        return ResponseEntity.ok("");
    }

    @GetMapping
    public List<Rented> rented(){
        return rentService.rented();
    }
}
