package com.example.demo.database;

import com.example.demo.Activity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
    List<Activity> findByUserId(Long id);

    List<Activity> findByUserIdAndTypeId(Long id, Long id1);
}
