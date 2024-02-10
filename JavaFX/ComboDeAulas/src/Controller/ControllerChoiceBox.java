package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
// Choice box não tem metodos onAction
// Tambem devemos adicionar nossas "choices" manualmente através do codigo

public class ControllerChoiceBox implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Label myLabel;

    private String[] food = {"pizza" , "sushi" , "hamburguer", "sorvete"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        choiceBox.getItems().addAll(food);
        choiceBox.setOnAction(this:: getFood); // chama o metodo que muda o Label em relação a escolha da choice box

    }
    public void getFood(ActionEvent event){
        String myFood = choiceBox.getValue();
        myLabel.setText(myFood);
    }

}
