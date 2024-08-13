package com.springSecured.MedisourceBackend.dto;

import com.springSecured.MedisourceBackend.entities.ApplicationUser;

public class LoginResponseDTO {
    private ApplicationUser user;
    private String jwt;

    public LoginResponseDTO(){
        super();
    }

    public LoginResponseDTO( String jwt){

        this.jwt = jwt;
    }



    public String getJwt(){
        return this.jwt;
    }

    public void setJwt(String jwt){
        this.jwt = jwt;
    }

}
