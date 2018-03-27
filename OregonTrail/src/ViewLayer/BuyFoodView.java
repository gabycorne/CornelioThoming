/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Exceptions.InventoryControlException;
import java.util.Scanner;
import ViewLayer.View;
import java.io.IOException;

/**
 *
 * @author mthoming
 */
public class BuyFoodView extends View {

    @Override
    public void display() {
        this.console.println("\n"
            + "\n================================="
            + "\n  Calculate the cost of the food "
            + "\n  you will buy.                  "
            + "\n                                 "
            + "\n  Enter the price of the food    "
            + "\n  you wish to buy:               ");
    }
    
    public void getInputs() throws InventoryControlException {
        
        double valueEntry1 = this.getValueEntry();
        double price = valueEntry1;
        //MT removed 3/22/18 for L11 Individual assignment
//        boolean done = false;
//        double price = 0;
//        while (done != true) {
//            double valueEntry1 = this.getValueEntry();
//            if (valueEntry1 < 1 || valueEntry1 > 5) {
//
//                System.out.println("\t  Please enter a price between 0 and 5 dollars");                
//
//            } else {
//                done = true;
//                price = valueEntry1; 
//            }
//           
//        }
           
        this.console.println("\t  Please enter the quantity (in pounds) of food you wish to purchase:");

        double valueEntry2 = this.getValueEntry();
        double quantity = valueEntry2;
        //MT removed 3/22/18 for L11 Individual assignment        
//        done = false;
//        double quantity = 0;
//        while (!done) {
//            double valueEntry2 = this.getValueEntry();
//            if (valueEntry2 < 1 || valueEntry2 > 500) {
//
//                System.out.println("\t  Please enter a quantity between 1 & 500 pounds");                
//                done = false;
//            } else {
//                done = true;
//                quantity = valueEntry2;
//            }
//            
//        }
        
        double totalCost = doAction(price, quantity);
        
        this.console.println("\t  total cost = " + totalCost);     
        
    }
    
        private double getValueEntry() {
            boolean validInput = false;
            String string1;
            double entry = 0;
            
            try {
                while (!validInput) {
                    
                    string1 = this.keyboard.readLine();
                    
                    try {
                        entry = Double.parseDouble(string1);
                        validInput = true;
                    } catch (NumberFormatException exc) {
                        this.console.println("Please enter a valid number");
                    }
                }           
            } catch (IOException e) {
                this.console.println("Error reading input: " + e.getMessage());
            }

//            while (!validInput) {
//                Scanner inFile;
//                inFile = new Scanner(System.in);
//
//                validInput = inFile.hasNextDouble();
//
//                if (!validInput) {
//                    System.out.println("Please enter a valid number"); 
//                    
//                }
//                else {
//                    entry = inFile.nextDouble();
//                    validInput = true;
//                } 
//
//            } //while (!validInput);

                return entry;   
            
        }
            
        private double doAction(double price, double quantity ) throws InventoryControlException {
            
            double totalCost;
            
            try {
                totalCost = Control_Layer.InventoryControl.calcItemTotalCost(price, quantity);
            }
            catch(InventoryControlException e) {
                this.console.println(e.getMessage());
                return 0;
            }
            
        return totalCost;
        }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
