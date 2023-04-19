package com.example.myjavajx;

import  javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MyJavaFX  extends  Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place a button on the Scene

        Button btok = new Button("first Button");
        Scene scene = new Scene(btok, 700, 700);
        primaryStage.setTitle("myJavaFX"); // set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Displays the stage
    }



//    public static void main(String[] args) {
//        Application.launch();
//    }
}
