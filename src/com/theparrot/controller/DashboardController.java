package com.theparrot.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Eduardo Queiroz
 */
public class DashboardController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private AnchorPane content;

    @FXML
    private VBox pnl_scroll;

    @FXML
    private void handleButtonAction(MouseEvent event) {
        refreshNodes();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        refreshNodes();
    }

    private void refreshNodes()
    {
        pnl_scroll.getChildren().clear();

        Node [] nodes = new  Node[15];

        for(int i = 0; i<10; i++)
        {
            try {
                nodes[i] = (Node)FXMLLoader.load(getClass().getResource("../view/Item.fxml"));
                pnl_scroll.getChildren().add(nodes[i]);

            } catch (IOException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}