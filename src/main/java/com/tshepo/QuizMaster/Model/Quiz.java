package com.tshepo.QuizMaster.Model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long quizId;

    @Column
    private String questions;

    @Column
    private  String choices;

    @Column
    private  String explanation;

    @OneToOne
    Admin admin;

    @OneToMany
    private List<Recruit> recruit;

    @ManyToOne
    private  Department department;

    public void setQuizId(long quizId) {
        this.quizId = quizId;
    }

    public long getQuizId() {
        return quizId;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Recruit> getRecruit() {
        return recruit;
    }

    public void setRecruit(List<Recruit> recruit) {
        this.recruit = recruit;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
