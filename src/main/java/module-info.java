module library {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens library.main to javafx.fxml;
    exports library.main;
    opens library.controller to javafx.fxml;
    exports library.controller;
}
