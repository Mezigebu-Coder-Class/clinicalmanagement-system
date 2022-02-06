module com.example.tecno {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.tecno to javafx.fxml;
    exports com.example.tecno;
}