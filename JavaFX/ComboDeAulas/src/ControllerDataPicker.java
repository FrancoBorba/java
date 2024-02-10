import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
 // Data Picker são nodes que nos permitem escolher a data
public class ControllerDataPicker {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label myLabel;

    @FXML
    void getDate(ActionEvent event) {
        LocalDate date = datePicker.getValue(); // pega o valor da data e armazena em uma variavel 
       String formatoData = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); // altera o padrao da data
       myLabel.setText(formatoData);
    }

}
