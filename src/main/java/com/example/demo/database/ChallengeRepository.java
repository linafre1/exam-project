package com.example.demo.database;
import com.example.demo.Challenge;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ChallengeRepository extends CrudRepository<Challenge, Long> {
    List<Challenge> findAllByOrderByNameAsc();
}
