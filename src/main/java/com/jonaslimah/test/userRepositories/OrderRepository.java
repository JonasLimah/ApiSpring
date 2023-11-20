package com.jonaslimah.test.userRepositories;

import com.jonaslimah.test.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
