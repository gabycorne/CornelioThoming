/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author Diana Cornelio
 */
public class SelectLocationView {
    
     public SelectLocationView() {
    }
    
    public String getInputs(){
         boolean validInput = false;
        String input = ""; 
        
       displayPlaces();
        
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
        }while (!validInput);
        
        return input;
    }
      public void displayPlaces(){
        
    
        System.out.println("\n"
            + "\n---------------------------------"
            + "\n  Welcome to the trail.          "
            + "\n  What places do you want        "
            + "\n  to visit today?                "
            + "\n M - Missouri Frontier           "
            + "\n S - Store at Missouri           "
            + "\n w - Wagon Building Area         "
            + "\n D - Dessert                     "
            + "\n O - Oregon                      "    
            + "\n                                 "
            + "\n  Q - Quit Game                  "
            + "\n---------------------------------");
    
    }
    
     public void displaySelectLocation() {
            boolean endOfView = false;
            do {
               
           String  inputs =  getInputs();
           if(inputs.toUpperCase().equals("Q") )
                return;
           doAction(inputs);
           
            } while (endOfView != true);
            
        }
    
        public boolean doAction(String selection) {
            selection = selection.trim();
            selection = selection.toUpperCase();
            char selLoc = selection.charAt(0);
        
        switch (selLoc) {
            case 'M':  // select a location
                missouriFrontier();
                break;
            case 'S':  // select a location
                storeAtMissouri();
                break;
            case 'W':  // Select a location
                wagonBuildingArea();
                break;
            case 'D':  // Select a location
                dessert();
                break;
            case 'O':  // Select a location
                oregon();
                break;    
            case 'Q':  // Quit 
                return true;
            default:
                System.out.println("\n You typed an invalid selection, please try again.");
                break;
        }

        return false;
        }
     private void missouriFrontier() {
            System.out.println(" missouriFrontier() called ");
            System.out.println("no variable");
        }

        private void storeAtMissouri() {
            System.out.println(" storeAtMissouri() called ");
            System.out.println("no variable");
        }

        private void wagonBuildingArea() {
            System.out.println(" wagonBuildingArea() called ");
            System.out.println("no variable");
        }

        private void dessert() {
            System.out.println(" dessert() called ");
            System.out.println("no variable");
        }
    
        private void oregon() {
            System.out.println(" oregon() called ");
            System.out.println("no variable");
        }
   
}