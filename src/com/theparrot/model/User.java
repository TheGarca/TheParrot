/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.model;

/**
 *
 * @author gustavomiara
 */
public class User {

    private String name;
    private String username;
    private String email;
    private String senha;

    public User() {
    }

    public User(String name, String username, String email, String senha) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", username=" + username + ", email=" + email + ", senha=" + senha + '}';
    }
    
    

}
