package sm004.smc;

import javazoom.jlgui.basicplayer.BasicPlayer;

import java.io.File;

public class MusicPlayer {

    private static BasicPlayer player;
    private static File[] list;
    private static String path;

    public MusicPlayer(String path){
        this.path = path;
        player = new BasicPlayer();
        list = new File(path).listFiles(); // crea una lista de los archivos en la carpeta seleccionada
    }

    public static void readlist() throws Exception{
        for (int i = 0; i < list.length; i++){
            openFile(path+"/"+list[i].getName());
        }
    }

    public static void openFile(String path) throws Exception{
        player.open(new File(path));
    }

    public static void play() throws Exception{
        player.play();
    }

    public static void pausa() throws Exception{
        player.pause();
    }

    public static void continuar() throws Exception{
        player.resume();
    }

    public static void stop() throws Exception{
        player.stop();
    }

}
