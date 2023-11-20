package com.jonaslimah.test.Repositories;

import com.jonaslimah.test.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
