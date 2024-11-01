package org.example.javafx;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainController {
    @FXML
    protected void firstTaskButtonClicked() {
        try {
            ArrowsApplication app = new ArrowsApplication();
            Stage stage = new Stage();
            app.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void secondTaskButtonClicked() {
        try {
            WidgetVisibilityApplication app = new WidgetVisibilityApplication();
            Stage stage = new Stage();
            app.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void thirdTaskButtonClicked() {
        try {
            RestaurantOrderApplication app = new RestaurantOrderApplication();
            Stage stage = new Stage();
            app.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void fourthTaskButtonClicked() {
        try {
            CalculatorApplication app = new CalculatorApplication();
            Stage stage = new Stage();
            app.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void fifthTaskButtonClicked() {
        try {
            TextFlagApplication app = new TextFlagApplication();
            Stage stage = new Stage();
            app.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
