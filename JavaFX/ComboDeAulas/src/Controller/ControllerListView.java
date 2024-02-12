package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControllerListView implements Initializable {

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;

     private Stage stage;
    private Scene scene;
    private Parent root;

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
      public void backScene(ActionEvent event) throws IOException{
         root = FXMLLoader.load(getClass().getResource("/view/SliderScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/TreeViewScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    

}
