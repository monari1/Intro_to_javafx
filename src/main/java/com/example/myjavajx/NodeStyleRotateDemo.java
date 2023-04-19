package com.example.myjavajx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start (Stage primaryStage){
        StackPane pane = new StackPane();
        Button btok = new Button("OK");
        btok.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btok);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: blue; -fx-background-color: yellow;");

        Scene scene = new Scene(pane, 300,300);
        primaryStage.setTitle("Node Rotate/Style Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
