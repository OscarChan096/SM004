package sm004.controllers;

import javafx.event.ActionEvent;
import sm004.smc.MusicPlayer;

public class Barplay {

    public void btnBack(ActionEvent actionEvent) {
    }

    public void btnPlay(ActionEvent actionEvent){
        try {
            MusicPlayer.play();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void btnAfter(ActionEvent actionEvent) {
    }

    public void btnPause(ActionEvent actionEvent) {
        try {
            MusicPlayer.pausa();
        }catch (Exception ex){
            System.out.println(ex.getMessage()+"BarPlay");
        }
    }

}
