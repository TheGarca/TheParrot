/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author gustavomiara
 */
public class UserRegisterController implements Initializable {

    @FXML
    private JFXButton btn_ler_json, btn_gravar_json, btn_ler_txt, btn_gravar_txt, btn_ler_binario, btn_gravar_binario;

    @FXML
    private JFXTextField txt_name, txt_username, txt_email;

    @FXML
    private JFXPasswordField txt_senha, txt_r_senha;

    @FXML
    private void genericButton(ActionEvent event) {

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
