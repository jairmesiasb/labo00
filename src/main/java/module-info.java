module com.example.labo00 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.labo00 to javafx.fxml;
    exports com.example.labo00;
}