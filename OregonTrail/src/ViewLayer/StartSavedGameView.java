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

        private String[] getInputs(){
        String[] inputs = new String[0];
       
        inputs[0] = getInput("Start the saved game");
        
// input1 = getInput(thePromptMessage)
// save a reference to input1 in the inputs array 
        return inputs;
    
    }
    
    private boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        
        //MT commented out on 03/27/18.  Re-enable it and continue working on page 22 of L12
//        try{
//            GameControl.getGame();
//        } catch (GameControlException e) 
//        {
//            ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());
//        return false;
//        }
        this.console.println("The file was started from: " + filePath);
  
        return true;
    }

    private String getInput(String save_the_game) {
         System.out.println("Where do you want to load the game from?");
       String place = null;
         try {
            place = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  place ;
    }
    
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
