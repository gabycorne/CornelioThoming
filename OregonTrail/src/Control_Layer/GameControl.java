/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import oregontrail.OregonTrail;
import oregontrail.Player;
import ViewLayer.HelpMenuView;

/**
 *
 * @author mthoming
 */
public class GameControl {    


    public GameControl() {
    }
    public static Player savePlayer( String name){
               
        if (name == null || name.length() < 1){
                    
            return null;
    }
               
        Player playerTemp = new Player(); 
        
        playerTemp.setName(name);
        
        //OregonTrail.setPlayer(playerTemp);
                    
         return playerTemp;
                
    }
    
    public static void CreateNewGame(Player player) {
        System.out.println("**** CreateNewGame() called ****");
    }
}

