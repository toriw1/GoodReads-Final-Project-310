module edu.guilford {
    requires javafx.controls;
    requires javafx.fxml;
    requires poi;
    requires poi.ooxml;
    requires poi.ooxml.schemas;
    
    opens edu.guilford to javafx.fxml;
    exports edu.guilford;
}
