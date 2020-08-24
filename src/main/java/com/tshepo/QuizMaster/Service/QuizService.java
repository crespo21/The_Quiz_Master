package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Department;
import com.tshepo.QuizMaster.Model.Quiz;
import com.tshepo.QuizMaster.Repository.DepartmentRepositoryInterface;
import com.tshepo.QuizMaster.Repository.QuizRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    QuizRepositoryInterface quizRepositoryInterface;

    //getting all student records
    public List<Quiz> getAllRecruit(){
        List<Quiz> departments = new ArrayList<>();
        quizRepositoryInterface.findAll().forEach(departments::add);
        return departments;
    }

    //getting a specific record
    public Quiz getRecruitById(long quizId) {
        return quizRepositoryInterface.findById(quizId).get();
    }

    public void saveOrUpdate(Quiz quiz){
        quizRepositoryInterface.save(quiz);
    }

    //deleting a specific record
    public void delete(Long departmentId){
        quizRepositoryInterface.deleteById(departmentId);
    }
}
