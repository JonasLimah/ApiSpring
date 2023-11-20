package com.jonaslimah.test.services;

import com.jonaslimah.test.entities.User;
import com.jonaslimah.test.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
    public User findUser(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
