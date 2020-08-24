package com.tshepo.QuizMaster.Controller;

import com.tshepo.QuizMaster.Model.Recruit;
import  com.tshepo.QuizMaster.Service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecruitController {

    
    RecruitService recruitService;

    //creating a get mapping that retrieves all
    // the recruits detail from the database
    @GetMapping("/recruits")
    private List<Recruit> getAllRecruits(){
       return this.recruitService.getAllRecruit();
    }

    //creating a get mapping that retrieves the detail of a specific recruit
    @PostMapping("/recruits/{id}")
    private Recruit getRecruit(@PathVariable("id") long id){
     return recruitService.getRecruitById(id);
    }

    //creating a delete mapping that deletes a specific recruit
    @DeleteMapping("/recruits/{id}")
    public void deleteRecruit(@PathVariable("id") long id){
        recruitService.delete(id);
    }

    //creating post mapping that post the recruit detail in the database
    @PostMapping("/recruits")
    public long saveRecruit(@RequestBody Recruit recruit){
        recruitService.saveOrUpdate(recruit);
        return recruit.getRecruitId();
    }
}