import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
// Radio Buttons devem ser adicionados a um Toggle Group , assim não se pode marcar mais de uma vez
public class ControllerRadioButton {

    @FXML
    private RadioButton acaiRadio;

    @FXML
    private ToggleGroup food;

    @FXML
    private RadioButton hamburguerRadio;

    @FXML
    private ImageView imageView;

    @FXML
    private RadioButton pizzaRadio;

    Image pizza = new Image(getClass().getResourceAsStream("/imagens/Pizza.jpg"));
    Image hamburguer = new Image(getClass().getResourceAsStream("/imagens/Hamburguer.jpg"));
    Image acai = new Image(getClass().getResourceAsStream("/imagens/Acai.jpg"));
    Image teste = new Image(getClass().getResourceAsStream("/imagens/lightOn.jpg"));

    private Stage stage;
    private Scene scene;
    private Parent root;

  
   public void getFood(ActionEvent event) {

        if(pizzaRadio.isSelected()){
            imageView.setImage(pizza);
        }
        if(hamburguerRadio.isSelected()){
            imageView.setImage(hamburguer);
        }
        if(acaiRadio.isSelected()){
            imageView.setImage(acai);
        }
    }
      public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/CheckBoxScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/DataPickerScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
  
}

