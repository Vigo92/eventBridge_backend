package com.example.eventBridge_backend.payload;


import lombok.Data;

@Data
public class PersonDto {

    private Long personId;
    private String email;
    private String firstName;
    private String lastName;
    private String password;


}
