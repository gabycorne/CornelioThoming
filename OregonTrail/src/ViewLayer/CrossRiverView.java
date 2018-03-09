/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

/**
 *
 * @author mthoming
 */
public class CrossRiverView extends View {

        @Override
        public void display() {
        System.out.println("\n"
            + "\n================================="
            + "\n  You encountered a river!       "
            + "\n  Choose what you will do:       "
            + "\n                                 "
            + "\n  W - Wait 1 day                 "
            + "\n  F - Find a ferry and pay $5    "
            + "\n  S - Seal and float your wagon  "                
            + "\n  H - Help Menu                  "
            + "\n  Q - Quit Game                  "
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
            
            case "W": waitOneDay();
                break;
                
            case "F": findFerry();
                break;
                
            case "S": sealFloatBoat();
                break;                
                
            case "H": getHelp();
                break;
               
            case "Q": return true;
                
            default: System.out.println("Invalid selection");
      
            break;
        }
        return false;
    }   
          
        private void waitOneDay() {
           System.out.println("*** waitOneDay Selected***");
            
        }
        
        private void findFerry() {
           System.out.println("*** findFerry Selected***");
            
        }
        
        private void sealFloatBoat() {
           System.out.println("*** sealFloatBoat Selected***");
            
        }     

         public void getHelp() {
        ViewLayer.MainMenuView.HelpMenuView helpMenuView = new MainMenuView.HelpMenuView();
        MainMenuView.HelpMenuView.displayHelpMenuView();
            
        }
     
    
}
