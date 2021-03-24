package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;


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
        stage.show();

        Button btn = new Button("Hello World!!");
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,600,400);

        stage.setScene(scene);
        stage.setTitle("First JavaFX Application");
        stage.show();*/
    }

    public static void main(String[] args)
    {
        //launch();

        UserSimple norman = new UserSimple("Norman", "Test", 26, true);
        UserSimple quenton = new UserSimple("Quenton", "test@github.com", 26, true);
        System.out.println(norman.getAge());
        System.out.println(quenton.getEmail());

        //Create the file if it doesn't exist. If the file doesn't exist, it will be created
        try
        {
            File fptr = new File("fptr.txt");
            if (fptr.createNewFile())
            {
                System.out.println("File created: " + fptr.getName());
            }
            else
            {
                System.out.println("File exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        //Try writing a line on the newly created file
        try
        {
            FileWriter myWriter = new FileWriter("fptr.txt");
            myWriter.write("This is a bloody pain in the arse!!");
            myWriter.close();
            System.out.println("Wrote to the file");
        }
        catch (IOException we)
        {
            System.out.println("An error occured when attempting to write to file");
            we.printStackTrace();
        }
    }
}
