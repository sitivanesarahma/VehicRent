package com.TubesRpl.vehicrent.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.TubesRpl.repository.StaffRepository;
import com.TubesRpl.vehicrent.backend.models.Staff;
import com.TubesRpl.vehicrent.backend.payloads.response.Response;

@Service
public class StaffServices implements BaseServices<Staff>{
    
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Response DisplayAllData(){
        List<Staff> allStaff = new ArrayList<>();
        staffRepository.findAll().forEach(allStaff::add);
        for (Staff staff : allStaff){
            System.out.println("ID Staff: " + staff.getID_Staff());
            System.out.println("NIK User: " + staff.getUser());
        }
        return new Response(HttpStatus.OK.value(), "Success", allStaff);
    }

    @Override
    public Response Create(Staff model){
        try{
            staffRepository.save(model);
            return new Response(HttpStatus.OK.value(), "Success", model);
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", model);
        }
    }

    @Override
    public Response Update(Integer id, Staff model){
        try{
            Staff staff = staffRepository.findById(id).orElse(null);
            if (staff != null){
                staff.setNIK_User(model.getUser());
                staffRepository.save(staff);
                return new Response(HttpStatus.OK.value(), "Success", staff);
            }else{
                return new Response(HttpStatus.NOT_FOUND.value(), "Staff not found", null);
            }
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response Delete(Integer id){
        try{
            Staff staff = staffRepository.findById(id).orElse(null);
            if (staff != null){
                staffRepository.deleteById(id);
                return new Response(HttpStatus.OK.value(), "Success", staff);
            }else{
                return new Response(HttpStatus.NOT_FOUND.value(), "Staff Not Found", null);
            }
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response DisplayByID(Integer id){
        try{
            Staff staff = staffRepository.findById(id).orElse(null);
            if(staff != null){
                System.out.println("ID Staff: " + staff.getID_Staff());
                System.out.println("NIK User: " + staff.getUser());
                return new Response(HttpStatus.OK.value(), "Success", staff);
            }else{
                return new Response(HttpStatus.NOT_FOUND.value(), "Staff not found", null);
            }
        }
        catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }
}
