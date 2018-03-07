/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import ViewLayer.StartExistingGameView;
import Control_Layer.GameControl;
import oregontrail.OregonTrail;
import oregontrail.Player;
import ViewLayer.HelpMenuView;

/**
 *
 * @author mthoming
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
            + "\n================================="
            + "\n  Choose from the following:     "
            + "\n                                 "
            + "\n  N - New Game                   "
            + "\n  R - Restart saved Game         "
            + "\n  H - Get help                   "                
            + "\n  Q - Quit game                  "            
            + "\n=================================");
    
    }

    @Override
    public boolean doAction(String value){
    
        value = value.toUpperCase();  //convert the received input to uppercase
        String input = "";
        switch(input){
            
            case "N": startNewGame();
                break;
                
            case "R": restartGame();
                break;
                
            case "H": getHelp();
                break;
               
            case "Q": return true;
                
            default: System.out.println("Invalid selection");
      
            break;
        }
        return false;
    }
        
          
        public void startNewGame(){
             
           Player playerTemp = new Player(); 
           
           GameControl.CreateNewGame(OregonTrail.getplayer);
           ViewLayer.GameMenuView gameMenuView = new GameMenuView();
           gameMenuView.displayGameMenuView();
            
        }
        
        public void restartNewGame(){
             ViewLayer.StartExistingGameView startExistingGameView = new StartExistingGameView();
           startExistingGameView.displayStartExistingGameView();
            
        }
        
         private void restartGame() {
         }
        
         public void getHelp() {
        ViewLayer.MainMenuView.HelpMenuView helpMenuView = new HelpMenuView();
        HelpMenuView.displayHelpMenuView();
            
        }      

        public static class HelpMenuView {

            public static void displayHelpMenuView() {
                System.out.println("**** displayHelpMenuView() called ***");
                
            }

            public HelpMenuView() {
                System.out.println("**** HelpMenuView() called ***");
                
            }
        }
    
        public static void main(String[] args) {
        ViewLayer.StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();

        }

}