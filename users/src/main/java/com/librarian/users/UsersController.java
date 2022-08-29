package com.librarian.users;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("api/v1/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> allUsers(){
        return userService.allUsers();
    }

    @PostMapping()
    public ResponseEntity<String> addUsers(@RequestBody User newUser){
        log.info(newUser.toString());
        userService.addUser(newUser);
        return ResponseEntity.ok("ok");
    }


}
