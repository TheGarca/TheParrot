/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author gustavomiara
 */
public class LoginController implements Initializable {
    
    @FXML
    private JFXButton btn_signin, btn_signup;
    
    @FXML
    private AnchorPane pn_signin, pn_signup;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_signin){
            pn_signin.toFront();
        }else{
            if(event.getSource() == btn_signup){
                pn_signup.toFront();
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
