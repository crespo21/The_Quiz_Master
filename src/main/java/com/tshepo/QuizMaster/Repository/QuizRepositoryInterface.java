package com.tshepo.QuizMaster.Repository;

import com.tshepo.QuizMaster.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepositoryInterface extends JpaRepository<Quiz, Long> {
}
