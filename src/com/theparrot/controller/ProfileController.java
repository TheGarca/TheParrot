/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.theparrot.Model.DAO.UserDAO;
import com.theparrot.Model.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author gustavomiara
 */


public class ProfileController implements Initializable {
    
    User user = new User();
    
    @FXML
    private JFXButton btn_salvar, btn_cancelar;

    @FXML
    private JFXTextField txt_name, txt_company, txt_email, txt_fone;

    @FXML
    private JFXPasswordField txt_password, txt_r_password;


    public JFXTextField getTxt_name() {
        return txt_name;
    }

    public void setTxt_name(JFXTextField txt_name) {
        this.txt_name = txt_name;
    }

    public JFXTextField getTxt_company() {
        return txt_company;
    }

    public void setTxt_company(JFXTextField txt_company) {
        this.txt_company = txt_company;
    }

    public JFXTextField getTxt_email() {
        return txt_email;
    }

    public void setTxt_email(JFXTextField txt_email) {
        this.txt_email = txt_email;
    }

    public JFXTextField getTxt_fone() {
        return txt_fone;
    }

    public void setTxt_fone(JFXTextField txt_fone) {
        this.txt_fone = txt_fone;
    }

    public JFXPasswordField getTxt_password() {
        return txt_password;
    }

    public void setTxt_password(JFXPasswordField txt_password) {
        this.txt_password = txt_password;
    }

    public JFXPasswordField getTxt_r_password() {
        return txt_r_password;
    }

    public void setTxt_r_password(JFXPasswordField txt_r_password) {
        this.txt_r_password = txt_r_password;
    }
    

    public void loadUser() {
        System.out.println("Imprimindo usuário!");
        UserDAO.user.toString();
        txt_name.setText(UserDAO.user.getName());
        txt_company.setText(UserDAO.user.getCompany());
        txt_email.setText(UserDAO.user.getEmail());
        txt_fone.setText(UserDAO.user.getFoneNumber());
        txt_password.setText(UserDAO.user.getPassword());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.loadUser();
    }    
    
}
