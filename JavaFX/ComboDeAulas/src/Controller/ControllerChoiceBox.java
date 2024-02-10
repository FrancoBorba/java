package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
// Choice box não tem metodos onAction
// Tambem devemos adicionar nossas "choices" manualmente através do codigo
import javafx.stage.Stage;

public class ControllerChoiceBox implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Label myLabel;

    private String[] food = {"pizza" , "sushi" , "hamburguer", "sorvete"};
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        choiceBox.getItems().addAll(food);
        choiceBox.setOnAction(this:: getFood); // chama o metodo que muda o Label em relação a escolha da choice box

    }
    public void getFood(ActionEvent event){
        String myFood = choiceBox.getValue();
        myLabel.setText(myFood);
    }
    public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ColorPickerScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/SliderScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
