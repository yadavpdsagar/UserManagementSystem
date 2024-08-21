package com.userbackend.UserManagementBackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.userbackend.UserManagementBackend.entity.OurUsers;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {
    private int statusCode;
    private String error;
    private String message;
    private String token ;
    private String expirationTime;
    private String refreshToken;
    private String name;
    private String city;
    private String role ;
    private String email;
    private String password;
    private OurUsers ourusers;
    private List<OurUsers> ourUsersList;
}
