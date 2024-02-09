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
    Image imagem2 = new Image(getClass().getResourceAsStream("/imagens/shrek1.jpg"));

    public void displayImage(){
        if(imageView.getImage()== imagem1){
            imageView.setImage(imagem2);
        }
        else{
            imageView.setImage(imagem1);
        }
}


    
   

}
