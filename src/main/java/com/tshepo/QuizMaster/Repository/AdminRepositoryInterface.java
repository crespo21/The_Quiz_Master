package com.tshepo.QuizMaster.Repository;

import com.tshepo.QuizMaster.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepositoryInterface extends JpaRepository<Admin,Long > {
}
