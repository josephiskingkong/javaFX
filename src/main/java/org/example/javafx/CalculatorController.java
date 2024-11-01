package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField inputField;
    @FXML
    private Label resultLabel;

    private double result = 0;
    private String currentOperator = "";
    private boolean startNewNumber = true;

    @FXML
    public void initialize() {
        resultLabel.setText("0");
    }

    @FXML
    private void handleNumberInput(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (startNewNumber) {
            inputField.clear();
            startNewNumber = false;
        }
        inputField.appendText(button.getText());
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        Button button = (Button) event.getSource();
        String operator = button.getText();
        try {
            double input = Double.parseDouble(inputField.getText());
            if (currentOperator.isEmpty()) {
                result = input;
            } else {
                calculate(input);
            }
            currentOperator = operator;
            resultLabel.setText(String.valueOf(result));
            startNewNumber = true;
        } catch (NumberFormatException e) {
            inputField.setText("Error");
        }
    }

    @FXML
    private void handleEquals() {
        try {
            double input = Double.parseDouble(inputField.getText());
            calculate(input);
            resultLabel.setText(String.valueOf(result));
            currentOperator = "";
            startNewNumber = true;
        } catch (NumberFormatException e) {
            inputField.setText("Error");
        }
    }

    @FXML
    private void handleClear() {
        inputField.clear();
        resultLabel.setText("0");
        result = 0;
        currentOperator = "";
        startNewNumber = true;
    }

    private void calculate(double input) {
        switch (currentOperator) {
            case "+":
                result += input;
                break;
            case "-":
                result -= input;
                break;
            case "*":
                result *= input;
                break;
            case "/":
                if (input == 0) {
                    inputField.setText("Error: Division by Zero");
                    result = 0;
                    currentOperator = "";
                    startNewNumber = true;
                } else {
                    result /= input;
                }
                break;
        }
    }
}