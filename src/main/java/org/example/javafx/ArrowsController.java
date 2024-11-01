package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class ArrowsController {
    @FXML
    private TextField topInput;
    @FXML
    private TextField bottomInput;
    @FXML
    private Button arrowButton;

    @FXML
    protected void onArrowButtonClick() {
        if (Objects.equals(arrowButton.getText(), "▼")) {
            bottomInput.setText(topInput.getText());
            topInput.setText("");
            arrowButton.setText("▲");
        } else {
            topInput.setText(bottomInput.getText());
            bottomInput.setText("");
            arrowButton.setText("▼");
        }
    }
}