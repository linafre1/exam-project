package com.example.demo.database;

import com.example.demo.Activity;
import com.example.demo.Badge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BadgeRepository extends CrudRepository<Badge, Long> {
}
