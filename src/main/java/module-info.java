module com.example.scm {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.scm to javafx.fxml;
    exports com.example.scm;
}