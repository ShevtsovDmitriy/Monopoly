package sample.MyGame;

/**
 * Created by Дмитрий on 06.10.2014.
 * The main class of my game
 */
public class Game {

    public Game(){}

    private Field field;
    private Player[] players;

    public void StartGame(){
        IFieldFactory factory = new FieldFactory();
        field = factory.GetGameField();
        //спрашиваем количство игроков
        StartSettings dialog = new StartSettings();
        dialog.show();
        //получаем количество игроков и создаём массив
    }


}
