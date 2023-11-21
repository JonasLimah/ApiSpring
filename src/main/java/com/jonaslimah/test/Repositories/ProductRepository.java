package com.jonaslimah.test.Repositories;

import com.jonaslimah.test.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
