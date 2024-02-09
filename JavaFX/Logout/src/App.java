import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> { // passando o alert através do fechar do Stage
            event.consume(); // consome o evento pois se não ao clicar em cancelar continua fechando o stage
            logout(primaryStage);
                     }); 
    }

     public void logout(Stage stage) {
    
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Logout"); 
    alert.setHeaderText("You are about to logout"); 
    alert.setContentText("Do you want save before leaving? :"); 

    if(alert.showAndWait().get() == ButtonType.OK){ 
       
        System.out.println("Você se desconectou");
        stage.close();
    }

}
}
