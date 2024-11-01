package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextFlagApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fmxloader = new FXMLLoader(getClass().getResource("text-flag-view.fxml"));
        Scene scene = new Scene(fmxloader.load(), 320, 240);
        primaryStage.setTitle("Text flag");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}