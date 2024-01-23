import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
       launch(args);
}
@Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("layout.fxml")); // conecta o layout do Scene builder com o projeto
            

            Scene scene = new Scene(root); // se passar o tamanho da janela pode ocultar parte da cena
            
            primaryStage.setTitle("Teste do Scene Builder");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
