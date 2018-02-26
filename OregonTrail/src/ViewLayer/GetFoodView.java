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
public class GetFoodView {

    public GetFoodView() {
    }
    
    public void displayGetFoodView(){
        boolean done = false;  //set flag to 'not done'
        
        do {
            //prompt for and get players selection
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //if 'Q' then user wants to quit
                return; //then exit the game
            
            // otherwise do the requested action and display the next view
            done = this.doAction(menuOption);
        
        } while (!done);
    }    
        private String getMenuOption() {
            System.out.println("\n*** getMenuOption() function calles ***");
            return "N";
        }
    
        private boolean doAction(String menuOption) {
            System.out.println("\n*** doAction() function called ***");
            return true;
        }

    }
