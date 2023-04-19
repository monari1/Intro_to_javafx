package com.example.myjavajx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(100);
        circle.setFill(Color.DARKGREEN);
//        circle.setStroke(Color.BLACK);
        // create pane
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // create scene
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
