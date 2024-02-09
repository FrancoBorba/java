import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
// Controller dedicado a estudo de TextFild
// TextFilds são nodes que nos permitem digitar textos
public class ControllerTextFild {
    @FXML
    private Label myLabel;
    @FXML
    private TextField textFild;
    @FXML
    private Button submitBotton;

    int age;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void submit(ActionEvent event){
        
        
        try{
        age = Integer.parseInt(textFild.getText()); // transforma o conteudo recebido pelo textfild em inteiro
        if(age < 18){
            myLabel.setText("You are underage");
        }
        else{
            myLabel.setText("Congratulations you signed up");
        }
        }
        catch(NumberFormatException e){
           // System.out.println("Enter only numbers");
            myLabel.setText("Enter only numbers");
        }
        catch(Exception e){
          myLabel.setText("ERROR");
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
