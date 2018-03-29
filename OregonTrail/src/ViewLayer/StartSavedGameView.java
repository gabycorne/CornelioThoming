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
 * @author mthoming
 */
public class StartSavedGameView extends View {

    @Override
    public String getInput() {
        this.console.println("Where do you want to load the game from?");
        String filePath = new String();
         try {
            filePath = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  filePath ;
    }
//        private String[] getInputs(){
//        String[] inputs = new String[0];
//       
//        this.console.println("Start the saved game");
//        inputs[0] = getInput(""); //get what the user entered
//        
//        // save a reference to input1 in the inputs array 
//        return inputs;
//    
//    }
    
    @Override
    public boolean doAction(String inputs){
        String filePath = inputs;
        
        try{
        GameControl.getGame(filePath);
        }catch(GameControlException e){
              ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());
        return false;
        
        } catch (IOException ex) {
                 ErrorView.display(this.getClass().getName(), "Saving the Game Error" + ex.getMessage());
             }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;

    }
    
}
