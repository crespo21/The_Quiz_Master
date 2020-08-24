package com.tshepo.QuizMaster.Repository;

import com.tshepo.QuizMaster.Model.Recruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitRepositoryInterface extends CrudRepository<Recruit,Long > {
}
