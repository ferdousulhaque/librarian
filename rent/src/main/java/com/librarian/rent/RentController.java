package com.librarian.rent;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/rent")
public record RentController(
        RentService rentService
) {
    @PostMapping(params = "{userId}")
    public ResponseEntity<String> rent(@RequestBody RentRequest rentRequest){
//        for(rentRequest.bookIds() as book){
//
//        };
        return ResponseEntity.ok("");
    }
}
