module com.example.myjavajx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.myjavajx to javafx.fxml;
    exports com.example.myjavajx;
}