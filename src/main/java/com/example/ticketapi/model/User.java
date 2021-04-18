package com.example.ticketapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


// This indicates mongodb this is a document of user type, @Document automatically imports it.
@Document("user")
public class User {
    //Marks the following field as ID;
    @Id
    private String id;
    @Field(name = "name")
    private String name;
    @Field(name = "email")
    @Indexed(unique = true)
    private String email;

    //Constructor
    public User(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String getId(){
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
