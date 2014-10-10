package sample.MyGame;

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

    private int[] rate;
    private int getRate(){
        return rate[houses];
    }

    private int houseCost;
    public int getHouseCost(){
        return houseCost;
    }

    private int collateral;
    public int getCollateral(){
        return collateral;
    }

    private Cell nextCell;

    public Cell(int id, String name, Game.CellType type, int cost, int[] rate, int houseCost, int collateral){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.rate = rate;
        this.houses = 0;
        this.houseCost = houseCost;
        this.collateral = collateral;
        ICellFactory cellFactory = new CellFactory();

        Cell bufCell = cellFactory.GetCell();
        if (!bufCell.equals(Field.GetGameField()))
        {
            this.nextCell = cellFactory.GetCell();
        }
        else this.nextCell = Field.GetGameField().getStartCell();
    }

    public Cell GoToNextCell(){
        return nextCell;
    }

}
