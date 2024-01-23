import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Group root = new Group();
       Scene scene = new Scene(root,600 , 600 , Color.RED);  // Para se criar uma scene é obrigatorio passar um root node , mas pode se passar otras informações como largura , altura e cor nesta ordem
       Stage stage = new Stage();

        Text text = new Text(" ()============");
        // text.setText(" ()===================="); duas formas de adicionar a string no text
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Arial", 20));; // define a fonte do texto e seu tamanho
        text.setFill(Color.WHITE); // define a cor


        Line linha = new Line();
        linha.setStartX(200);
        linha.setStartY(200);
        linha.setEndX(500);
        linha.setEndY(200);
        linha.setStroke(Color.YELLOW); // muda a cor de uma Line
        linha.setStrokeWidth(5); // define a largura
        linha.setOpacity(0.7); // define opacidade
        linha.setRotate(75); // Define a "rotação" em graus

        Rectangle rectangle = new Rectangle(); // Cria um retangulo

        rectangle.setWidth(30);
        rectangle.setHeight(50);
        rectangle.setX(420);
        rectangle.setY(420);

        
        Circle circle = new Circle(); // Cria um objectt circulo

        circle.setCenterX(200);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        
        Image htmlImage = new Image("Html5.png"); // Cria um object da imagem
        ImageView imageView = new ImageView(htmlImage);
        imageView.setX(200);
        imageView.setY(350);
       


        root.getChildren().add(text); // adiciona um object a um root node
        root.getChildren().add(linha);
        root.getChildren().add(rectangle);
        root.getChildren().add(circle);
      //  root.getChildren().addAll(imageView); imagem tava mt grande 
        

       stage.setScene(scene); // adiciona a scene no stage que está sendo utilizado
       stage.show();
    }
}
