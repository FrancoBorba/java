package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControllerColorPicker {

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private AnchorPane myPane;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void changeColor(ActionEvent event) {
        Color corPane = colorPicker.getValue(); // retorna um objeto do tipo Color
        myPane.setBackground(new Background(new BackgroundFill(corPane , CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/DataPickerScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ChoiceBoxScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

