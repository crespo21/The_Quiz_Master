package com.tshepo.QuizMaster.Controller;

import com.tshepo.QuizMaster.Model.Recruit;
import  com.tshepo.QuizMaster.Service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class RecruitController {

    RecruitService recruitService;

    @Autowired
    public RecruitController(RecruitService recruitService) {
        this.recruitService = recruitService;
    }

    //creating a get mapping that retrieves all
    // the recruits detail from the database
    @GetMapping
    public ResponseEntity<List<Recruit>> getAllAdmins() {
        List<Recruit> recruit = recruitService.getAllRecruit();
        return new ResponseEntity<>(recruit, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a get mapping that retrieves the detail of a specific recruit
    @GetMapping("/{id}")
    public ResponseEntity<Recruit> getRecruitById(@PathVariable("id") Long id) throws Exception {
        Recruit recruit = recruitService.getRecruitById(id);
        return new ResponseEntity<>(recruit, new HttpHeaders(), HttpStatus.OK);
    }

    //creating post mapping that post the recruit detail in the database
    @PostMapping
    public ResponseEntity<Recruit> saveOrUpdate(Recruit recruit) {
        Recruit updated = recruitService.saveOrUpdate(recruit);
        return new ResponseEntity<>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a delete mapping that deletes a specific recruit
    @DeleteMapping("/{id}")
    public HttpStatus deleteRecruitById(@PathVariable("id") Long id) throws Exception {
        recruitService.deleteRecruitById(id);
        return HttpStatus.FORBIDDEN;
    }
}