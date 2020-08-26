package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Recruit;
import  com.tshepo.QuizMaster.Repository.RecruitRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RecruitService {

    RecruitRepositoryInterface recruitRepositoryInterface;

    @Autowired
    public RecruitService(RecruitRepositoryInterface recruitRepositoryInterface) {
        this.recruitRepositoryInterface = recruitRepositoryInterface;
    }

    //getting all student records
    public List<Recruit> getAllRecruit(){
        List<Recruit> recruitList = recruitRepositoryInterface.findAll();
        if(recruitList.size() > 0) {
            return recruitList;
        }
        else {
            return new ArrayList<>();
        }
    }

    //getting a specific record
    public Recruit getRecruitById(long id) throws Exception {
        Optional<Recruit> recruitList = recruitRepositoryInterface.findById(id);
        if (recruitList.isPresent()){
            return recruitList.get();
        }else {
            throw new Exception( "no recruit record for given id");
        }
    }

    //saving or updating a specific record
    public Recruit saveOrUpdate(Recruit recruit){
        Optional<Recruit> recruitList = recruitRepositoryInterface.findById(recruit.getRecruitId());
        if(recruitList.isPresent()){
            Recruit newRecruit = recruitList.get();
            newRecruit.setRecruitId(recruit.getRecruitId());
            newRecruit.setRecruitEmail(recruit.getRecruitEmail());
            newRecruit.setRecruitName(recruit.getRecruitName());
            newRecruit.setRecruitSurnameName(recruit.getRecruitSurnameName());
            newRecruit.setDepartment(recruit.getDepartment());
            newRecruit.setAdmin(recruit.getAdmin());
            newRecruit.setQuiz(recruit.getQuiz());
            newRecruit.setRecruitPassword(recruit.getRecruitPassword());
            newRecruit = recruitRepositoryInterface.save(newRecruit);
            return newRecruit;
        }
        else {
            recruit = recruitRepositoryInterface.save(recruit);
            return recruit;
        }
    }

    //deleting a specific record
    public void deleteRecruitById(Long id) throws Exception {
        Optional<Recruit> recruit = recruitRepositoryInterface.findById(id);
        if(recruit.isPresent()) {
            recruitRepositoryInterface.deleteById(id);
        }
        else {
            throw new Exception("No admin record exist for given id");
        }
    }
}
