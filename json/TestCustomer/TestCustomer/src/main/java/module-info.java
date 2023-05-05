module com.example.testcustomer {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.testcustomer to javafx.fxml;
    exports com.example.testcustomer;
}