package com.tshepo.QuizMaster.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Recruit {
    @Id
    @GeneratedValue
    private long recruitId;
    @Column
    private String recruitName;
    @Column
    private String recruitSurnameName;
    @Column
    private String recruitEmail;
    @Column
    private String recruitPassword;

    @ManyToOne
    Department department;
    @ManyToOne
    Admin admin;
    @ManyToMany
    private List<Quiz> quiz;


    public long getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(long recruitId) {
        this.recruitId = recruitId;
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName;
    }

    public String getRecruitSurnameName() {
        return recruitSurnameName;
    }

    public void setRecruitSurnameName(String recruitSurnameName) {
        this.recruitSurnameName = recruitSurnameName;
    }


    public String getRecruitEmail() {
        return recruitEmail;
    }

    public void setRecruitEmail(String recruitEmail) {
        this.recruitEmail = recruitEmail;
    }

    public String getRecruitPassword() {
        return recruitPassword;
    }

    public void setRecruitPassword(String recruitPassword) {
        this.recruitPassword = recruitPassword;
    }



    public void setDepartment(Department department) {
        this.department = department;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }


    public List<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<Quiz> quiz) {
        this.quiz = quiz;
    }
    @Override
    public String toString(){
        return "Recruit [id :  " + recruitId + " Name: " + recruitName + " Surname : " + recruitSurnameName +
                " Department : " + department + " Email : " + recruitEmail+"]";

    }

    public Department getDepartment() {
        return department;
    }
}
