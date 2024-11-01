package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import java.util.HashMap;
import java.util.Map;

public class RestaurantOrderController {

    @FXML
    private CheckBox dish1CheckBox;
    @FXML
    private CheckBox dish2CheckBox;
    @FXML
    private CheckBox dish3CheckBox;
    @FXML
    private Spinner<Integer> dish1Spinner;
    @FXML
    private Spinner<Integer> dish2Spinner;
    @FXML
    private Spinner<Integer> dish3Spinner;
    @FXML
    private Button orderButton;

    private final Map<String, Double> dishPrices = new HashMap<>();

    public void initialize() {
        dishPrices.put("Dish 1", 10.0);
        dishPrices.put("Dish 2", 12.5);
        dishPrices.put("Dish 3", 8.0);

        orderButton.setOnAction(event -> showReceipt());
    }

    private void showReceipt() {
        StringBuilder receipt = new StringBuilder("Receipt:\n\n");

        double totalPrice = 0.0;

        if (dish1CheckBox.isSelected()) {
            int quantity = dish1Spinner.getValue();
            double price = dishPrices.get("Dish 1") * quantity;
            receipt.append(String.format("Dish 1: %d x $%.2f = $%.2f\n", quantity, dishPrices.get("Dish 1"), price));
            totalPrice += price;
        }

        if (dish2CheckBox.isSelected()) {
            int quantity = dish2Spinner.getValue();
            double price = dishPrices.get("Dish 2") * quantity;
            receipt.append(String.format("Dish 2: %d x $%.2f = $%.2f\n", quantity, dishPrices.get("Dish 2"), price));
            totalPrice += price;
        }

        if (dish3CheckBox.isSelected()) {
            int quantity = dish3Spinner.getValue();
            double price = dishPrices.get("Dish 3") * quantity;
            receipt.append(String.format("Dish 3: %d x $%.2f = $%.2f\n", quantity, dishPrices.get("Dish 3"), price));
            totalPrice += price;
        }

        receipt.append("\nTotal Price: $").append(String.format("%.2f", totalPrice));

        Stage receiptStage = new Stage();
        receiptStage.initModality(Modality.APPLICATION_MODAL);
        receiptStage.setTitle("Order Receipt");

        TextArea receiptArea = new TextArea(receipt.toString());
        receiptArea.setEditable(false);

        VBox vbox = new VBox(receiptArea);
        Scene scene = new Scene(vbox, 300, 200);

        receiptStage.setScene(scene);
        receiptStage.showAndWait();
    }
}