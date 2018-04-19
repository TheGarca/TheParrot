package com.theparrot.controller;


import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
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

}