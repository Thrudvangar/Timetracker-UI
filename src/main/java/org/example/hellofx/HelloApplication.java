package org.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    public static void main(String[] args) {
        /*
        --module-path
        /Users/robinsiebert/Desktop/javafx-sdk-23.0.1/lib
        --add-modules
        javafx.controls,javafx.fxml
         */
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Stage primaryStage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.LINEN);

        //Image icon = new Image("Timetracker_Icon.png");
        //stage.getIcons().add(icon);
        stage.setTitle("Timetracker");
        stage.setWidth(800);
        stage.setHeight(600);

        Text text = new Text();
        text.setText("Hello World!");
        text.setX(10);
        text.setY(10);
        text.setFont(Font.font("Verdana", 16));
        text.setFill(Color.FIREBRICK);

        //Line
        Line line = new Line();
        line.setStartX(20);
        line.setStartY(20);
        line.setEndX(200);
        line.setEndY(20);
        line.setOpacity(0.5);

        //Rechteck
        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setFill(Color.FIREBRICK);




        root.getChildren().add(text);

        /*
        stage.setResizable(false);
        stage.setX(0);
        stage.setY(0);
         */


        stage.setScene(scene);
        stage.show();
    }
}