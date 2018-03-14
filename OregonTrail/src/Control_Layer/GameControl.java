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
import oregontrail.Location;
import oregontrail.Map;
import oregontrail.OregonTrail;

/**
 *
 * @author mthoming
 */
public class GameControl {    

    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
       System.out.println("***createLocations() called***");
       return null;// the tutor helped me to create this method teh return null doesnt do anything it was created so the error disappear
    }

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
        
        currentGame.setPlayer(player);  //Save a reference to the Player object in the game

        OregonTrail.setCurrentGame(currentGame); //Save a reference to the game in the main class  
        
        //Map map = createMap(5, 5, InventoryItems[]);
        //currentGame.setMap(map); //assign the map to the game
        
        return 1;  //indicates success
    }
    
    public static InventoryItem[] createItems() {
        System.out.println("**** createItems() called ****");
        
        int noOfItems = 7;
        InventoryItem[] items = new InventoryItem[noOfItems]; //create an array InventoryItem objects
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        
        items[ItemType.food.ordinal()] = food;
        
        InventoryItem bullets = new InventoryItem();
        bullets.setDescription("bullets");
        bullets.setQuantityInStock(0);
        bullets.setRequiredAmount(0);
        
        items[ItemType.bullets.ordinal()] = bullets;        
        
        InventoryItem wagonWheels = new InventoryItem();
        wagonWheels.setDescription("Wagon Wheels");
        wagonWheels.setQuantityInStock(0);
        wagonWheels.setRequiredAmount(0);
        
        items[ItemType.wagonWheels.ordinal()] = wagonWheels;         
        
        InventoryItem wagonTongues = new InventoryItem();
        wagonTongues.setDescription("Wagon Tongues");
        wagonTongues.setQuantityInStock(0);
        wagonTongues.setRequiredAmount(0);
        
        items[ItemType.wagonTongues.ordinal()] = wagonTongues;         
        
        InventoryItem wagonAxle = new InventoryItem();
        wagonAxle.setDescription("Wagon Axle");
        wagonAxle.setQuantityInStock(0);
        wagonAxle.setRequiredAmount(0);
        
        items[ItemType.wagonAxle.ordinal()] = wagonAxle;         
        
        InventoryItem oxen = new InventoryItem();
        oxen.setDescription("Oxen");
        oxen.setQuantityInStock(0);
        oxen.setRequiredAmount(0);
        
        items[ItemType.oxen.ordinal()] = oxen;         
        
        InventoryItem tools = new InventoryItem();
        tools.setDescription("Tools");
        tools.setQuantityInStock(0);
        tools.setRequiredAmount(0);
        
        items[ItemType.tools.ordinal()] = tools;         
                   
        
        return items;

    }
    


//Assign the locations array to the map
//scenes = createScenes()
//questions = createQuestions()
//assignQuestionsToScenes()
//assignItemsToScenes()
//assignScenesToLocations()
//return map 
//    
//    
    
    
    public static Map createMap(int noOfRows, int noOfColumns){  //InventoryItem[] items
        System.out.println("**** createMap() called ****");
        
        if(noOfRows < 0 || noOfColumns < 0 ){
        return null;
        } 
//        if(items == null || items.length < 1){
//        return null;
//        }
                
        Map map = new Map(noOfRows, noOfColumns);
       
        map.setColumnCount(noOfColumns);
        map.setRowCount(noOfRows);

        Location[][] locations = createLocations(noOfRows, noOfColumns);
        
        return map;
    }    
      //  map.setLocations(locations); // I stopped here because we did not know how to change this to array. the instructions are not clear.

    
    
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

