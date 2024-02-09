
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
    // ImageView é um Node utilizado para imagens carregadas com Images
    // Images = imagens
    // ImageView = quadro de imanges

public class ControllerImage {

    private Stage stage;
    private Scene scene;
    private Parent root;
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
} // troca de imagens através do button

    public void switchScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/TextFildScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } // troca a scene para a proxima aula de nodes(TextFild)
    



    
   

}
