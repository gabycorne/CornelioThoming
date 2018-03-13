/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import oregontrail.Player;
import ViewLayer.HelpMenuView;
import oregontrail.Game;
import oregontrail.OregonTrail;

/**
 *
 * @author mthoming
 */
public class GameControl {    

    public GameControl() {
    }
    
    public static Player createPlayer(String name) {
        if (name == null){
            return null;    
        }   
        
        Player player = new Player(); 
        
        player.setName(name);
        
        OregonTrail.setPlayer(player);
                    
         return player;
    }   
            
    public void createNewGame(Player player) {
        System.out.println("**** CreateNewGame() called ****");
        Game currentGame = new Game();
        OregonTrail.setCurrentGame(currentGame);
        
        currentGame.setPlayer(player);
        
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
        
        /*
            game = create a new Game object
            Save a reference to the Player object in the game
            Save a reference to the game in the main class
            
            actors = createActors()
            Save the list of actors in the Game object
            Assign an actor to the player
            
            items = createItems()
            Save the list of items in the game
            
            map = createMap(noOfRows, noOfColumns, items)
            IF map == null THEN
                RETURN -1
            ENDIF
                
            Assign the map to the game
            RETURN 1 // indicates success
        */
    }
    
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

