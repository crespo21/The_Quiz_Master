package com.tshepo.QuizMaster.Controller;

import com.tshepo.QuizMaster.Model.Quiz;
import com.tshepo.QuizMaster.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class QuizController {

    QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //creating a get mapping that retrieves all
    // the quiz detail from the database
    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        List<Quiz> recruit = quizService.getAllQuizzes();
        return new ResponseEntity<>(recruit, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a get mapping that retrieves the detail of a specific quiz
    @GetMapping("quiz/{id}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable("id") Long id) throws Exception {
        Quiz quiz = quizService.getQuizById(id);
        return new ResponseEntity<>(quiz, new HttpHeaders(), HttpStatus.OK);
    }

    //creating post mapping that post the quiz detail in the database
    @PostMapping
    public ResponseEntity<Quiz> saveOrUpdate(Quiz quiz) {
        Quiz updated = quizService.saveOrUpdate(quiz);
        return new ResponseEntity<>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a delete mapping that deletes a specific quiz
    @DeleteMapping("/{id}")
    public HttpStatus deleteRecruitById(@PathVariable("id") Long id) throws Exception {
        quizService.deleteQuizById(id);
        return HttpStatus.FORBIDDEN;
    }
}
