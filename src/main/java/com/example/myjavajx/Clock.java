package com.example.myjavajx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Clock extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + "-" + clock.getMinute() + "-" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);


        // place clock in the border pane

        BorderPane pane = new BorderPane(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);


        // CREATE A SCENE AND PLACE THE STAGE

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Francis Clock");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}


