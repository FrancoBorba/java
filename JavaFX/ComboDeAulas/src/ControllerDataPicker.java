import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
 // Data Picker são nodes que nos permitem escolher a data
public class ControllerDataPicker {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label myLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void getDate(ActionEvent event) {
        LocalDate date = datePicker.getValue(); // pega o valor da data e armazena em uma variavel 
       String formatoData = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); // altera o padrao da data
       myLabel.setText(formatoData);
    }
      public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/RadioButtonsScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ColorPickerScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
