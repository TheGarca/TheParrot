/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import com.theparrot.Model.DAO.CourseDAO;
import com.theparrot.Model.DAO.UserDAO;
import com.theparrot.Model.Interfaces.ImplementUser;
import com.theparrot.Model.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gustavomiara
 */
public class UserRegisterController implements Initializable {

    private final ImplementUser implementUser = new UserDAO();

    public UserRegisterController() {
        System.err.println("Contrutor");
    }

    @FXML
    private JFXButton btn_salvar, btn_cancelar;

    @FXML
    private JFXTextField txt_name, txt_company, txt_email, txt_fone;

    @FXML
    private JFXPasswordField txt_password, txt_r_password;

    @FXML
    private void genericButton(ActionEvent event) {

    }

    @FXML
    private void salvar(ActionEvent event) throws Exception {
        boolean res = this.insert();
        System.out.println("Resultado do inserte: " + res);

        if (res) {
            System.out.println("Evento =>" + event);
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("../view/Dashboard.fxml"));
            Scene home_page_scene = new Scene(home_page_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            if (true) {
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
                app_stage.show();
            } else {
            }
        }

    }

    private boolean insert() {
        try {
            User user = new User();
            user.setName(txt_name.getText());
            user.setCompany(txt_company.getText());
            user.setEmail(txt_email.getText());
            user.setFoneNumber(txt_fone.getText());
            user.setPassword(txt_password.getText());
            System.out.println("usuário: " + user.toString());
            implementUser.insert(user);
            System.out.print("usuário: " + user.toString());
            return true;
        } catch (Exception e) {
            System.out.println("Erro no inserte de usuario: " + e);
            return false;
        }
    }

    @FXML
    private void cancelar(ActionEvent event) throws Exception {
        Parent register_page_parent = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        Scene register_page_scene = new Scene(register_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (true) {
            app_stage.hide(); //optional
            app_stage.setScene(register_page_scene);
            app_stage.show();
        } else {
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        System.out.println("Teste");
    }

}
