/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Exceptions.MapControlException;
import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class WagonVolumeView extends View{
    //build this similar to the BuyFoodView
    
        @Override
    public void display() {
        System.out.println("\n"
            + "\n================================="
            + "\n  Calculate the volume of your   "
            + "\n  wagon       .                  "
            + "\n                                 "
            + "\n  Enter the width of the wagon   "
            + "\n  you wish to build:             ");
    }
    
    public void getInputs() throws MapControlException {
        boolean done = false;
        double height = 3;
        double width = 0;
        while (done != true) {
            double valueEntry1 = this.getValueEntry();
            if (valueEntry1 < 1 || valueEntry1 > 5) {

                System.out.println("\t  Please enter a width between 6 and 12:");                

            } else {
                done = true;
                width = valueEntry1; 
            }
           
        }
           
        System.out.println("\t  Please enter the depth of the wagon you wish to build:");
        
        done = false;
        double depth = 0;
        while (!done) {
            double valueEntry2 = this.getValueEntry();
            if (valueEntry2 < 1 || valueEntry2 > 500) {

                System.out.println("\t  Please enter a depth between 12 and 18:");                
                done = false;
            } else {
                done = true;
                depth = valueEntry2;
            }
            
        }
        
        double totalCost = doAction(width, depth, height);
        
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
            
        private double doAction(double width, double depth, double height ) throws MapControlException {
            
            double totalCost;

            totalCost = Control_Layer.MapControl.calcWagonVolume(width, depth, height);

        return totalCost;
        }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
