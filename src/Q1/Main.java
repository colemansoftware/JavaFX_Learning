/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Coleman DeMars
 * CSCI 2070
 * April 1 2019
 * 
 * Program creates GUI with three buttons. On clicking the buttons a label
 * displays the English version of the Latin word.
 * 
 * @author colem
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Sinister");
        Label lb1 = new Label();
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText("Left");
            }
        });//if button one is clicked display left
        
        Button btn2 = new Button("Dexter");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText("Right");
            }
        });//if button one is clicked display right
        
        Button btn3 = new Button("Medium");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText("Center");
            }
        });//if button one is clicked display center
        
        VBox vbox = new VBox(10, btn1, btn2, btn3, lb1);//sets width apart from each button
        vbox.setAlignment(Pos.CENTER);//center the buttons
        Scene scene = new Scene(vbox, 300, 250);//set scene with parameters
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);//launch program
    }
    
}
