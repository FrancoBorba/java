import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
// Aula focada em aprender sobre Stages em JavaFX
public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args); // necessario em todo codigo , esta chamando uma função abstrata de aplication
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,Color.BLACK);
        Image icon = new Image("icon.png"); // Image transforma imagens em objetos

        primaryStage.setScene(scene);

        primaryStage.setResizable(true); // Permite ou não permite redimensionar o stage, caso não for usar sempre sera true

        //primaryStage.setFullScreen(true); Abre o stage em tela cheia

        //primaryStage.setFullScreenExitHint("SE FUDEO TELA CHEIA PARA SEMPRE"); Define a msg que aparecera em tela cheia

       // primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("h")); Muda a letra para sair do moo de tela cheia

        primaryStage.setWidth(500); // determina a largura do stage

        primaryStage.setHeight(300); // determina a altura do stage

        primaryStage.getIcons().add(icon);  // adiciona FaviIcons no stage

        primaryStage.setTitle("Titulo do primeiro Stage"); // adiciona um titulo

       

        primaryStage.show(); // necessario no final de todo metodo start para mostrar o stage
    }
}
