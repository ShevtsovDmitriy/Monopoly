package sample.MyGame;

/**
 * Created by Дмитрий on 06.10.2014.
 */
public class Field {

    public static Field GetGameField(){
        if (gameField == null){
            return new Field();
        }
        else return gameField;
    }

    private static Field gameField;

    protected Field(){
        startCell = new Cell(0, "Старт", Game.CellType.Start, 0, new int[] {0}, 0, 0);
    }

    private Cell startCell;
    public Cell getStartCell(){
        return startCell;
    }

    public boolean GoToNextCell(Player player){
        return true;
        //TODO: create method to navigate on cells
    }




    //Поле хранится в текстовом файле

}
