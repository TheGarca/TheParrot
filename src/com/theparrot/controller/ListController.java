package com.theparrot.controller;

import com.theparrot.Model.DAO.ProjectDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import com.theparrot.Model.Interfaces.ImplementProject;
import com.theparrot.Model.Project;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.stage.Stage;

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

    private void refreshNodes() {
        List<Project> project = implementProject.getAllProject();
        pnl_scroll.getChildren().clear();


        for (int i = 0; i < project.size(); i++) {
            try {
                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader();
                Parent root = loader.load(getClass().getResource("../view/Item.fxml").openStream());
                ItemController cont = (ItemController) loader.getController();
                cont.setCliente(project.get(i).getEmpresa().getName());
                cont.setDescricao(project.get(i).getDescricao());
                cont.setEmpresa(project.get(i).getEmpresa().getCompany());
                cont.setValor(project.get(i).getValor());
             

                pnl_scroll.getChildren().add(root);

            } catch (IOException ex) {
                Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
