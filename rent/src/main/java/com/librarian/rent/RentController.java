package com.librarian.rent;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/rent")
public record RentController(
        RentService rentService
) {
    @PostMapping(path = "{userId}")
    public void rent(@PathVariable("userId") Integer userId, @RequestBody RentRequest rentRequest){
//        for(rentRequest.bookIds() as book){
//
//        };
        log.info(userId.toString() + rentRequest.toString());
//        return ResponseEntity.ok("");
    }
}
