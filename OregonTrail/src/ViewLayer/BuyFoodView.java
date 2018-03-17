/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class BuyFoodView extends View {

    @Override
    public void display() {
        System.out.println("\n"
            + "\n================================="
            + "\n  Calculate the cost of the food "
            + "\n  you will buy.                  "
            + "\n                                 "
            + "\n  Enter the price of the food    "
            + "\n  you wish to buy:               ");
    }
    
    public void getInputs() throws InventoryControlException {
        boolean done = false;
        double price = 0;
        while (done != true) {
            double valueEntry1 = this.getValueEntry();
            if (valueEntry1 < 1 || valueEntry1 > 5) {

                System.out.println("\t  Please enter a price between 0 and 5 dollars");                

            } else {
                done = true;
                price = valueEntry1; 
            }
           
        }
           
        System.out.println("\t  Please enter the quantity (in pounds) of food you wish to purchase:");
        
        done = false;
        double quantity = 0;
        while (!done) {
            double valueEntry2 = this.getValueEntry();
            if (valueEntry2 < 1 || valueEntry2 > 500) {

                System.out.println("\t  Please enter a quantity between 1 & 500 pounds");                
                done = false;
            } else {
                done = true;
                quantity = valueEntry2;
            }
            
        }
        
        double totalCost = doAction(price, quantity);
        
        System.out.println("\t  total cost = " + totalCost);     
        
    }
    
        private double getValueEntry() {
        boolean validInput = false;
        double entry = 0;
        
            while (!validInput) {
                Scanner inFile;
                inFile = new Scanner(System.in);

                validInput = inFile.hasNextDouble();

                if (!validInput) {
                    System.out.println("Please enter a valid number"); 
                    
                }
                else {
                    entry = inFile.nextDouble();
                    validInput = true;
                } 

            } //while (!validInput);

                return entry;   
            
        }
            
        private double doAction(double price, double quantity ) throws InventoryControlException {
            
            double totalCost;

            totalCost = Control_Layer.InventoryControl.calcItemTotalCost(price, quantity);

        return totalCost;
        }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
