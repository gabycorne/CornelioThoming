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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }

    public View(String displayMessage) {
        this.displayMessage = displayMessage;
    }
    
    @Override
    public void display() {
    
        boolean done = false;
        do {
            //prompt for and get player's name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
        
        } while (!done); //exit the view when done == true
    
    }
    
    @Override
    public String getInput(){
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        //while a valid name has not been found
        while (!valid) {
        
            //prompt for the player's name
            System.out.println("\n" + this.displayMessage);
            
            //get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) { // if a blank value is entered
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }
        
        return value; // return the name
    }    
}
