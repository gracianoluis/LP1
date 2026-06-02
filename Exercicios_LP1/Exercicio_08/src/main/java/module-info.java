module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example to javafx.fxml;
    exports org.example;
    exports org.example.feira;
    opens org.example.feira to javafx.fxml;
    exports org.example.farmacia;
    opens org.example.farmacia to javafx.fxml;
    exports org.example.farmacia.models;
    opens org.example.farmacia.models to javafx.fxml;
    exports org.example.feira.models;
    opens org.example.feira.models to javafx.fxml;
    exports org.example.feira.controllers;
    opens org.example.feira.controllers to javafx.fxml;
    exports org.example.salao;
    opens org.example.salao to javafx.fxml;
}
