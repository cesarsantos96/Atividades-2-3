module com.example.atividades23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividades23 to javafx.fxml;
    exports com.example.atividades23;
}