package com.theparrot.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import com.theparrot.Model.Interfaces.ImplementProject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListController implements Initializable {

    private final ImplementProject implementProject = new ProjectDAO();

    @FXML
    private Label label;

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
        Project project = implementProject.getAllProject();
        pnl_scroll.getChildren().clear();

        Node[] nodes = new  Node[project.lenght()];

        for(int i = 0; i<10; i++)
        {
            try {
                nodes[i] = (Node) FXMLLoader.load(getClass().getResource("../view/Item.fxml"));
                nodes[i].cliente.setText(project.getEmpresa().company);
                nodes[i].valor.setText(project.getValor());
                nodes[i].local.setText(project.getEmpresa().company);
                
                pnl_scroll.getChildren().add(nodes[i]);

            } catch (IOException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}