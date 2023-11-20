package com.jonaslimah.test.Repositories;

import com.jonaslimah.test.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
