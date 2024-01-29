module etg.dev {
    requires javafx.controls;
    requires javafx.fxml;

    opens etg.dev to javafx.fxml;
    exports etg.dev;
}
