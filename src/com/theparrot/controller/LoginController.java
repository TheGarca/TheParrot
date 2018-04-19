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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

    @FXML
    private void login(ActionEvent event) throws Exception {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../view/Dashboard.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (true)
        {
            app_stage.hide(); //optional
            app_stage.setScene(home_page_scene);
            app_stage.show();
        }
        else
        { }
    }

        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
