package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.MyGame.CellFactory;
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
        /*File my_file = new File("my file");
        if (!my_file.exists())
        {
            try {
                my_file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PrintWriter printWriter = new PrintWriter(my_file);
        try {
            printWriter.print(1 + " ");
            printWriter.print("Нагатинская ");
            printWriter.print(0 + " ");

        }
        finally {
            printWriter.close();
        }

        String str = "";
        BufferedReader in = new BufferedReader(new FileReader(my_file));
        try {
            str = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(str);
*/
        CellFactory.GetCell();
        System.out.print("\ntest");
    }
}
