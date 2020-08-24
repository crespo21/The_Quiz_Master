package com.tshepo.QuizMaster.Repository;

import com.tshepo.QuizMaster.Model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryInterface extends CrudRepository<Department, Long> {
}
