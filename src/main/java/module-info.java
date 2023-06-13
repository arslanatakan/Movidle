module com.projedemo.projedemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;


    opens com.projedemo.projedemo to javafx.fxml;
    exports com.projedemo.projedemo;
}