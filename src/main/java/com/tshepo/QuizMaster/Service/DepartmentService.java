package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Department;
import com.tshepo.QuizMaster.Repository.DepartmentRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    DepartmentRepositoryInterface departmentRepositoryInterface;

    //getting all department records
    public List<Department> getAllDepartment(){
        List<Department> departmentList =departmentRepositoryInterface.findAll();
        if (departmentList.size() > 0){
            return departmentList;
        }
        else{
            return new ArrayList<>();
        }
    }

    //getting a specific record
    public Department getDepartmentById(long departmentId) throws Exception {
        Optional<Department> optionalDepartment = departmentRepositoryInterface.findById(departmentId);
        if (optionalDepartment.isPresent()){
            return optionalDepartment.get();
        }else {
            throw new Exception( "no department record for given id");
        }
    }
    //save  specific records
    public Department saveOrUpdate(Department department){
        Optional<Department> optionalDepartment = departmentRepositoryInterface.findById(department.getDepartmentID());
        if(optionalDepartment.isPresent()){
            Department newDepartment = optionalDepartment.get();
            newDepartment.setDepartmentID(department.getDepartmentID());
            newDepartment.setDepartmentName(department.getDepartmentName());
            newDepartment.setAdmin(department.getAdmin());
            newDepartment.setRecruit(department.getRecruit());
            newDepartment.setQuiz(department.getQuiz());
            newDepartment = departmentRepositoryInterface.save(newDepartment);
            return newDepartment;
        }
        else {
            department = departmentRepositoryInterface.save(department);
            return department;
        }
    }
}
