package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class WidgetVisibilityController {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private CheckBox checkbox1;
    @FXML
    private CheckBox checkbox2;
    @FXML
    private CheckBox checkbox3;

    @FXML
    public void initialize() {
        checkbox1.setOnAction(event -> button1.setVisible(checkbox1.isSelected()));
        checkbox2.setOnAction(event -> button2.setVisible(checkbox2.isSelected()));
        checkbox3.setOnAction(event -> button3.setVisible(checkbox3.isSelected()));
    }
}