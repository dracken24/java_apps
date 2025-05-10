module dracken.example01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens dracken.example01 to javafx.fxml;
    exports dracken.example01;
}
