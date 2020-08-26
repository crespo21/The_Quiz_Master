package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Admin;
import com.tshepo.QuizMaster.Repository.AdminRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    AdminRepositoryInterface adminRepositoryInterface;

    //getting all student records
    public List<Admin> getAllAdmin(){
        List<Admin> adminList = adminRepositoryInterface.findAll();
        if(adminList.size() > 0) {
            return adminList;
        } else {
            return new ArrayList<>();
        }
    }

    //getting a specific record
    public Admin getAdminById(long id) throws Exception {
        Optional<Admin> admin= adminRepositoryInterface.findById(id);
        if (admin.isPresent()){
            return admin.get();
        } else {
              throw new Exception( "no admin record for given id");
        }
    }
    //save or update a specific record
    public Admin saveOrUpdate(Admin admin){
        Optional<Admin> optionalAdmin= adminRepositoryInterface.findById(admin.getAdminId());
        if(optionalAdmin.isPresent())
        {
            Admin newAdmin = optionalAdmin.get();
            newAdmin.setAdminId(admin.getAdminId());
            newAdmin.setAdminName(admin.getAdminName());
            newAdmin.setAdminSurnameName(admin.getAdminSurnameName());
            newAdmin.setAdminEmail(admin.getAdminEmail());
            newAdmin.setDepartment(admin.getDepartment());
            newAdmin.setRecruits(admin.getRecruits());
            newAdmin.setQuizzes(admin.getQuizzes());
            newAdmin.setAdminPassword(admin.getAdminPassword());

            newAdmin = adminRepositoryInterface.save(newAdmin);

            return newAdmin;
        } else {
            admin = adminRepositoryInterface.save(admin);

            return admin;
        }
    }

    //deleting a specific record
    public void deleteAdminById(Long id) throws Exception {

        Optional<Admin> admin = adminRepositoryInterface.findById(id);

        if(admin.isPresent())
        {
            adminRepositoryInterface.deleteById(id);
        } else {
            throw new Exception("No admin record exist for given id");
        }
    }
}
