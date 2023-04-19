package com.example.myjavajx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ShowArc extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {



        Arc arc1 = new Arc(150, 100, 80, 80 , 30+80, 35);
        arc1.setType(ArcType.CHORD);
        arc1.setStroke(Color.YELLOW);
        arc1.setFill(Color.DARKGOLDENROD);

        Arc arc2 = new Arc(150, 100, 80, 80 , 30+180, 35);
        arc2.setType(ArcType.ROUND);
        arc2.setStroke(Color.YELLOW);
        arc2.setFill(Color.DARKGOLDENROD);

        Arc arc3 = new Arc(150, 100, 80, 80 , 30+270, 35);
        arc3.setType(ArcType.OPEN);
        arc3.setStroke(Color.YELLOW);
        arc3.setFill(Color.DARKGOLDENROD);

        Arc arc4 = new Arc(150, 100, 80, 80 , 30, 35);
        arc4.setType(ArcType.CHORD);
        arc4.setStroke(Color.YELLOW);
        arc4.setFill(Color.DARKGOLDENROD);

        Group group = new Group();
        group.getChildren().addAll(arc1, arc2, arc3, arc4);

        Scene scene = new Scene(new BorderPane(group), 300, 300);
        primaryStage.setTitle("ShowArc");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
