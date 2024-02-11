package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ControllerListView implements Initializable {

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;

    String[] series = { "friends" , "Got" , "Breaking Bad" , "Vikings" , "One piece"};

    String currentSerie;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       myListView.getItems().addAll(series);
       
       myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
           currentSerie = myListView.getSelectionModel().getSelectedItem();
           myLabel.setText(currentSerie);
        }
        
       });
    }
    

}
