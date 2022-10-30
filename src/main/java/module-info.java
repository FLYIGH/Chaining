module com.example.chainsupp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.chainsupp to javafx.fxml;
    exports com.example.chainsupp;
}