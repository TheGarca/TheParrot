/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.Model;

/**
 *
 * @author gustavomiara
 */
public class User {
   
    private String name;
    private String company;
    private String email;
    private String foneNumber;
    private String password;

    public User() {
    }

    public User(String name, String company, String email, String foneNumber, String password) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.foneNumber = foneNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneNumber() {
        return foneNumber;
    }

    public void setFoneNumber(String foneNumber) {
        this.foneNumber = foneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    
    
}
