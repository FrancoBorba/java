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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class ControllerProgressBar implements Initializable {

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    @FXML
    private ProgressBar myProgressBar;
    // The BigDecimal class give its user complete control over rounding behavior
    double progress;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void increaseProgress(ActionEvent event) {

        if(progress <= 0.9){ // Não funciona por progress ser um double logo o valor chega em 0.999999 permitindo mais um acrescimo
           
            progress += 0.1; // aumenta em 10% toda vez que o button for acionado

            myProgressBar.setProgress(progress); // modifica no progress bar passando o progress

            myLabel.setText(Integer.toString((int)Math.round(progress*100)) + " %"); // por ser double tera perda de valores tornando assim oq deveria ser por exemplo 40% em 39.999999 , logo deve ser convertido par
        }else{

        }
       
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myProgressBar.setStyle("-fx-accent: green;"); // setStyle , permite adicionar um estilo css através de uma string
    }
    public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/SliderScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/SpinnerScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
