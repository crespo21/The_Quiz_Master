package com.tshepo.QuizMaster.Controller;

import com.tshepo.QuizMaster.Model.Admin;
import com.tshepo.QuizMaster.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    AdminService adminService;

    //creating a get mapping that retrieves all
    // the recruits detail from the database
    @GetMapping("/recruits")
    private List<Admin> getAllRecruits(){
        return this.adminService.getAllAdmin();
    }

    //creating a get mapping that retrieves the detail of a specific recruit
    @GetMapping("/recruit/{id}")
    private Admin getRecruit(@PathVariable("id") long id){
        return adminService.getAdminById(id);
    }

    //creating a delete mapping that deletes a specific recruit
    @DeleteMapping("/recruit/{id}")
    public void deleteRecruit(@PathVariable("id") long id){
        adminService.delete(id);
    }

    //creating post mapping that post the recruit detail in the database
    @PostMapping("/recruit")
    public long saveRecruit(@RequestBody Admin admin){
        adminService.saveOrUpdate(admin);
        return admin.getAdminId();
    }
}
