package org.example.javafx_primjer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class HelloController {

    public TextField fieldUsername;

    @FXML
    public void initialize(){
        fieldUsername.getStyleClass().add("poljeNijeIspravno");
        fieldUsername.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if(fieldUsername.getText().trim().isEmpty()){
                    fieldUsername.getStyleClass().removeAll("poljeJeIspravno");
                    fieldUsername.getStyleClass().add("poljeNijeIspravno");
            }else{
                    fieldUsername.getStyleClass().removeAll("poljeNijeIspravno");
                    fieldUsername.getStyleClass().add("poljeJeIspravno");
                }
        }});
    }


    @FXML
    public void buttonClick() throws IOException {
        if(fieldUsername.getText().isEmpty()){
            fieldUsername.getStyleClass().add("poljeNijeIspravno");
            return;
        }
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("noviprozor.fxml"));
        Parent root = loader.load();
        Noviprozor noviprozor = loader.getController();
        noviprozor.labela.setText("Zdravo " + fieldUsername.getText());
        stage.setTitle("Novi prozor");
        stage.setScene(new Scene(root, USE_COMPUTED_SIZE,USE_COMPUTED_SIZE ));
        stage.show();


    }

}