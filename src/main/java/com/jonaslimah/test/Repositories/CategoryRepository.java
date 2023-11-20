package com.jonaslimah.test.Repositories;

import com.jonaslimah.test.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
