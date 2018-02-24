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
public class MainMenuView {

    public MainMenuView() {
    }
    
    public void displayMainMenuView() {

        boolean endView = false;

        do {
            String input = getInputs();
            input = input.toUpperCase();

            if (input == null || input.length() < 1 || input.equals("Q")) {
                boolean isValidInput = false;
               return;
            }
            else {
                    endView = doAction(input); 
            }
        } while (endView != true);

    }
    
        public String getInputs() {
        boolean validInput = false;
        String input = ""; 
        
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
                input = value.trim();
                
            }
           }
        
        while (!validInput);
        
        return input;
        
        } 
        
        private boolean doAction(String input) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinput = " + input);
        
        return true;
        }
        
        public void startNewGame() {
            System.out.println("**** startNewGame() called ***");
            System.out.println(" No variable set ");
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenuView();
        }
        
        private void getHelp() {
            ViewLayer.MainMenuView.HelpMenuView helpMenuView = new HelpMenuView();
            HelpMenuView.displayHelpMenuView();
        }

        private static class HelpMenuView {

            public static void displayHelpMenuView() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public HelpMenuView() {
                System.out.println("**** HelpMenuView() called ***");
                System.out.println("\tinput = ??");
            }
        }
    
        public static void main(String[] args) {
        ViewLayer.GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();

        }

}