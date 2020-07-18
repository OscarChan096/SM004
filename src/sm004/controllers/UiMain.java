package sm004.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sm004.smc.MusicPlayer;

import java.io.File;

public class UiMain {

    @FXML private Button btnClose;
    @FXML private Button btnMin;
    @FXML private Button btnMax;
    @FXML private BorderPane frame;
    @FXML private MenuItem abrir;
    private boolean maximized = false;
    private double initX,initY,initHeight,initWidth;


    @FXML
    public void cerrar(ActionEvent actionEvent) {
        Stage stage = (Stage)btnClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void maximizar(ActionEvent actionEvent) {
        Stage stage = (Stage)btnMax.getScene().getWindow();
        if(!maximized){
            stage.setMaximized(true);
            maximized = true;
        }
        else{
            stage.setMaximized(false);
            maximized = false;
        }
    }

    @FXML
    public void minimizar(ActionEvent actionEvent) {
        Stage stage = (Stage)btnMin.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    public void movePressed(MouseEvent mouseEvent) {
        Stage stage = (Stage)frame.getScene().getWindow();
        initX= mouseEvent.getSceneX();
        initY = mouseEvent.getSceneY();
    }

    @FXML
    public void moveDragged(MouseEvent mouseEvent) {
        Stage stage = (Stage)frame.getScene().getWindow();
        stage.setX(mouseEvent.getScreenX()-initX);
        stage.setY(mouseEvent.getScreenY()-initY);
    }

    public void importar(ActionEvent actionEvent) {
        Stage stage = (Stage)frame.getScene().getWindow();

        DirectoryChooser openFolder = new DirectoryChooser();
        File folder = openFolder.showDialog(stage);

        MusicPlayer mp = new MusicPlayer(folder.getAbsolutePath());
        try {
            MusicPlayer.readlist();
        }catch (Exception ex){
            System.out.println(ex.getMessage()+"UiMain");
        }
        //System.out.println(folder.getAbsolutePath());

        //FileChooser openFolder = new FileChooser();
        //File folder = openFolder.showOpenDialog(stage);

    }

    public void config(ActionEvent actionEvent) {
    }

    public void about(ActionEvent actionEvent) {
    }

}
