package sm004.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

import java.io.File;
import java.util.Map;

public class UiMain {

    @FXML private Button btnClose;
    @FXML private Button btnMin;
    @FXML private Button btnMax;
    @FXML private BorderPane frame;
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

    public void abrir(ActionEvent actionEvent) {
    }

    public void config(ActionEvent actionEvent) {
    }

    public void about(ActionEvent actionEvent) {
    }

}
