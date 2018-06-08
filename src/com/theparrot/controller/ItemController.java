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

    @FXML private Label valor;
    @FXML private Label empresa;
    @FXML private Label cliente;
    @FXML private Label descricao;

    public Label getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor.setText(valor);
    }

    public Label getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa.setText(empresa);
    }

    public Label getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente.setText(cliente);
    }

    public Label getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao.setText(descricao);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
