/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oregontrail;

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
    
        public static void main(String[] args) {
            

            //show the game description
            ViewLayer.StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            
            
        }    
    
    public void junk(String[] args) {
        

        
        ViewLayer.GetFoodView getFoodView = new GetFoodView();
        getFoodView.displayBanner();
        getFoodView.display();
        
        System.out.println("**** Quit selected, returned to calling class ***");
        
        
        ViewLayer.BuyFoodView buyFoodView = new BuyFoodView();
        buyFoodView.displayMessage();
        buyFoodView.displayGetFoodView();
        
        
        
    }

    public static Player getplayer;

    private Player player;
    private static Game currentGame = null;
    private static Player playerOpt = null;
    
     public void setPlayer(Player player){
    //this.player = player;
    OregonTrail.playerOpt = player;
    }
     public static Game getCurrentGame(){
         return currentGame;
    }
    public static void setCurrentGame(Game currentGame){
         
    OregonTrail.currentGame = currentGame;
    }
    public static Player getPlayer(){
        return playerOpt;
    }
    public static void setPlayer(){
  
    }
    
}
