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
   
    private String nome;
    private String empresa;
    private String email;
    private String telefone;
    private String senha;

    public User() {
    }

    public User(String nome, String empresa, String email, String telefone, String senha) {
        this.nome = nome;
        this.empresa = empresa;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", empresa=" + empresa + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + '}';
    }
    
    
    
    
}
