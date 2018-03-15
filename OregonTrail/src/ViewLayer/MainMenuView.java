  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import ViewLayer.StartExistingGameView;
import Control_Layer.GameControl;
import oregontrail.Player;
import ViewLayer.HelpMenuView;
import oregontrail.OregonTrail;

/**
 *
 * @author mthoming
 */
public class MainMenuView extends View {
    
        @Override
        public void display() {
        System.out.println("\n"
            + "\n================================="
            + "\n  Choose from the following:     "
            + "\n                                 "
            + "\n  N - New Game                   "
            + "\n  R - Restart saved Game         "
            + "\n  C - Cross river                "
            + "\n  B - Buy food                   "
            + "\n  H - Get help                   "                
            + "\n  Q - Quit game                  "
            + "\n                                 "
            + "\n  Please enter your selection    "
            + "\n=================================");
        
        
        }

        public void displayGetMenuEntry() {
            boolean done = false;
            do{
                String menuSelection = this.getInput();
                
                if (menuSelection.toUpperCase().equals("Q"))
                    return;

                done = this.doAction(menuSelection);
            } while (!done);
    
        }

    @Override
    public boolean doAction(String menuSelection){
    
        menuSelection = menuSelection.toUpperCase();  //convert the received input to uppercase
        System.out.println("\n" + menuSelection);
        //String input = "";
        switch(menuSelection){
            
            case "N": startNewGame();
                break;
                
            case "R": restartGame();
                break;

            case "C": crossRiver();
                break;
                
            case "B": buyFood();
                break;
                
            case "H": getHelp();
                break;
                
            case "W": buildWagon(); // individual assignment gabby
                break;
               
            case "Q": return true;
                
            default: System.out.println("Invalid selection");
      
            break;
        }
        return false;
    }   
          
    
    
    
    
    
        private void startNewGame(){
             
           Player playerTemp = new Player(); 
           OregonTrail.setPlayer(playerTemp);
           
           GameControl gc = new GameControl();
           GameControl.createNewGame(OregonTrail.getPlayer());
           
           GameControl.createItems();
           GameControl.createMap(5, 5);
           
           GameMenuView gameMenuView = new GameMenuView();
           gameMenuView.display();
           

            
        }
        
        public void restartNewGame(){
             ViewLayer.StartExistingGameView startExistingGameView = new StartExistingGameView();
           startExistingGameView.display();
            
        }
        
        public void crossRiver(){
            ViewLayer.CrossRiverView crossRiverView = new CrossRiverView();
            crossRiverView.display();
            crossRiverView.displayGetMenuEntry();
            
        }

        public void buyFood(){
            ViewLayer.BuyFoodView buyFoodView = new BuyFoodView();
            buyFoodView.display();
            buyFoodView.getInputs();
            
        }        
        
         private void restartGame() {
         }
        
         public void getHelp() {
        ViewLayer.MainMenuView.HelpMenuView helpMenuView = new HelpMenuView();
        HelpMenuView.displayHelpMenuView();
            
        }      

    private void buildWagon() {
        BuildWagonView buildWagon = new BuildWagonView();
        buildWagon.display();
// individual assignment gabby
    }

        public static class HelpMenuView {

            public static void displayHelpMenuView() {
                System.out.println("**** displayHelpMenuView() called ***");
                
            }

            public HelpMenuView() {
                System.out.println("**** HelpMenuView() called ***");
                
            }
        }
    


}