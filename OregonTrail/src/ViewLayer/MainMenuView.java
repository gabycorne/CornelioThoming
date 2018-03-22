  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import ViewLayer.StartExistingGameView;
import Control_Layer.GameControl;
import Control_Layer.InventoryControl;
import oregontrail.Player;
import ViewLayer.HelpMenuView;
import oregontrail.OregonTrail;
import Control_Layer.itemsInScene;
import Exceptions.InventoryControlException;
import Exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Exceptions.GameControlException;

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
            + "\n  M - Display Map                "
            + "\n  C - Calculate Wagon Volume     "
            + "\n  B - Buy Food                   "
            + "\n  T - Total cost                 " 
            + "\n  W - Build Wagon                "
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
        //System.out.println("\n" + menuSelection);
        //String input = "";
        switch(menuSelection){
            
            case "N": {
            try{
            startNewGame();
            }catch (GameControlException ex){
                System.out.println(ex.getMessage());
            }
            };
                break;
                
            case "R": restartGame();
                break;

            case "M": displayMap();
                break;
            
            //Use for L11 team assignment
            case "C": {
            try {
                calcWagonVolume();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());// this is how to display the exception message 
            }
        }
                break;

            //Mike use this for individual assignment
            case "B": {
            try {
                buyFood();
            } catch (InventoryControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;                

                
            case "H": getHelp();
                break;
                
//            case "T": totalCost();
//                break;
                
            case "W": buildWagon(); // individual assignment gabby
                break;
                
//            case "I":{
//                break;
//            }
//                try{
//                
//                    InventoryControl.calcItemTotalWeight();// TEAM ASSIGNEMTN PAGE 8 GABBY
//                }catch (InventoryControlException ex){
//                System.out.println(ex.getMessage());}
//            }
               
            case "Q": return true;
                
            default: System.out.println("Invalid selection");
      
            break;
        }
        return false;
    }   
          
    
    
    
    
    
        private void startNewGame() throws GameControlException {
             
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

        //MT - reference for MT L09 individual Assignment.  Disabled in week 10.        
//        public void crossRiver(){
//            ViewLayer.CrossRiverView crossRiverView = new CrossRiverView();
//            crossRiverView.display();
//            crossRiverView.displayGetMenuEntry();   
//        }

        public void displayMap() {
        System.out.println("***displayMap Called***");
        ViewLayer.GameMenuView.displayMap();
        }

        public void calcWagonVolume() throws MapControlException {
        //System.out.println("***calcWagonVolume Called***");
        //call the view-layer function to get inputs from the user and feed them to MapControl.calcWagonVolume
        ViewLayer.WagonVolumeView wagonVolumeView = new WagonVolumeView();
        wagonVolumeView.display();
        wagonVolumeView.getInputs();
        
        }

        public void buyFood() throws InventoryControlException{
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

    private void oldcalcItemTotalWeight() throws InventoryControlException {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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