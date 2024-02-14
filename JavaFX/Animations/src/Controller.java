import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable {

    @FXML
    private ImageView myImageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // Translate Parte
       TranslateTransition translate = new TranslateTransition();
       translate.setNode(myImageView);
       translate.setDuration(Duration.millis(1000)); // tempo que ocorrera o processo 
       translate.setCycleCount(TranslateTransition.INDEFINITE); // define a quantidade de vezes que ocorrera a animação , neste caso infinito , por default é 1
       translate.setByX(250);
       //transalte.setByY(-250) ao ter translates nos eixos x e y ao mesmo tempo se cria uma animação na diagonal
       translate.setAutoReverse(true); // meio que faz o oposto do que foi setado acima
       translate.play();

       // Rotate Parte

       RotateTransition rotate = new RotateTransition();
       rotate.setNode(myImageView);
       rotate.setDuration(Duration.millis(500));
       rotate.setCycleCount(TranslateTransition.INDEFINITE);
       rotate.setInterpolator(Interpolator.LINEAR);
       rotate.setByAngle(180);
      // rotate.setAxis(Rotate.X_AXIS); Muda o eixo que o objeto vai rotacionar , neste caso para o eixo x , por default é o z
       rotate.setAutoReverse(true);
       rotate.play();

       // Fade 
       FadeTransition fade = new FadeTransition();
       fade.setNode(myImageView);
       fade.setDuration(Duration.seconds(1));
       fade.setCycleCount(5);
       fade.setFromValue(0);
       fade.setToValue(1);
       fade.play();
    }

}
