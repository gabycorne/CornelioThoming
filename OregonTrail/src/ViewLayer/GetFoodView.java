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
        System.out.println("(old message)");
    
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
            case "H":  // Start New Game 
                hunting();
                break;
            case "G":  // Load Saved Game
                gathering();
                break;
            case "F":  // Save Current Game 
                fishing();
                break;
            case "A":  // Help Menu
                HelpMenuView();
                break;
            case "Q":  // Quit 
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
