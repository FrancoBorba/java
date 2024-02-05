import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle circle;
    private double x;
    private double y;
    @FXML
    void btnDown(ActionEvent event) {
       // System.out.println("down");
       circle.setCenterY(y+=4);
    }

    @FXML
    void btnLeft(ActionEvent event) {
        //System.out.println("left");
        circle.setCenterX(x -= 4);
    }

    @FXML
    void btnRight(ActionEvent event) {
        //System.out.println("Right");
        circle.setCenterX(x += 4);
    }

    @FXML
    void btnUp(ActionEvent event) {
       // System.out.println("Up");
       circle.setCenterY(y-=4);
    }

}
