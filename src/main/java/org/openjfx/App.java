package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application
{

    @Override
    public void start(Stage stage)
    {
        /*var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();*/

        Button btn = new Button("Hello World!!");
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,600,400);

        stage.setScene(scene);
        stage.setTitle("First JavaFX Application");
        stage.show();
    }

    public static void main(String[] args)
    {
        //launch();

        UserSimple norman = new UserSimple("Norman", "Test", 26, true);
        System.out.println(norman.getName());

    }

}