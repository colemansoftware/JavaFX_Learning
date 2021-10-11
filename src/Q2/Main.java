/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * Coleman DeMars
 * CSCI 2070
 * April 1 2019
 * 
 * Program creates GUI that asks for users title, first, middle, and last name.
 * Program then has 6 formats that formats the data provided.
 * 
 * @author colem
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label fnL = new Label("First name:");//first name label
        Label mnL = new Label("Middle name:");//Middle name label
        Label lnL = new Label("Last name:");//last name label
        Label titleL = new Label("Title:");//Title label
        
        TextField fn = new TextField();//Text Field for first name
        TextField mn = new TextField();//Text Field for middle name
        TextField ln = new TextField();//Text Field for last name
        TextField title = new TextField();//Text Field for title
        
        HBox hboxFN = new HBox(10, fnL, fn);//create Hbox For First name
        hboxFN.setAlignment(Pos.TOP_CENTER);
        HBox hboxMN = new HBox(10, mnL, mn);//create Hbox For First name
        hboxMN.setAlignment(Pos.TOP_CENTER);
        HBox hboxLN = new HBox(10, lnL, ln);//create Hbox For First name
        hboxLN.setAlignment(Pos.TOP_CENTER);
        HBox hboxT = new HBox(10, titleL, title);//create Hbox For First name
        hboxT.setAlignment(Pos.TOP_CENTER);//create Hbox for Label
        Label lb1 = new Label();
        HBox hboxLabel = new HBox(10, lb1);
        
        Button btn1 = new Button("Format 1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText(title.getText() + " " +  fn.getText() + " " + mn.getText() + " " + ln.getText());//format for button1
            }
        });//format for format 1 button
        Button btn2 = new Button("Format 2");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText(fn.getText() + " " + mn.getText() + " " + ln.getText());
            }
        });//format for format 2 button
        Button btn3 = new Button("Format 3");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText(fn.getText() + " " + ln.getText());
            }
        });//format for format 3 button
        Button btn4 = new Button("Format 4");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText(ln.getText() + ", " + fn.getText() + " " + mn.getText() + ", " + title.getText());
            }
        });//format for format 4 button
        Button btn5 = new Button("Format 5");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText(ln.getText() + ", " + fn.getText() + " " + mn.getText());
            }
        });//format for format 5 button
        Button btn6 = new Button("Format 6");
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText(ln.getText() + ", " + fn.getText());
            }
        });//format for format 6 button
        
        HBox btns = new HBox(10, btn1, btn2, btn3, btn4, btn5, btn6);//puts the buttons in a HBox
        btns.setAlignment(Pos.TOP_CENTER);//center the buttons
        
        VBox vbox = new VBox(10, hboxFN, hboxMN, hboxLN, hboxT, btns, hboxLabel);//sets width apart from each button and put in Vbox
        vbox.setAlignment(Pos.TOP_CENTER);//center the buttons
        vbox.setPadding(new Insets(10));//add padding to entire vbox
        Scene scene = new Scene(vbox, 550, 250);//set scene with parameters
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
