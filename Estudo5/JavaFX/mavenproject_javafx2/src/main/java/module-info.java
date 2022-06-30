module com.mycompany.mavenproject_javafx2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject_javafx2 to javafx.fxml;
    exports com.mycompany.mavenproject_javafx2;
}
