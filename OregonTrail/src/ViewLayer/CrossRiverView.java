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
    
    public CrossRiverView() {
    }

        @Override
        public void display() {
        this.console.println("\n"
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
        this.console.println("\n" + menuSelection);
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
                
            default: this.console.println("Invalid selection");
      
            break;
        }
        return false;
    }   
          
        private void waitOneDay() {
           this.console.println("*** waitOneDay Selected***");
            
        }
        
        private void findFerry() {
           this.console.println("*** findFerry Selected***");
            
        }
        
        private void sealFloatBoat() {
           this.console.println("*** sealFloatBoat Selected***");
            
        }     

         public void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
            
        }
     
    
}
