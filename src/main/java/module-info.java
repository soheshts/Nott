module tsohu.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens tsohu.app to javafx.fxml;
    exports tsohu.app;
}