package org.example.parkinglotaug25.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;

}
