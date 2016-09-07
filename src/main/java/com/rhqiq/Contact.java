package com.rhqiq;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String profession;

    protected Contact(){}

    public Contact(String name, String email, String profession){
        this.name = name;
        this.email = email;
        this.profession = profession;
    }
}
