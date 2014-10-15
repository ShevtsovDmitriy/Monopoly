package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.MyGame.Cell;
import sample.MyGame.CellFactory;
import sample.MyGame.Field;
import sample.MyGame.Game;

import java.io.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws FileNotFoundException {
        launch(args);
        Game game = Game.GetGame();
        game.StartGame();
        Cell cell = Field.GetGameField().getStartCell();
        for(int i = 0; i<5; i++){
            cell.PrintInfo();
            //System.out.print(cell + "\n");
            cell = cell.GoToNextCell();
        }

        //System.out.print("\ntest");
    }
}
