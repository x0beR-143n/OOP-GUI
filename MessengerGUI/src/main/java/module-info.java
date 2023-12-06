module com.example.messengergui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.messengergui to javafx.fxml;
    exports com.example.messengergui;
}