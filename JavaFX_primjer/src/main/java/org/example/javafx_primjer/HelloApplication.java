package org.example.javafx_primjer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        primaryStage.setTitle("Prijava");
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();

        // Dugme razvuceno preko cijelog stagea
//        Scene scene  = new Scene(new Button("OK"), 200,100);
//        primaryStage.setTitle("I don't know what I am doing");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        Stage stage = new Stage();
//        stage.setTitle("I don't know nothing times 2");
//        stage.setScene(new Scene(new Button("New stage"),100,100));
//        stage.show();

//        StackPane pane = new StackPane();
//        pane.getChildren().add(new Button("Ouki dok"));
//        Scene scene = new Scene(pane, 400,200);
//        primaryStage.setTitle("I don't know what I am doing");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        //Vedran primjer zadatak

    }

    public static void main(String[] args) {
        launch();
    }
}