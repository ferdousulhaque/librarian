package com.librarian.rent;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public record RentService() {
    public List<Rented> rent(){

        return new ArrayList<Rented>();
    }
}
