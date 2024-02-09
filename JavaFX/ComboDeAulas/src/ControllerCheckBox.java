import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ControllerCheckBox {

    @FXML
    private CheckBox checkBox;

    @FXML
    private ImageView imageView;

    @FXML
    private Label myLabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    Image imageON = new Image(getClass().getResourceAsStream("imagens/lightOn.jpg"));
    Image imageoFF = new Image(getClass().getResourceAsStream("imagens/lightOff.jpg"));

    public void onCLick(ActionEvent event){

        if(checkBox.isSelected()){ // retorta que a caixa está marcada
            imageView.setImage(imageON);
            myLabel.setText("ON");
        }
        else{
            imageView.setImage(imageoFF);
            myLabel.setText("OFF");
        }

    }
     public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/sceneImage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }

}
