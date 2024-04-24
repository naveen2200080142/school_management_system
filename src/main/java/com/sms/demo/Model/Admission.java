package com.sms.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String lastName;
    private String username;
    private String password;
    private String cl;
    private String roll;
    private String mobile;
    private double fee;

    // Getters and setters
}
