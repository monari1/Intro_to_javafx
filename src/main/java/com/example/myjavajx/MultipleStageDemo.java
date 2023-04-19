package com.example.myjavajx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {


    @Override
    public void start(Stage primaryStage) {
        // create a scene and place a button in the scene
        Scene scene = new Scene(new Button("Stage One"), 300, 300);
        primaryStage.setTitle("Stage1"); // set stage title
        primaryStage.setScene(scene); // place the scene in the stage
        primaryStage.show(); // display the stage

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("Stage Two"),300, 300) );
        stage.show();
    }
}
