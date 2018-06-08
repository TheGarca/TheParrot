package com.theparrot.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import com.theparrot.Model.Interfaces.ImplementProject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroProjetoController implements Initializable {

    private final ImplementProject implementProject = new ProjectDAO();

    @FXML
    private JFXButton btn_salvar;

    @FXML
    private JFXTextField Nome, Valor;
    
    @FXML
    private JFXDateTime Final;

    @FXML
    private JFXTextArea Descricao;

    @FXML
    private void salvar(ActionEvent event) throws Exception {
        boolean res = this.insert();
        System.out.println("Resultado do inserte: " + res);
    }

    private boolean insert() {
        try {
            Project project = new Project();
            project.setNome(Nome.getText());
            project.setValor(Valor.getText());
            project.setDataFinal(Final.getText());
            project.setDescricao(Descricao.getText());            
            project.setEmpresaId(0);
            implementProject.insert(project);
            return true;
        } catch (Exception e) {
            System.out.println("Erro no inserte de projeto: " + e);
            return false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


}