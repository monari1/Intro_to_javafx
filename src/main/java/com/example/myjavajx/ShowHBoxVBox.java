package com.example.myjavajx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowHBoxVBox");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private HBox getHBox(){
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science "));
        hBox.getChildren().add(new Button("Chemistry"));
//        ImageView imageView = new ImageView(new Image("image/big.jpg"));
//        hBox.getChildren().add(imageView);
        return hBox;
    }


    private VBox getVBox(){
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15, 15 ,15, 15));
        vBox.getChildren().add(new Label("Course"));
        Label [] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 1303"), new Label("CSCI 1304") };

        for (Label course: courses){
            VBox.setMargin(course, new Insets(0,0,0,15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }
}
