module com.example.prodigy_sd_04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prodigy_sd_04 to javafx.fxml;
    exports com.example.prodigy_sd_04;
}