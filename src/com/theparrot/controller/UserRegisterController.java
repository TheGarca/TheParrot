/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import com.theparrot.model.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.theparrot.provider.ReadAndWrite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
import com.theparrot.provider.AlertBox;

/**
 * FXML Controller class
 *
 * @author gustavomiara
 */
public class UserRegisterController implements Initializable {

    User user;
    ReadAndWrite provider;

    @FXML
    private JFXButton btn_ler_json, btn_gravar_json, btn_ler_txt, btn_gravar_txt, btn_ler_binario, btn_gravar_binario;

    @FXML
    private JFXTextField txt_name, txt_username, txt_email;

    @FXML
    private JFXPasswordField txt_senha, txt_r_senha;

    @FXML
    private void genericButton(ActionEvent event) {

        if (event.getSource() == btn_ler_json) {

//            txt_name.setText(user.getName());
//            txt_username.setText(user.getUsername());
//            txt_email.setText(user.getEmail());
//            txt_senha.setText(user.getSenha());
        } else if (event.getSource() == btn_gravar_json) {
//            user.setName(txt_name.getText());
//            user.setUsername(txt_name.getText());
//            user.setEmail(txt_name.getText());
//            user.setSenha(txt_name.getText());

        } else if (event.getSource() == btn_ler_txt) {

            user = provider.readFileReader();

            txt_name.setText(user.getName());
            txt_username.setText(user.getUsername());
            txt_email.setText(user.getEmail());
            txt_senha.setText(user.getSenha());

            System.out.println("teste btn_ler_txt");

        } else if (event.getSource() == btn_gravar_txt) {

            user.setName(txt_name.getText());
            user.setUsername(txt_name.getText());
            user.setEmail(txt_name.getText());
            user.setSenha(txt_name.getText());

        } else if (event.getSource() == btn_ler_binario) {

//            txt_name.setText(user.getName());
//            txt_username.setText(user.getUsername());
//            txt_email.setText(user.getEmail());
//            txt_senha.setText(user.getSenha());
        } else if (event.getSource() == btn_gravar_binario) {

//            user.setName(txt_name.getText());
//            user.setUsername(txt_name.getText());
//            user.setEmail(txt_name.getText());
//            user.setSenha(txt_name.getText());
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        System.out.println("Teste");
    }

}
