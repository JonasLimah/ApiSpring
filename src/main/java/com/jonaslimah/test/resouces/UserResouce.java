package com.jonaslimah.test.resouces;

import com.jonaslimah.test.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
    @GetMapping()
    public ResponseEntity<User> findUsers(){
        User u =  new User(1L,"jonas","jonas@gmail.com","99999999","213123");
        return ResponseEntity.ok().body(u);
    }
}
