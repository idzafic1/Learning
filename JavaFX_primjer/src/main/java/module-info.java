module org.example.javafx_primjer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.javafx_primjer to javafx.fxml;
    exports org.example.javafx_primjer;
}