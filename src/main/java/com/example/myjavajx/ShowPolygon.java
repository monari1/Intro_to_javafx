package com.example.myjavajx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ShowPolygon extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyPolygon());
        primaryStage.setTitle("My Polygon");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

class MyPolygon extends Pane{

    public void paint(){
        Polygon polygon = new Polygon();
        polygon.setFill(Color.DARKGOLDENROD);
        polygon.setStroke(Color.DARKGREEN);
        ObservableList<Double> list = polygon.getPoints();

        double centerX = getWidth()/2,  centerY = getHeight()/2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;

        for (int i = 0; i < 6; i++){
            list.add(centerX + radius + Math.cos(2*Math.PI /6));
            list.add(centerY - radius + Math.sin(2*Math.PI /6));

        }


    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height){
        super.setHeight(height);
        paint();


    }

}
