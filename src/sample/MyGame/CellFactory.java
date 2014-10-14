package sample.MyGame;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 06.10.2014.
 */
public class CellFactory {

    private static File my_file = new File("my file");
    private static BufferedReader in;

    private static boolean itEnd = false;

    public static boolean isItEnd() {
        return itEnd;
    }

    public static Cell GetCell()  {
        String str = "";
        if (in == null)
        {
            try {
                in = new BufferedReader(new FileReader(my_file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.print("File not found");
            }
        }
        if (my_file.exists()) {
            try {
                str = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else {System.out.print("File not found");}

        if(str != null) {
            Integer id = 0;
            String name = "";
            Game.CellType type;
            int cost = 0;
            ArrayList<Integer> rate = new ArrayList<Integer>();
            int houseCost = 0;
            int collateral = 0;

            int i = 0;
            String buf = "";
            while (str.charAt(i) != '/') {
                buf += str.charAt(i);
                i++;
            }
            id = new Integer(buf);

            i++;
            buf = "";
            while (str.charAt(i) != '/') {
                buf += str.charAt(i);
                i++;
            }
            name = buf;

            i++;
            buf = "";
            while (str.charAt(i) != '/') {
                buf += str.charAt(i);
                i++;
            }
            type = Game.CellType.valueOf(buf);

            i++;
            buf = "";
            while (str.charAt(i) != '/') {
                buf += str.charAt(i);
                i++;
            }
            cost = new Integer(buf);

            i++;
            buf = "";
            while (str.charAt(i) != '/') {
                while (str.charAt(i) != ' ') {
                    buf += str.charAt(i);
                    i++;
                }
                rate.add(new Integer(buf));
                i++;
                buf = "";
            }

            i++;
            buf = "";
            while (str.charAt(i) != '/') {
                buf += str.charAt(i);
                i++;
            }
            houseCost = new Integer(buf);

            i++;
            buf = "";
            while (str.charAt(i) != '/') {
                buf += str.charAt(i);
                i++;
            }
            collateral = new Integer(buf);
            Cell cell = new Cell(id, name, type, cost, rate, houseCost, collateral );
            return cell;
        }
        else
        {
            itEnd = true;
            return null;
        }
    }

}
