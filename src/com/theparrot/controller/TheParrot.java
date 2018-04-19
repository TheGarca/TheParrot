/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.controller;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author gustavomiara
 */
public class TheParrot extends Application {
    
    public double xOffSet = 0;
    public double yOffSet = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        
        /*
         * Moving frames
        */
        
        root.setOnMousePressed(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffSet);
                stage.setY(event.getScreenY() - yOffSet);
            }
        });
        
        root.setOnMouseDragged(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffSet);
                stage.setY(event.getScreenY() - yOffSet);
            }
        });
        
        Scene scene = new Scene(root);
        
        /*
        *   Set transparent
        */
        scene.setFill(Color.TRANSPARENT);  
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
