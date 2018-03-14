/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import oregontrail.Player;
import ViewLayer.HelpMenuView;
import oregontrail.Actor;
import oregontrail.Game;
import oregontrail.InventoryItem;
import oregontrail.Map;
import oregontrail.OregonTrail;

/**
 *
 * @author mthoming
 */
public class GameControl {    

    public GameControl() {
    }
    
    //is this redundant?
    public static Player createPlayer(String name) {
        if (name == null){
            return null;    
        }   
        
        Player player = new Player(); 
        player.setName(name);
        
        OregonTrail.setPlayer(player); //Step 4a on pg. 6
                    
         return player;
    }   
            
    public static int createNewGame(Player player) {
        System.out.println("**** CreateNewGame() called ****");
        System.out.println("Player name = " + player); //trying to show the name entry 
                                                       //provided by the player
        if (player == null)
            return -1;
        
        Game currentGame = new Game();  //create a new Game object
        OregonTrail.setCurrentGame(currentGame);
        
        currentGame.setPlayer(player);  //Save a reference to the Player object in the game
        System.out.println("Player name = " + player);    
        
        //String game = Game.setPlayer(player); //Save a reference to the game in the main class    
        
        Map map = new Map();  //createMap(noOfRows, noOfColumns, items)
        if (map == null)
            return -1;             
                
        currentGame.setMap(map); //assign the map to the game
        
        return 1;  //indicates success
    }

    public static InventoryItem[] createItems() {
        System.out.println("**** createItems() called ****");
        
        int noOfItems = 10;
        InventoryItem[] items = new InventoryItem[noOfItems];
        return items;
    }
    
    public static Map createMap(int noOfRows, int noOfColumns){
        System.out.println("**** createMap() called ****");
        
        Map map = new Map();
        return map;
    }
            
        // TODO Need to set the inventory list...example from Ship game:
        // InventoryItem[] = inventoryList = GameControl.createInventoryList(); 
        // game.setInventory(InventoryList);
        // Create map
//        Map map = new Map();
//        map.init();
//
//        player.setLocation(map.getLocationAt(0, 0));
//        
//        currentGame.setMap(map);
//
//        assignItemsToMap(map);
    
    
    public static int healthOfPlayer(int mealsADay, int hoursWalking, int weight){
      
        int caloriesPerMile;
        
        if(weight >= 180){ 
            caloriesPerMile = 100;
        }
        else{
           caloriesPerMile = 65;
        }
        
       int caloriesPerMeal = 500;
        if (mealsADay < 1){
            return -1;
        }
        
        if (hoursWalking >= 12){
            return -1;
        }
        
        int totalCaloriesBurned =  caloriesPerMile * 4 * hoursWalking;
        
        int netCalories = (mealsADay * caloriesPerMeal)- totalCaloriesBurned;
        
        if (netCalories <= 1499 || netCalories < -1 ){
            System.out.println("You have to eat more meals to survive your journey.");
        }
        
        else if(netCalories >= 1500 || netCalories < 2500 ){
                System.out.println("You are healthy! Keep up");
                }
        else if(netCalories > 2501){
                System.out.println("You are gaining weight which means you can get sick");
    }
        return netCalories;
    }
    
}

