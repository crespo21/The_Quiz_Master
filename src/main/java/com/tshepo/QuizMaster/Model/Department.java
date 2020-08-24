package com.tshepo.QuizMaster.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Department {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column
   private long departmentID;

   @Column
   private String departmentName;

   @OneToOne
   Admin admin;

   @OneToMany
   private List<Recruit> recruit;

   @ManyToMany
   private List<Quiz> quiz;

   public long getDepartmentID() {
      return departmentID;
   }

   public void setDepartmentID(long departmentID) {
      this.departmentID = departmentID;
   }

   public String getDepartmentName() {
      return departmentName;
   }

   public void setDepartmentName(String departmentName) {
      this.departmentName = departmentName;
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

   public List<Quiz> getQuiz() {
      return quiz;
   }

   public void setQuiz(List<Quiz> quiz) {
      this.quiz = quiz;
   }
}
