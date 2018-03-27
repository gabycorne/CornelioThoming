/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Exceptions.InventoryControlException;
import java.util.Scanner;
import ViewLayer.ErrorView;
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
           
        System.out.println("\t  Please enter the quantity (in pounds) of food you wish to purchase:");

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
        
        System.out.println("\t  total cost = " + totalCost);     
        
    }
    
        private double getValueEntry() {  // gabby I modified all the code here from the on in the reading but got this error because this is a double not string.
        return 0;// to delete the error but from line 78 to line 96 are the changes I made on this week 12
       
            
//         boolean valid = false;
//        String selection = null;
//        try {
//        while (!valid){
//            selection = this.keyboard.readLine();
//            selection = selection.trim();
//            
//            if (selection.length() < 1){
//                ErrorView.display(this.getClass().getName(),"You must enter a value")
//               ;//gabby
//                continue;
//            }
//            
//            break;
//        }
//        } catch (Exception e) {
//           ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());//gabby
//        }
//        return selection;
//  
//            
        }
            
        private double doAction(double price, double quantity ) throws InventoryControlException {
            
            double totalCost;
            
            try {
                totalCost = Control_Layer.InventoryControl.calcItemTotalCost(price, quantity);
            }
            catch(InventoryControlException e) {
                System.out.println(e.getMessage());
                return 0;
            }
            
        return totalCost;
        }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
