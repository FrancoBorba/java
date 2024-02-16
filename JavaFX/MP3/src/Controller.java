import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label songLabel;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button pauseButton;

    @FXML
    private Button playButton;

    @FXML
    private Button previousButton;

    @FXML
    private ProgressBar progresBar;

    @FXML
    private Button resetButton;

    @FXML
    private Slider songSlider;

    private File directory;
    private File [] files;

    private ArrayList<File> songs;

    @FXML
    void next(ActionEvent event) {

    }

    @FXML
    void onPLay(ActionEvent event) {

    }

    @FXML
    void onPause(ActionEvent event) {

    }

    @FXML
    void onReset(ActionEvent event) {

    }

    @FXML
    void previous(ActionEvent event) {

    }
    @FXML
    void changeSpeed(ActionEvent event){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
