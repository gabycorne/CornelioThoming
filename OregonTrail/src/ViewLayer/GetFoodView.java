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
    
    public void displayBanner(){
        
        //display message
        System.out.println("\n"
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
    
        public void displayGetFoodView() {
            boolean endOfView = false;
            do {
                
                
                
            } while (endOfView != true);
            
        }
    
        public boolean doAction(String selection) {
            char charSel = selection.charAt(0);
        
        switch (charSel) {
            case 'H':  // Start New Game 
                hunting();
                break;
            case 'G':  // Load Saved Game
                gathering();
                break;
            case 'F':  // Save Current Game 
                fishing();
                break;
            case 'A':  // Help Menu
                HelpMenuView();
                break;
            case 'Q':  // Quit 
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again***");
                break;
        }

        return false;
        }

        private void hunting() {
            System.out.println("**** hunting() called ***");
            System.out.println("no variable");
        }

        private void gathering() {
            System.out.println("**** gathering() called ***");
            System.out.println("no variable");
        }

        private void fishing() {
            System.out.println("**** fishing() called ***");
            System.out.println("no variable");
        }

        private void HelpMenuView() {
            System.out.println("**** HelpMenuView() called ***");
            System.out.println("no variable");
        }
        
   
    }
