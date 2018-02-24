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
public class MainMenuView {

    public MainMenuView() {
    }
    
    public void displayMainMenuView() {

        boolean endView = false;

        do {
            String[] input = new String[10];
                    input[0] = getInputs();
            input[0] = input[0].toUpperCase();

            if (input[0] == null || input[0].length() < 1 || input[0].equals("Q")) {
                boolean isValidInput = false;
               return;
            }
            else {
                  return;
            }
        } while (endView != true);


    }
    
    
private boolean doAction(String[] input){
     
        String menuItem = input[0];
        
        menuItem = menuItem.toUpperCase();
        
        switch(menuItem){
            
            case "N": startNewGame();
                break;
                
            case "R": restartGame();
                break;
                
            case "H": getHelp();
                break;
               
            case "E": return true;
                
                default: System.out.println("Invalid main menu");
      
            return false;
            
            }
        return false;
  }
    
        public String getInputs() {
        boolean validInput = false;
        String[] input = new String[10]; 
        
        System.out.println("\t  Please enter your desired menu item");
        
        do {
            String value = "";
            
            Scanner inFile;
            inFile = new Scanner(System.in);
  
            value = inFile.nextLine();
            
            if (value == null || value.length() < 1 ) {
                
                System.out.println("\t  You must enter a non-blank value:");
            }
            else {
                validInput = true;
                input[0] = value.trim();
                
            }
           }
        
        while (!validInput);
        
        return input[0];
        
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
        ViewLayer.GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();

        }

}