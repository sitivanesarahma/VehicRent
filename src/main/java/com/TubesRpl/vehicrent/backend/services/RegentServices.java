package com.TubesRpl.vehicrent.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.TubesRpl.repository.RegentRepository;
import com.TubesRpl.repository.UserRepository;
import com.TubesRpl.vehicrent.backend.models.Regent;
import com.TubesRpl.vehicrent.backend.models.User;
import com.TubesRpl.vehicrent.backend.payloads.response.Response;

@Service
public class RegentServices implements BaseServices<Regent>{
    @Autowired
    private RegentRepository regentRepository;
    private UserRepository userRepository;

    @Override
    public Response DisplayAllData(){
        List<Regent> allRegent = new ArrayList<>();
        regentRepository.findAll().forEach(allRegent::add);
        for (Regent regent : allRegent){
            System.out.println("ID Regent: " + regent.getID_Regent());
            System.out.println("NIK User: " + regent.getUser());
            System.out.println("Norek Regent: " + regent.getNorek_Regent());
        }
        return new Response(HttpStatus.OK.value(), "Success", allRegent);
    }

    @Override
    public Response Create(Regent model){
        try{
            regentRepository.save(model);
            return new Response(HttpStatus.OK.value(), "Success", model);
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", model);
        }
    }

    @Override
    public Response Update(Integer id, Regent model){
        try{
            Regent regent = regentRepository.findById(id).orElse(null);
            if (regent != null){
                regent.setUser(model.getUser());
                regent.setNorek_Regent(model.getNorek_Regent());
                regentRepository.save(regent);
                return new Response(HttpStatus.OK.value(), "Success", regent);
            }else{
                return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
            }
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response Delete(Integer id){
        try{
            Regent regent = regentRepository.findById(id).orElse(null);
            if (regent != null){
                regentRepository.delete(regent);
                return new Response(HttpStatus.OK.value(), "Success", regent);
            }else{
                return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
            }
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }
}
