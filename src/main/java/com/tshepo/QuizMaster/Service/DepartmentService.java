package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Admin;
import com.tshepo.QuizMaster.Model.Department;
import com.tshepo.QuizMaster.Repository.DepartmentRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    DepartmentRepositoryInterface departmentRepositoryInterface;

    //getting all student records
    public List<Department> getAllRecruit(){
        List<Department> departments = new ArrayList<>();
        departmentRepositoryInterface.findAll().forEach(departments::add);
        return departments;
    }

    //getting a specific record
    public Department getRecruitById(long departmentId) {
        return departmentRepositoryInterface.findById(departmentId).get();
    }

    public void saveOrUpdate(Department department){
        departmentRepositoryInterface.save(department);
    }

    //deleting a specific record
    public void delete(Long departmentId){
        departmentRepositoryInterface.deleteById(departmentId);
    }
}
