package com.librarian.users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<User> findOneUser(Integer userId){
        return userRepository.findById(userId);
    }
}
