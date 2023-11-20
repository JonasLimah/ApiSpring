package com.jonaslimah.test.resouces;

import com.jonaslimah.test.Repositories.CategoryRepository;
import com.jonaslimah.test.entities.Category;
import com.jonaslimah.test.entities.Order;
import com.jonaslimah.test.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findCategories(){
        List<Category> orders = service.findAll();
        return ResponseEntity.ok().body(orders);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findCategory(@PathVariable Long id){
        Category category = service.findCategory(id);
        return ResponseEntity.ok().body(category);
    }
}
