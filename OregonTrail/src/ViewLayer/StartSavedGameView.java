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
    
    private boolean doAction(String[] inputs){
        String filePath = inputs[0];
//   try{
//   GameControl.getGame();
//   }catch(GameControlException e){
//         ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());
//   return false;
//   } catch (IOException ex) {
//            ErrorView.display(this.getClass().getName(), "Saving the Game Error" + ex.getMessage());
//        }
   
// this should be like this. on line 36 marks an error because getGame() is empty and on GameControl getGame() has parameters String file path,
//so if we continue with the assignment we will solve this, but 
// i did not know how to do the rest. I solved the catch error but when i place the other error it came back so we can ask the instructor about this tonight.

   GameMenuView gameMenuView = new GameMenuView();
   this.console.println("This is the: " + gameMenuView);
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
