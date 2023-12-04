package com.TubesRpl.vehicrent.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TubesRpl.vehicrent.backend.models.User;
import com.TubesRpl.vehicrent.backend.payloads.response.Response;
import com.TubesRpl.vehicrent.backend.services.BaseServices;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private BaseServices<User> display;

    @RequestMapping("/display")
    public ResponseEntity<?> index(){
        Response alluser = display.DisplayAllData();
        return ResponseEntity.status(200).body(alluser);
    }

    @PostMapping("/createuser")
    public ResponseEntity<?> CreateAccount(){
        Response alluser = display.Create(new User());
        return ResponseEntity.status(200).body(alluser);
    }

    @UpdateMapping("/createuser/{id}")
    public ResponseEntity<?> UpdateAccount(){
        Response alluser = display.Update(null, new User());
        return ResponseEntity.status(200).body(alluser);
    }

}
