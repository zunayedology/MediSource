package com.springSecured.MedisourceBackend.controllers;

import com.springSecured.MedisourceBackend.dto.RegisterResponse;
import com.springSecured.MedisourceBackend.dto.LoginResponseDTO;
import com.springSecured.MedisourceBackend.dto.RegistrationDTO;
import com.springSecured.MedisourceBackend.services.AuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body);
    }
    
    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body);
    }
}   
