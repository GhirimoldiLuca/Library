module library {
    requires javafx.controls;
    requires javafx.fxml;

    opens library.main to javafx.fxml;
    opens library.users to javafx.fxml;
    opens library.controller to javafx.fxml;

    exports library.main;
    exports library.users;
    exports library.controller;
}
