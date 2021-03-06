package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Brick Breaker");
        RootPane rootPane = new RootPane();

        primaryStage.setScene(new Scene(rootPane, 600, 800));
        primaryStage.show();

        rootPane.getGamePane().requestFocus();

    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
