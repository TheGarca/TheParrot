package com.theparrot.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.theparrot.Model.DAO.ProjectDAO;
import com.theparrot.Model.DAO.UserDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.theparrot.Model.Interfaces.ImplementProject;
import com.theparrot.Model.Project;
import java.awt.event.ActionEvent;


import java.net.URL;
import java.util.ResourceBundle;


public class CadastroProjetoController implements Initializable {

    private final ImplementProject implementProject = new ProjectDAO();

    @FXML
    private JFXButton btn_salvar;

    @FXML
    private JFXTextField Nome, Valor;
    
    @FXML
    private JFXDatePicker Final;

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
            project.setName(Nome.getText());
            project.setValor(Valor.getText());
            project.setDataFinal(Final.getValue().toString());
            project.setDescricao(Descricao.getText());      
            //Id do usuário, descobri da onde pegar
            project.setEmpresaId(UserDAO.user.getId());
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