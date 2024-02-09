import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControllerImage {

    @FXML
    private Button changeImageButton;

    @FXML
    private ImageView imageView;
    
    Image imagem1 = new Image(getClass().getResourceAsStream("/imagens/shrek2.jpg"));

    public void displayImage(){
        imageView.setImage(imagem1);
    }


    
   

}
