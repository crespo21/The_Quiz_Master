package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Recruit;
import  com.tshepo.QuizMaster.Repository.RecruitRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecruitService {


    RecruitRepositoryInterface recruitRepositoryInterface;

    //getting all student records
    public List<Recruit> getAllRecruit(){
        List<Recruit> recruits = new ArrayList<>();
        recruitRepositoryInterface.findAll().forEach(recruits::add);
        return recruits;
    }

    //getting a specific record
    public Recruit getRecruitById(long id) {
        return recruitRepositoryInterface.findById(id).get();
    }

    public void saveOrUpdate(Recruit recruit){
       recruitRepositoryInterface.save(recruit);
    }

    //deleting a specific record
    public void delete(Long id){
        recruitRepositoryInterface.deleteById(id);
    }
}
