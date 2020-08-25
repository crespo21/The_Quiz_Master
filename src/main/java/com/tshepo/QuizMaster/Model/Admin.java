package com.tshepo.QuizMaster.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Admin {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long adminId;
    @Column
    private String adminName;
    @Column
    private String adminSurnameName;
    @Column
    private String adminDepartment;
    @Column
    private String adminEmail;
    @Column
    private String adminPassword;

    @OneToMany
    private List<Recruit> recruits;
    @OneToOne
    private Department department;
    @OneToMany
    private List<Quiz> quizzes;


    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSurnameName() {
        return adminSurnameName;
    }

    public void setAdminSurnameName(String adminSurnameName) {
        this.adminSurnameName = adminSurnameName;
    }

    public String getAdminDepartment() {
        return adminDepartment;
    }

    public void setAdminDepartment(String adminDepartment) {
        this.adminDepartment = adminDepartment;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public List<Recruit> getRecruits() {
        return recruits;
    }

    public void setRecruits(List<Recruit> recruits) {
        this.recruits = recruits;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    @Override
    public String toString(){
       return "Admin [id :  " + adminId + " Name: " + adminName + " Surname : " + adminSurnameName +
               " Department : " + adminDepartment + " Email : " + adminEmail +"]";

    }
}

