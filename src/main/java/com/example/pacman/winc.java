package com.example.pacman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class winc {

    @FXML
    private Button playagainb;
    @FXML
    private void playagain() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) playagainb.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    }
