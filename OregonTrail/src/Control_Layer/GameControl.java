/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import static Control_Layer.GameControl.SceneType.resource_Scene;
import oregontrail.Player;
import ViewLayer.HelpMenuView;
import java.util.ArrayList;
import oregontrail.Actor;
import oregontrail.Game;
import oregontrail.InterviewQuestion;
import oregontrail.InventoryItem;
import oregontrail.Location;
import oregontrail.Map;
import oregontrail.OregonTrail;
import oregontrail.ResourceScene;
import oregontrail.Scene;
import Control_Layer.itemsInScene;

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
        
        currentGame.setPlayer(player);  //Save a reference to the Player object in the game

        OregonTrail.setCurrentGame(currentGame); //Save a reference to the game in the main class  
        
        Map map = createMap(5, 5);
        currentGame.setMap(map); //assign the map to the game
        
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
   
    
    public static Map createMap(int noOfRows, int noOfColumns){  //InventoryItem[] items
        System.out.println("**** createMap() called ****");
        
        if(noOfRows < 0 || noOfColumns < 0 ){
        return null;
        }  
        Map map = new Map(noOfRows, noOfColumns);
       
        map.setColumnCount(noOfColumns);
        map.setRowCount(noOfRows);

        Location[][] locations = createLocations(noOfRows, noOfColumns);
        
        map.setLocations(locations);
        Scene[] scenes = createScenes();
        MapControl.createQuestions();
        
        //make an array for each of the 2 following calls
        InterviewQuestion[] myQuestion = new InterviewQuestion[6];
        
        MapControl.assignQuestionsToScenes(myQuestion,scenes);
        assignItemsToScenes(null,scenes);
        assignScenesToLocations(scenes,locations);
        
        return map;
    }    
    
    

    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
       System.out.println("***createLocations() called***");
      
     if ( noOfRows < 1 || noOfColumns < 1){
     return null;
     }  
     Location[][] locations = new Location[noOfRows][noOfColumns];
   
     for( int Rows = 0; Rows < noOfRows; Rows++){
    for(int Columns = 0; Columns < noOfColumns; Columns++){
        locations [Rows][Columns] = new Location();
        locations[Rows][Columns].setRow(Rows);
        locations[Rows][Columns].setColumn(Columns);
         
        locations[Rows][Columns].setVisited(false);
    
    }
   }

    return locations; 
       
    }

   
    public enum SceneType{
        resource_Scene, 
        question_Scene,;

    }
    private static Scene[] createScenes(){
        System.out.println("******createScenes[] called*****");
       
         int noOfScenes = 2;
        Scene[] scenes = new Scene[noOfScenes]; //create an array InventoryItem objects
        
        Scene resourceScene = new Scene();
        resourceScene.setDescription("Resource Scene");
        resourceScene.setPosition(0);
        
        scenes[SceneType.resource_Scene.ordinal()] = resourceScene;          
        
        Scene questionScene = new Scene();
        questionScene.setDescription("Question Scene");
        resourceScene.setPosition(1);
        scenes[SceneType.question_Scene.ordinal()] = questionScene;              
        
        return scenes;
         }
    
    //moved lines 197-204 to MapControl class per instructions in L10 Team Assignment
    
//    private static Question[] createQuestions(){
//        System.out.println("******createQuestions[] called*****");
//        return null;
//    }
//    private static void assignQuestionsToScenes(InterviewQuestion[] questions, Scene[] scenes){
//         System.out.println("******assignQuestionsToScenes[] called*****");
//        }
    
    private static void assignItemsToScenes(InventoryItem[] items, Scene[] scenes){
        System.out.println("******assignItemsToScenes[] called*****");

//   MT started building in lesson 10 and then removed since it doesn't really fit within the concept of our game         
//        ArrayList<InventoryItem> itemsInScene = null;
//        
//        resource_Scene.setItems(itemsInScene);
//        
//        ResourceScene resourceScene = (ResourceScene) scenes[SceneType.resource_Scene.ordinal()];
//        itemsInScene.add(items[ ItemType.bullets.ordinal()]);
//        itemsInScene.add(items[ ItemType.food.ordinal()]);
//        itemsInScene.add(items[ ItemType.oxen.ordinal()]);
//        itemsInScene.add(items[ ItemType.tools.ordinal()]);
//        itemsInScene.add(items[ ItemType.wagonAxle.ordinal()]);
//        itemsInScene.add(items[ ItemType.wagonTongues.ordinal()]);
//        itemsInScene.add(items[ ItemType.wagonWheels.ordinal()]);
//        
    }
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
        System.out.println("******assignScenesToLocations[] called*****");
   
        locations [0][0].setScene(scenes[SceneType.resource_Scene.ordinal()]);
        locations [0][1].setScene(scenes[SceneType.resource_Scene.ordinal()]); // I dont know if we should have scenetype. it is not a requirement 
        
        
    }    
// made by gabby



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

//    private static class Question { /// to stop error line 167   
//
//        public Question() { //moved to MapControl class per instructions in L10 team assignment
//        }
//    }
    
}

