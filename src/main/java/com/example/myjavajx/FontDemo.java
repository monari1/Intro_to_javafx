package com.example.myjavajx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;



public class FontDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new StackPane();

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setFill(new Color(0.5, 0.6, 0.4,0.2));
        pane.getChildren().add(circle);


        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Font Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
