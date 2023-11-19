package com.jonaslimah.test.resouces;

import com.jonaslimah.test.entities.User;

import com.jonaslimah.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
    @Autowired
    private UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findUsers(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findUser(@PathVariable Long id){
        User user = service.findUser(id);
        return ResponseEntity.ok().body(user);
    }

}
