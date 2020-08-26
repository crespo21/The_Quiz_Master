package com.tshepo.QuizMaster.Controller;

import com.tshepo.QuizMaster.Model.Admin;
import com.tshepo.QuizMaster.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    //creating a get mapping that retrieves all
    // the admins detail from the database
    @GetMapping
    public ResponseEntity<List<Admin>> getAllAdmins() {
        List<Admin> admin = adminService.getAllAdmin();

        return new ResponseEntity<>(admin, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a get mapping that retrieves the detail of a specific admin
    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long id) throws Exception {
        Admin admin = adminService.getAdminById(id);
        return new ResponseEntity<>(admin, new HttpHeaders(), HttpStatus.OK);
    }
    //creating post mapping that post the admin detail in the database
    @PostMapping
    public ResponseEntity<Admin> saveOrUpdate(Admin admin) {
        Admin updated = adminService.saveOrUpdate(admin);
        return new ResponseEntity<>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    //creating a delete mapping that deletes a specific admin
    @DeleteMapping("/{id}")
    public HttpStatus deleteAdminById(@PathVariable("id") Long id) throws Exception {
        adminService.deleteAdminById(id);
        return HttpStatus.FORBIDDEN;
    }
}
