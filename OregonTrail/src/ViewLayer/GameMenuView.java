/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Control_Layer.GameControl;
import static Control_Layer.GameControl.createLocations;
import oregontrail.Game;
import oregontrail.Location;
import oregontrail.Map;
import oregontrail.OregonTrail;

/**
 *
 * @author mthoming
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("**** GameMenuView() called ***");
    }

    public static void displayMap() {
        
        
        Game currentGame = new Game();
        currentGame = OregonTrail.getCurrentGame(); //game = get the currentGame from the main class
        
        Map currentMap = new Map(); 
        currentMap = Game.getMap();
        
        int noOfRows = 5;
        int noOfColumns = 5;
        
        Map map = new Map(noOfRows, noOfColumns);
       
        map.getColumnCount();
        map.getRowCount();
        
        //Location[][] locations = new Location[noOfRows] [noOfColumns];//locations = get the 2-D locations array from the map
//        String[][] locations;
//        locations = new String[5][5];
        
        String[][] locations = {{"A", "B", "C", "D", "E"},
                                {"F", "G", "H", "I", "J"},
                                {"K", "L", "M", "N", "O"},
                                {"P", "Q", "R", "S", "T"},
                                {"U", "V", "W", "X", "Y"},
                               };
        
        for (String[] location : locations) {
            for (String location1 : location) {
                System.out.println(location1);
            }
            System.out.println("\n");
        }
//        System.out.println("\n\nMap of the Oregon Trail"
//                         +"\n    1  2  3  4  5  "
//                         +"\n-------------------"
//                         +"\n1  |  |  |  |  |  |"
//                         +"\n-------------------"
//                         +"\n2  |  |  |  |  |  |"
//                         +"\n-------------------"                         
//                         +"\n3  |  |  |  |  |  |"
//                         +"\n-------------------"               
//                         +"\n4  |  |  |  |  |  |"
//                         +"\n-------------------"               
//                         +"\n5  |  |  |  |  |  |"
//                         +"\n-------------------");
//        OregonTrail.map.setLocations(locations);
//        
//        locations[Rows][Columns] = new Location();
//        locations[Rows][Columns].setRow(Rows);
        //Print the column numbers for each column
        //for every row in map
        //Print a row divider
        //Print the row number on a new line
        //for every column in the row
        //Print a column divider
        //location = locations[row][column]
        //if location has been visited
        //Get the mapSymbol for the scene in this location
        //Print the mapSymbol
        //else
        //Print " ?? "
        //endif
        //endFor
        //Print the ending column divider
        //endFor
        //Print the ending row divider
    
    }
    
    @Override
    public boolean doAction(String value) {
        System.out.println("******assignItemsToScenes[] called*****");
        return false;
    }

}
