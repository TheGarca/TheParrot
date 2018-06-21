package com.theparrot.controller;

import com.jfoenix.controls.JFXTextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class ItemController implements Initializable {

    @FXML 
    private Label valor;
    @FXML 
    private Label empresa;
    @FXML 
    private Label cliente;
    @FXML 
    private Label descricao;

    public Label getValor() {
        return valor;
    }

    public void setValor (String vl) {
        valor.setText(vl);
    }

    public Label getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String emp) {
        empresa.setText(emp);
    }

    public Label getCliente() {
        return cliente;
    }

    public void setCliente(String cli) {
        cliente.setText(cli);
    }

    public Label getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        descricao.setText(desc);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
