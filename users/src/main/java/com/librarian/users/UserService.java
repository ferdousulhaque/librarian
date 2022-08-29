package com.librarian.users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record UserService (
        UserRepository userRepository
){
    public List<User> allUsers(){
        return userRepository.findAll();
    }

    public boolean addUser(User newUser){
        userRepository.save(newUser);
        return true;
    }
}
