import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// Prototipo das aulas de ImageView , TextFild , CheckBox 
// Farei todas em uma unica pasta e tentarei aplicar o controler de scenes visto nas ultimas aulas

public class App extends Application{
    public static void main(String[] args) throws Exception {
      launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/sceneImage.fxml"));
        Parent root = loader.load();

       Scene scene = new Scene(root);

       primaryStage.setScene(scene);
       primaryStage.show();
    }
}
