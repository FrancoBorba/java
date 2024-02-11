package Controller;
// Spiner is a singline textfild used to select a number or a objectvalue in a order sequence

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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

public class ControllerSpinner implements Initializable {
    
    @FXML
    private Label myLabel;

    @FXML
    private Spinner<Integer> mySpinner;

    int actualyValue;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100); // criando os valores do spiner (ps não sei se é bem isso revisarei dps)
            
        valueFactory.setValue(1); // Colocando 1 como valor default

        mySpinner.setValueFactory(valueFactory); // adcionando os valores ao spinner

        myLabel.setText(Integer.toString(actualyValue));

        actualyValue = mySpinner.getValue();

        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                myLabel.setText(Integer.toString(actualyValue));

                actualyValue = mySpinner.getValue();
            }
            
        });
    }
     public void backScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ProgressBarScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    public void nextScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ListViewScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    
}
/*
     The SpinnerValueFactory is the model behind the JavaFX Spinner control - without a value factory installed a   
         Spinner is unusable. It is the role of the value factory to handle almost all aspects of the Spinner, including:
        Representing the current state of the value,
        Incrementing and decrementing the value, with one or more steps per call,
        Converting text input from the user (via the Spinner editor,
        Converting objects to user-readable strings for display on screen
     */