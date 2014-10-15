package sample.MyGame;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 06.10.2014.
 */
public class Cell {

    private int id;
    public int getId(){
        return id;
    }

    private String name;
    public String getName(){
        return name;
    }

    private Game.CellType type;
    public Game.CellType getType(){
        return type;
    }

    private int cost;
    public int getCost(){
        return cost;
    }

    private int houses;
    public int getHouses(){
        return houses;
    }
    public void setHouses(int count){
        if ((count <= 5) && (count >= 0)){
            houses = count;
        }
    }

    private ArrayList<Integer> rate;
    private int getRate(){
        return rate.get(houses);
    }

    private int houseCost;
    public int getHouseCost(){
        return houseCost;
    }

    private int collateral;
    public int getCollateral(){
        return collateral;
    }

    private Cell nextCell = null;

    public Cell(int id, String name, Game.CellType type, int cost, ArrayList<Integer> rate, int houseCost, int collateral){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.rate = rate;
        this.houses = 0;
        this.houseCost = houseCost;
        this.collateral = collateral;

        /*if (!CellFactory.isItEnd()) {
            Cell bufCell = CellFactory.GetCell();
            if (bufCell == null) {
                this.nextCell = Field.GetGameField().getStartCell();
            } else {
                this.nextCell = bufCell;

            }
        }*/
    }

    public Cell GoToNextCell(){
        return this.nextCell;
    }

    public void PrintInfo()
    {
        System.out.print(name);
    }

    public void SetNextCell(){
        if (nextCell == null){
            this.nextCell = CellFactory.GetCell();
            if(nextCell.getType() == Game.CellType.Prison){
                Field field = Field.GetGameField();
                field.SetPrison(nextCell);
            }
        }
    }

}
