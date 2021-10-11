/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 * Coleman DeMars
 * CSCI 2070
 * April 1 2019
 * 
 * Program creates an GUI tax, tip, and total calculator.
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
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label mealL = new Label("Meal charge:");//first name label
        Label tipL = new Label("Tip:");//Middle name label
        Label taxL = new Label("Tax:");//last name label
        Label totalL = new Label("Total:");//Title label
        /*labels for tip, tax, and total*/
        Label tipLabel = new Label();
        Label taxLabel = new Label();
        Label totalLabel = new Label();
        
        
        TextField meal = new TextField();//Text Field for meal
        HBox hboxMeal = new HBox(10, mealL, meal);//format for meal charge
        
        /*FORMAT THE GRID FOR TIP, TAX, AND TOTAL*/
        GridPane gp = new GridPane();//create gridPane for tip, tax, and total
        GridPane.setConstraints(tipL, 0, 0);
        GridPane.setConstraints(taxL, 0, 1);
        GridPane.setConstraints(totalL, 0, 2);
        GridPane.setConstraints(tipLabel, 1, 0);
        GridPane.setConstraints(taxLabel, 1, 1);
        GridPane.setConstraints(totalLabel, 1, 2);
        gp.getChildren().addAll(tipL, taxL, totalL, tipLabel, taxLabel, totalLabel);
        gp.getColumnConstraints().add(new ColumnConstraints(50));//column 0 is 50 wide
        gp.getRowConstraints().add(new RowConstraints(25));//row 0 is 25 in length
        gp.getRowConstraints().add(new RowConstraints(25));//row 1 is 25 in length
        gp.getRowConstraints().add(new RowConstraints(25));//row 2 is 25 in length
        
        Button btn1 = new Button("Calculate");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double m = Double.parseDouble(meal.getText());//get meal charge and parse to double
                tipLabel.setText(String.format("%,.2f", m * .18));//output tip
                taxLabel.setText(String.format("%,.2f", m * .07));//output tax
                totalLabel.setText(String.format("%,.2f", (m * .18) + (m * .07) + m));//output total
            }
        });//format for calculate button
        
        HBox btns = new HBox(10, btn1);//puts the button in a HBox
        btns.setAlignment(Pos.CENTER);//center the buttons
        
        VBox vbox = new VBox(10, hboxMeal, gp, btns);//sets width apart and puts in Vbox
        vbox.setAlignment(Pos.TOP_CENTER);//center the controls
        vbox.setPadding(new Insets(10));//add padding to entire vbox
        Scene scene = new Scene(vbox, 325, 175);//set scene with parameters
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
