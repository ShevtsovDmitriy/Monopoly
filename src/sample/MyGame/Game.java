package sample.MyGame;

/**
 * Created by Дмитрий on 06.10.2014.
 * The main class of my game
 */
public class Game {

    public static enum CellType{Street, Start, Prison, Chance, Bank, Station, Utility }

    private static Game instance;
    public static Game GetGame(){
        if (instance == null) {return new Game();}
        else {return instance;}
    }

    private Game(){}

    private Field field;
    private Player[] players;

    public void StartGame() {

/*
        //спрашиваем количство игроков
        StartSettings dialog = new StartSettings();
        dialog.show();
        //получаем количество игроков и создаём массив

*/

    }
}
