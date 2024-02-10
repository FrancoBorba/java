package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class ControllerColorPicker {

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private AnchorPane myPane;

    @FXML
    void changeColor(ActionEvent event) {
        Color corPane = colorPicker.getValue(); // retorna um objeto do tipo Color
        myPane.setBackground(new Background(new BackgroundFill(corPane , CornerRadii.EMPTY ,Insets.EMPTY)));
    }

}

