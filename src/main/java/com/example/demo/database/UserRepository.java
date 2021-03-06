package com.example.demo.database;

import com.example.demo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByAlias(String alias);
}
