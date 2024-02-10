package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

// sliders são Nodes que nos permitem arrastar/escolher algo 
// Block increment = a numero que o cursor era saltar de vez em vez
// MajorTick = espaçamento maior do Slider
// MinorTick = espaçamento menor do Slider
public class ControllerSlider implements Initializable {
    @FXML
    Label myLabel;
    @FXML 
    Slider mySlider;

    int temperatura;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        temperatura = (int)mySlider.getValue();
        myLabel.setText(Integer.toString(temperatura) + " graus");
       mySlider.valueProperty().addListener(new ChangeListener<Number>() {

        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            temperatura = (int)mySlider.getValue();
            myLabel.setText(Integer.toString(temperatura) + " graus");
        }
        
       });
    }
     public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ChoiceBoxScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ProgressBarScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

