/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Control_Layer.GameControl;
import Exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.Game;
import static oregontrail.OregonTrail.getCurrentGame;
/**
 *
 * @author Owner
 */

public class SaveGameView extends View {
    
    @Override
    public boolean doAction(String inputs){
        String filePath = inputs;
        Game game = getCurrentGame(); 
        
        try{
        GameControl.saveGame(game, filePath);
        }catch (GameControlException e){
         ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());
        return false;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Saving the Game Error" + ex.getMessage());
        }
        this.console.println("The file was saved in " + filePath);
  
        return true;
    }

    private String getInput(String save_the_game) {
        this.console.println("Where do you want to save the game?");
        String filePath = null;
        try {
            filePath = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  filePath ;
    }

//    @Override
//    public boolean doAction(String value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

  
}
