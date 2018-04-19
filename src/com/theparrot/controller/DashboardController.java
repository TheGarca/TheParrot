package com.theparrot.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Eduardo Queiroz
 */
public class DashboardController implements Initializable {

    @FXML
    private AnchorPane content;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void OpenList(ActionEvent event) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../view/List.fxml"));
        content.getChildren().setAll(root);
    }

    @FXML
    private void CadastroProjeto(ActionEvent event) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../view/CadastroProjeto.fxml"));
        content.getChildren().setAll(root);
    }


    @FXML
    private void ShowPerfil(ActionEvent event) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../view/Profile.fxml"));
        content.getChildren().setAll(root);
    }



    @FXML
    private void Time(ActionEvent event) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../view/Time.fxml"));
        content.getChildren().setAll(root);
    }
}