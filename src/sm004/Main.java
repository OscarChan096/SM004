package sm004;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sm004.controllers.UiMain;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ui/layouts/uimain.fxml"));
        primaryStage.setTitle("SimpleMusic");
        primaryStage.getIcons().add(new Image("res/icsm004.png")); // icono de la app
        Scene scene = new Scene(root,750,500);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        //primaryStage.initStyle( StageStyle.UNDECORATED );
        //scene.getStylesheets().add( getClass().getResource( "style.css" ).toString() );
        //primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
