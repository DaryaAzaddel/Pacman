package com.example.pacman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class controlmenu {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void swichtomap1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("map1.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void swichtomap2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("map2.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
