module com.evaluation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.evaluation to javafx.fxml;

    exports com.evaluation;
}
