/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package mypackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mpisc
 */
public class JavaFXMainClass extends Application {
    /*
    media, swing, web e swt
    */
    @Override
    public void start(Stage primaryStage) {
      
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            
            Scene scene = new Scene(root, 300, 250);
            
            primaryStage.setTitle("Programação JavaFX");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXMainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
