import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button logoutButton;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    @FXML
   public void logout(ActionEvent event) {
    
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Logout"); // titulo da tela de alerta
    alert.setHeaderText("You are about to logout"); // cabeçalho da tela
    alert.setContentText("Do you want save before leaving? :"); // conteudo do alerta

    if(alert.showAndWait().get() == ButtonType.OK){ // mostra a tela de alerta e em conjunto com o if toma uma decisao
        stage = (Stage)scenePane.getScene().getWindow();
        System.out.println("Você se desconectou");
        stage.close();
    }

}
}
