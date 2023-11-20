package com.jonaslimah.test.services;


import com.jonaslimah.test.entities.Order;
import com.jonaslimah.test.userRepositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    public List<Order> findAll(){
        return repository.findAll();
    }
    public Order findOrder(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
