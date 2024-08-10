module ca.georgiancollege.assignment2gc1034 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens ca.georgiancollege.assignment2gc1034 to javafx.fxml, com.google.gson;
    exports ca.georgiancollege.assignment2gc1034;
}