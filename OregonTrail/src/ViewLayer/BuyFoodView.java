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
public class BuyFoodView {

    public BuyFoodView() {
    }
    
    public void displayMessage(){
        
        //display message
        System.out.println("\n"
            + "\n================================="
            + "\n  Calculate the cost of the food "
            + "\n  you will buy.                  "
            + "\n                                 "
            + "\n  Enter the price of the food    "
            + "\n  you wish to buy:               ");
        
    }
  
    public void displayGetFoodView() {
        boolean done = false;
        do{
            double valueEntry1 = this.getValueEntry();
            if (valueEntry1 < 1 || valueEntry1 > 5) {

                System.out.println("\t  Please enter a price between 0 and 5 dollars");                

            } else {
                done = true;
            }
            
        } while (!done);
        
        double price = this.getValueEntry();
    
        System.out.println("\t  Please enter the quantity (in pounds) of food you wish to purchase:");
        
        do{
            double valueEntry2 = this.getValueEntry();
            if (valueEntry2 < 1 || valueEntry2 > 500) {

                System.out.println("\t  Please enter a quantity between 1 & 500 pounds");                
            
            } else {
                done = true;
            }
            
        } while (!done);
     
        double quantity = this.getValueEntry();
        
        double totalCost = doAction(price, quantity);
        
        System.out.println("\t  total cost = " + totalCost);     
        
    }
    
        private double getValueEntry() {
        boolean validInput = false;
        double entry = 0;
        
            do {
                double number;

                Scanner inFile;
                inFile = new Scanner(System.in);

                number = inFile.nextDouble();

                if (number < 1 || number > 5) {

                    System.out.println("\"%s\" is not a valid number.\n");
                }
                else {
                    validInput = true;
                    entry = number;
                } 

            } while (!validInput);

                return entry;   
            
        }
        
        /*
            private double getValueEntry() {
        boolean validInput = false;
        double value = ""; 
        

        do {
            double input = "";
            
            Scanner inFile;
            inFile = new Scanner(System.in);
  
            input = inFile.nextLine();
            
            if (input = null || input = '0') {
                
                System.out.println("\t  You must enter a non-blank value:");
            }
            else {
                validInput = true;
                value = input.trim();
                
            }
           }
        
        while (!validInput);
        
        return value;
        
        }        
        
        */

        private double doAction(double price, double quantity ) {
            
            double totalCost;

            totalCost = Control_Layer.InventoryControl.calcItemTotalCost(price, quantity);

        return totalCost;
        }
    //after getting the price and saving it in a variable, do the same thing with the quantity  
    //Store each in a different variable, then call the InventoryControl class 
    //to CalcItemTotalCost and return the result
        
        /*
                private double getValueEntry() {
        boolean validInput = false;
        
            Scanner inFile;
            inFile = new Scanner(System.in);
            
            double number;
            do {
                System.out.println("Please enter a positive number: ");
                while (!inFile.hasNextInt()) {
                    String input = inFile.next();
                    System.out.printf("\"%s\" is not a valid number.\n", input);
                }
                number = inFile.nextInt();
            } while (number < 0);
        
        return number;
        
        }
        */
    
}
