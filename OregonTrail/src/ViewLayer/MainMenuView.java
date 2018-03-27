  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import Control_Layer.GameControl;
import Control_Layer.InterviewControl;
import oregontrail.Player;
import oregontrail.OregonTrail;
import Exceptions.InventoryControlException;
import Exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Exceptions.GameControlException;
import Exceptions.InterviewControlException;

/**
 *
 * @author mthoming
 */
public class MainMenuView extends View {
    
        @Override
        public void display() {
        this.console.println("\n"
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
            + "\n  P - Health Player              "
            + "\n  S - Save the Game              "    
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
            startNewGame();    // WE WANT THE CALL THE FUNCTION CREATENEWGAME() ON GAME CONTROL  AND CATCH IT HERE. WE HAVE FJNCTIONS AND METHODS BUT NOTHING IS CONNECTED
            }catch (GameControlException ex){
                ErrorView.display(this.getClass().getName(), "Error reading input:" + ex.getMessage());//gabby
            }
            };
                break;
                
            case "R": restartGame();
                break;

            case "M": displayMap();
                break;
            
            //Use for L11 team assignment
            case "C": {  //calculate wagon volume
            try {
                calcWagonVolume();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
              ErrorView.display(this.getClass().getName(), "Error reading input:" + ex.getMessage());//gabby
            }
        }
                break;

            //Mike use this for individual assignment
            case "B": {  //buy food
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
                
            case "W": buildWagon(); // 
                break;
                
            case "P":
                try{
                 playerHealth();
                }catch (InterviewControlException ex){
                ErrorView.display(this.getClass().getName(), "Error reading input:" + ex.getMessage());//gabby
                return false;
                }
                // individual assignment gabby
                break;
//            case "I":{
//                try{
//                    calcItemTotalWeight();// TEAM ASSIGNEMTN PAGE 8 GABBY   WE WANT TO USE THIS FUNCTION THAT IS LOCATED ON  INVENTORY CONTROL WE WANT TO DISPLAY THE MESSAGE BUT IS NOT WORKING
//                }catch (InventoryControlException ex){
//                System.out.println(ex.getMessage());}
//            }

            case "S": 
        {
            try {
                this.saveGame();
            } catch (GameControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            
            case "Q": return true;
                
            default: this.console.println("Invalid selection"); // ErrorView.display(this.getClass().getName(),"invalid selection") spould we modified this too???????
      
            break;
        }
        return false;
    }   
          
    
        private void saveGame() throws GameControlException {
            this.console.println("***saveGame Called***");
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
        this.console.println("***displayMap Called***");
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
        HelpMenuView helpMenuView = new HelpMenuView(); // Gabby modified this code because was not calling the help view , tutor show me how so i modified all of the vies that have this method
        helpMenuView.display();
            
        }      

    private void buildWagon() {
        BuildWagonView buildWagon = new BuildWagonView();
        buildWagon.display();
// individual assignment gabby
    }

    private void oldcalcItemTotalWeight() throws InventoryControlException {
        
   
    }

    private void playerHealth() throws InterviewControlException { // individual assignment gabby
      
        Scanner keyboard = new Scanner(System.in);// I had to change this one too but makes an error. 
        this.console.print("Enter how many meals you ate in a day");
      int  mealsAday = keyboard.nextInt();
       this.console.print("Enter how many hours you walked in a day");
      int  hoursWalking = keyboard.nextInt();     
       this.console.print("Enter your weight");
      int  weight = keyboard.nextInt();
      
       InterviewControl.healthOfPlayer(mealsAday,hoursWalking,weight);
      
      
    }

      
    


}
