/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import oregontrail.OregonTrail;

/**
 *
 * @author mthoming
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    //MT L12 attributes to store references to the BufferedReader and PrinterWriter objects
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
    public View() {
    }

    public View(String displayMessage) {
        this.displayMessage = displayMessage;
    }
    
    @Override
    public void display() {
    
        boolean done = false;
        do {
            //prompt for and get input
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
        
        } while (!done); //exit the view when done == true
    
    }
    
    @Override
    public String getInput(){
        boolean valid = false;
        String selection = null;
        try {
        while (!valid){
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1){
                 ErrorView.display(this.getClass().getName(),"You must enter a value");//gabby
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());//gabby
        }
        return selection;
    }    
}
