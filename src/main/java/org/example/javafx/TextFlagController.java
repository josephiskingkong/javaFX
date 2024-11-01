package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TextFlagController {

    @FXML
    private RadioButton topRed, topGreen, topBlue;
    @FXML
    private RadioButton middleRed, middleGreen, middleBlue;
    @FXML
    private RadioButton bottomRed, bottomGreen, bottomBlue;

    @FXML
    private Button drawButton;
    @FXML
    private Label resultLabel;

    @FXML
    public void initialize() {
        ToggleGroup topGroup = new ToggleGroup();
        ToggleGroup middleGroup = new ToggleGroup();
        ToggleGroup bottomGroup = new ToggleGroup();

        topRed.setToggleGroup(topGroup);
        topGreen.setToggleGroup(topGroup);
        topBlue.setToggleGroup(topGroup);

        middleRed.setToggleGroup(middleGroup);
        middleGreen.setToggleGroup(middleGroup);
        middleBlue.setToggleGroup(middleGroup);

        bottomRed.setToggleGroup(bottomGroup);
        bottomGreen.setToggleGroup(bottomGroup);
        bottomBlue.setToggleGroup(bottomGroup);

        drawButton.setOnAction(event -> drawFlag());
    }

    private void drawFlag() {
        try {
            String topColor = ((RadioButton) topRed.getToggleGroup().getSelectedToggle()).getText();
            String middleColor = ((RadioButton) middleRed.getToggleGroup().getSelectedToggle()).getText();
            String bottomColor = ((RadioButton) bottomRed.getToggleGroup().getSelectedToggle()).getText();

            resultLabel.setText(topColor + ", " + middleColor + ", " + bottomColor);
        } catch (Exception e) {
            resultLabel.setText("Error");
        }
    }
}