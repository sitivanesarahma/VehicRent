package com.TubesRpl.vehicrent.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.TubesRpl.repository.RegentRepository;
import com.TubesRpl.vehicrent.backend.models.Regent;
import com.TubesRpl.vehicrent.backend.models.User;
import com.TubesRpl.vehicrent.backend.payloads.requests.RegentRequest;
import com.TubesRpl.vehicrent.backend.payloads.response.Response;

@Service
public class RegentServices implements RoleServices<RegentRequest> {
    @Autowired
    private RegentRepository regentRepository;

    @Override
    public Response DisplayAllData() {
        List<Regent> allRegent = new ArrayList<>();
        regentRepository.findAll().forEach(allRegent::add);
        for (Regent regent : allRegent) {
            System.out.println("ID Regent: " + regent.getID_Regent());
            System.out.println("NIK User: " + regent.getUser());
            System.out.println("Norek Regent: " + regent.getNorek_Regent());
        }
        return new Response(HttpStatus.OK.value(), "Success", allRegent);
    }

    @Override
    public Response Create(RegentRequest request) {
        try {
            Regent regentTemp = regentRepository.findById(request.getNIK_User()).orElse(null);
            if (regentTemp != null) {
                return new Response(HttpStatus.BAD_REQUEST.value(), "Regent already exist", null);
            }
            Regent regent = new Regent();
            User user = new User();
            user.setNIK_User(request.getNIK_User());
            user.setRole_User(request.getRole_User());
            user.setNama_User(request.getNama_User());
            user.setJenisKelamin_User(request.getJenisKelamin_User());
            user.setUmur_User(request.getUmur_User());
            user.setEmail_User(request.getEmail_User());
            user.setUsername(request.getUsername());
            user.setPassword(request.getPassword());
            regent.setUser(user);
            regent.setNorek_Regent(request.getNorek_Regent());
            regent.setListKendaraan(request.getListKendaraan());
            regentRepository.save(regent);
            return new Response(HttpStatus.OK.value(), "Success", regent);
        } catch (Exception e) {
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", request);
        }
    }

    @Override
    public Response Update(Integer id, RegentRequest request) {
        try {
            Regent regent = regentRepository.findById(id).orElse(null);
            if (regent != null) {
                User user = new User();
                user.setNIK_User(request.getNIK_User());
                user.setRole_User(request.getRole_User());
                user.setNama_User(request.getNama_User());
                user.setJenisKelamin_User(request.getJenisKelamin_User());
                user.setUmur_User(request.getUmur_User());
                user.setEmail_User(request.getEmail_User());
                user.setUsername(request.getUsername());
                user.setPassword(request.getPassword());
                regent.setUser(user);
                regent.setNorek_Regent(request.getNorek_Regent());
                regent.setListKendaraan(request.getListKendaraan());
                regentRepository.save(regent);
                return new Response(HttpStatus.OK.value(), "Success", regent);
            } else {
                return new Response(HttpStatus.NOT_FOUND.value(), "Regent not found", request);
            }
        } catch (Exception e) {
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response Delete(Integer id) {
        try {
            Regent regent = regentRepository.findById(id).orElse(null);
            if (regent != null) {
                regentRepository.delete(regent);
                return new Response(HttpStatus.OK.value(), "Success", regent);
            } else {
                return new Response(HttpStatus.NOT_FOUND.value(), "Regent not found", null);
            }
        } catch (Exception e) {
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response DisplayByID(Integer id) {
        try {
            Regent regent = regentRepository.findById(id).orElse(null);
            if (regent != null) {
                System.out.println("ID Regent: " + regent.getID_Regent());
                System.out.println("NIK User: " + regent.getUser());
                System.out.println("Norek Regent: " + regent.getNorek_Regent());
                return new Response(HttpStatus.OK.value(), "Success", regent);
            } else {
                return new Response(HttpStatus.NOT_FOUND.value(), "Regent not found", null);
            }
        } catch (Exception e) {
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }
}
