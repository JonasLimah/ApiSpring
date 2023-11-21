package com.jonaslimah.test.resouces;

import com.jonaslimah.test.entities.Category;
import com.jonaslimah.test.entities.Product;
import com.jonaslimah.test.services.CategoryService;
import com.jonaslimah.test.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findCategories(){
        List<Product> orders = service.findAll();
        return ResponseEntity.ok().body(orders);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findCategory(@PathVariable Long id){
        Product product = service.findProduct(id);
        return ResponseEntity.ok().body(product);
    }
}
