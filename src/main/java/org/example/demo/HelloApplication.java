package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
       // stage.setTitle("Hello!");
       // stage.setScene(scene);
        //stage.show();
        Stage stage1=new Stage();
        stage1.setTitle("Hello!");
        //stage1.setColour("red");
       // stage1.show();
        Scene scene = new Scene(FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml")), 320, 240);
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}