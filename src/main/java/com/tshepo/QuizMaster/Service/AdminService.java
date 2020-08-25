package com.tshepo.QuizMaster.Service;

import com.tshepo.QuizMaster.Model.Admin;
import com.tshepo.QuizMaster.Model.Recruit;
import com.tshepo.QuizMaster.Repository.AdminRepositoryInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    AdminRepositoryInterface adminRepositoryInterface;

    //getting all student records
    public List<Admin> getAllAdmin(){
        List<Admin> admins = new ArrayList<>();
        adminRepositoryInterface.findAll().forEach(admins::add);
        return admins;
    }

    //getting a specific record
    public Admin getAdminById(long id) {
        return adminRepositoryInterface.findById((id)).get();
    }
    //save or update a specific record
    public void saveOrUpdate(Admin admin){
        adminRepositoryInterface.save(admin);
    }

    //deleting a specific record
    public void delete(Long id){
        adminRepositoryInterface.deleteById(id);
    }
}
