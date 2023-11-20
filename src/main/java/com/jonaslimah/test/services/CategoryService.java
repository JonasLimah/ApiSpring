package com.jonaslimah.test.services;

import com.jonaslimah.test.Repositories.CategoryRepository;
import com.jonaslimah.test.entities.Category;
import com.jonaslimah.test.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll(){
        return repository.findAll();
    }
    public Category findCategory(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
