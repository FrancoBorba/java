import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
  
}

