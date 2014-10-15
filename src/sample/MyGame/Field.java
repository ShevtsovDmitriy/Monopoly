package sample.MyGame;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 06.10.2014.
 */
public class Field {

    public static Field GetGameField(){
        if (gameField == null){
            gameField = new Field();
        }
        return gameField;
    }

    private static Field gameField = null;

    protected Field(){
        startCell = new Cell(0, "Старт", Game.CellType.Start, 0, new ArrayList<Integer>(), 0, 0);
    }

    private Cell startCell;
    public Cell getStartCell(){
        return startCell;
    }

    public boolean GoToNextCell(Player player){
        return true;
        //TODO: create method to navigate on cells
    }

    public void SetNextCells(){
        Cell buf = startCell;
        System.out.print(startCell);
        while (!CellFactory.isItEnd()){
            buf.SetNextCell();
            buf = buf.GoToNextCell();
        }
    }




    //Поле хранится в текстовом файле

}
