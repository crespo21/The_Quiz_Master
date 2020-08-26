package com.tshepo.QuizMaster.Controller;

import com.tshepo.QuizMaster.Model.Department;
import com.tshepo.QuizMaster.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DepartmentController {
    DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartment();

        return new ResponseEntity<>(departments, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a get mapping that retrieves all
    // the departments detail from the database
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long id) throws Exception {
        Department department = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(department, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a get mapping that retrieves the detail of a specific department
    @PostMapping
    public ResponseEntity<Department> saveOrUpdate(Department department) {
        Department updated = departmentService.saveOrUpdate(department);
        return new ResponseEntity<>(updated, new HttpHeaders(), HttpStatus.OK);
    }
}
