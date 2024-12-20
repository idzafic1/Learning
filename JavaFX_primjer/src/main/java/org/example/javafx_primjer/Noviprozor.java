package org.example.javafx_primjer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Noviprozor {

    public Label labela;

    public void buttonZatvoriClick(ActionEvent actionEvent) {
        Stage stage = (Stage) labela.getScene().getWindow();
        stage.close();
    }
}
