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

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
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
        
        String[][] locations = {{"??", "??", "??", "??", "??"},
                                {"??", "??", "??", "??", "??"},
                                {"??", "??", "??", "??", "??"},
                                {"??", "??", "??", "??", "??"},
                                {"??", "??", "??", "??", "??"},
                               };

        String total = "";
        
        for (String[] location : locations) {
            for (int j = 0; j < locations.length; j++) {
                total += location[j];
            }
            System.out.println(" | " + location[0] + " | " + location[1] + " | " + location[2] + " | " + location[3] + " | " + location[4] + " | " + "\n----------------------------");            
        }
        
    }
    
        public boolean doAction(String menuOption) {
                    
            switch (menuOption) {
                case "Y":  // return to main menu
                    return false;

                case "N":  // Quit 
                    return true;
                default:
                    this.console.println("\n*** Invalid selection *** Try again***");
                    break;
            }

            return false;
            }       
        
}
