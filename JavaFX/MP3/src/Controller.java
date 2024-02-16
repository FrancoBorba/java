import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

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

    private Media media;
    private MediaPlayer player;

    private ArrayList<File> songs;

    private int songNumber;

    private int [] speeds = {25 , 50 , 75, 100 , 125, 150 , 175 , 200}; // velocidades em porcentagem , 100 is default

    private Timer timer;
    private TimerTask task;
    private boolean running;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        songs = new ArrayList<File>();
        directory = new File("music");
       
        
        files = directory.listFiles();
         
        if(files != null){
            for(File file : files){
                songs.add(file);
                
            }
        }
        media = new Media(songs.get(songNumber).toURI().toString());
        player = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        for(int i =0; i <speeds.length ; i++){
            comboBox.getItems().add(Integer.toString(speeds[i]) +"%");
        }

        comboBox.setOnAction(this :: changeSpeed);

        songSlider.valueProperty().addListener( new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                player.setVolume(songSlider.getValue() * 0.01);
            }
            
        });
    }
    @FXML

    void next(ActionEvent event) {
        if(songNumber < songs.size() -1 ){
            songNumber++;
            
            player.stop();

            media = new Media(songs.get(songNumber).toURI().toString());
            player = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            player.play();
        }
        else{
            songNumber = 0;
            
            player.stop();

            media = new Media(songs.get(songNumber).toURI().toString());
            player = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            player.play();
        }
    }

    @FXML
    void onPLay(ActionEvent event) {
        changeSpeed(null );
        player.play();
    }

    @FXML
    void onPause(ActionEvent event) {
        player.pause();
    }

    @FXML
    void onReset(ActionEvent event) {
        player.seek(Duration.seconds(0.0));
    }

    @FXML
    void previous(ActionEvent event) {
        if(songNumber > 0 ){
            songNumber--;
            
            player.stop();

            media = new Media(songs.get(songNumber).toURI().toString());
            player = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            player.play();
        }
        else{
            songNumber = songs.size() - 1;
            
            player.stop();

            media = new Media(songs.get(songNumber).toURI().toString());
            player = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            player.play();
        }
    }
    @FXML
    void changeSpeed(ActionEvent event){
        if(comboBox.getValue() == null){
            player.setRate(1);
        }else{
         player.setRate(Integer.parseInt(comboBox.getValue().substring(0,comboBox.getValue().length() -1 )) * 0.01);
        }
       
    }

   

}
