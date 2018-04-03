/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class GetFoodView extends View {

    public GetFoodView() {
        super("\n"
            + "\n================================="
            + "\n  You can get food on the trail.  "
            + "\n  Hunting, gathering & fishing   "
            + "\n  are your options. Which one    "
            + "\n  will you choose?               "
            + "\n                                 "
            + "\n  H - Hunting                    "
            + "\n  G - Gathering                  "
            + "\n  F - Fishing                    "
            + "\n                                 "
            + "\n  A - Get Help                   "
            + "\n  Q - Quit Game                  "
            + "\n=================================");
    }
    
    public void displayBanner(){
        
        //display message
        this.console.println("(old message)");
    
    }
    
    @Override
    public void display() {
        boolean done = false;
        do{
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    
    }
    
  
    
        public boolean doAction(String menuOption) {
                    
        switch (menuOption) {
            case "H":  // go hunting for food
                hunting();
                break;
            case "G":  // gather food
                gathering();
                break;
            case "F":  // go fishing 
                fishing();
                break;
            case "A":  // Help Menu
                HelpMenuView();
                break;
            case "Q":  // Quit 
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again***");
                break;
        }

        return false;
        }

        private void hunting() {
            this.console.println("**** hunting() called ***");
            this.console.println("no variable");
        }

        private void gathering() {
            this.console.println("**** gathering() called ***");
            this.console.println("no variable");
        }

        private void fishing() {
            this.console.println("**** fishing() called ***");
            this.console.println("no variable");
        }

        private void HelpMenuView() {
            this.console.println("**** HelpMenuView() called ***");
            this.console.println("no variable");
        }
        
        
   
    }
