package com.tshepo.QuizMaster.Service;


import com.tshepo.QuizMaster.Model.Quiz;
import com.tshepo.QuizMaster.Repository.QuizRepositoryInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    QuizRepositoryInterface quizRepositoryInterface;


    //getting all student records
    public List<Quiz> getAllQuizzes(){
        List<Quiz> quizList = quizRepositoryInterface.findAll();
        if(quizList.size() > 0) {
            return quizList;
        } else {
            return new ArrayList<>();
        }
    }

    //getting a specific record
    public Quiz getQuizById(long id) throws Exception {
        Optional<Quiz> quiz= quizRepositoryInterface.findById(id);
        if (quiz.isPresent()){
            return quiz.get();
        } else {
            throw new Exception( "no quiz record for given id");
        }
    }

    //save or update a specific record
    public Quiz saveOrUpdate(Quiz quiz) {
        Optional<Quiz> optionalQuiz= quizRepositoryInterface.findById(quiz.getQuizId());
        if(optionalQuiz.isPresent()) {
            Quiz newQuiz = optionalQuiz.get();
            newQuiz.setQuizId(quiz.getQuizId());
            newQuiz.setAdmin(quiz.getAdmin());
            newQuiz.setDepartment(quiz.getDepartment());
            newQuiz.setRecruit(quiz.getRecruit());
            newQuiz.setQuestions(quiz.getQuestions());
            newQuiz.setChoices(quiz.getChoices());
            newQuiz.setExplanation(quiz.getExplanation());
            newQuiz = quizRepositoryInterface.save(newQuiz);
            return newQuiz;
        }
        else {
            quiz = quizRepositoryInterface.save(quiz);
            return quiz;
        }
    }

    //deleting a specific record
    public void deleteQuizById(Long id) throws Exception {

        Optional<Quiz> admin = quizRepositoryInterface.findById(id);

        if(admin.isPresent()) {
            quizRepositoryInterface.deleteById(id);
        }
        else {
            throw new Exception("No quiz record exist for given id");
        }
    }
}
