package com.example.myjavajx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
  StackPane pane = new StackPane();
//        VBox box = new VBox();
        pane.getChildren().add(new Button("ok"));
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Button in a plane"); // Set stage title
        primaryStage.setScene(scene); // place scene on the stage
        primaryStage.show(); // display the stage
    }
}
