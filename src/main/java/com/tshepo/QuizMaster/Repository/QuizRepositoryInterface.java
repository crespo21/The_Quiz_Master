package com.tshepo.QuizMaster.Repository;

import com.tshepo.QuizMaster.Model.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepositoryInterface extends CrudRepository<Quiz, Long> {
}
