/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oregontrail;

import ViewLayer.BuildWagonView;
import ViewLayer.BuyFoodView;
import ViewLayer.CrossRiverView;
import ViewLayer.GetFoodView;
import ViewLayer.MainMenuView;
import ViewLayer.StartProgramView;

/**
 *
 * @author Owner
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */    
    
    public static Player getplayer;

    //private Player player;
    private static Game currentGame = null;
    private static Game loadSavedGame = null;  //might be able to delete
    private static Game saveCurrentGame = null; //might be able to delete
    private static Player player = null;
    //private static Item item;
    public static Map map;
    
    public static Game getCurrentGame(){
         return currentGame;
    }
    
    
    public static Game getLoadSavedGame() {
        return loadSavedGame;
    }    
    
    public static void setLoadSavedGame(Game loadSavedGame) {
        OregonTrail.saveCurrentGame = saveCurrentGame;
    }

    /*    
    public static Item getItem() {
    return item;
    }
    
    public static void setItem(Item item) {
    OregonTrail.item = item;
    }
    */

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
            
        OregonTrail.map = map;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Game getloadSavedGame() {
        return loadSavedGame;
    }

    public static void setloadSavedGame(Game loadSavedGame) {
        OregonTrail.loadSavedGame = loadSavedGame;
    }
    
    public static Game getSaveCurrentGame() {
        return saveCurrentGame;
    }    
    
    public static void setSaveCurrentGame(Game saveCurrentGame) {
        OregonTrail.saveCurrentGame = saveCurrentGame;
    }    
       
    public static Player getPlayer(){
        return OregonTrail.player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }
    

    public static void main(String[] args) {

        try{
        //show the game description
        ViewLayer.StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        startProgramView.displayGetUserName();
        } catch (Exception e){
        System.out.println(e);
        }
    }    
   
    public void junk(String[] args) {
        

        
//        ViewLayer.GetFoodView getFoodView = new GetFoodView();
//        getFoodView.displayBanner();
//        getFoodView.display();
//        
//        System.out.println("**** Quit selected, returned to calling class ***");
//        
//        
//        ViewLayer.BuyFoodView buyFoodView = new BuyFoodView();
//        buyFoodView.displayMessage();
//        buyFoodView.displayGetFoodView();
        
        
        
    }

    
}
