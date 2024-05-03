module com.aichat.aichat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aichat.aichat to javafx.fxml;
    exports com.aichat.aichat;
}