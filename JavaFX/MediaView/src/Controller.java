
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Controller implements Initializable{
   
    @FXML
    private MediaView mediaView;

    @FXML
    private Button pauseButton;

    @FXML
    private Button playButton;

    @FXML
    private Button resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        file = new File("C:\\Users\\Pichau\\Desktop\\CrazyFrog.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
    }
    public void playMedia(ActionEvent event){
        mediaPlayer.play();
    }
    public void pauseMedia(ActionEvent event){
        mediaPlayer.pause();
    }
    public void resetMedia(ActionEvent event){
        mediaPlayer.seek(Duration.seconds(0.0));
    }
    

}
