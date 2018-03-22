/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Control_Layer.MapControl;
import Exceptions.MapControlException;
import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class WagonVolumeView extends View {
    //build this similar to the BuyFoodView

    @Override
    public void display() {
        System.out.println("\n"
            + "\n================================="
            + "\n  Calculate the volume of your   "
            + "\n  wagon                          "
            + "\n                                 "
            + "\n  Enter the width of the wagon   "
            + "\n  you wish to build:             ");
    }
    
    public void getInputs() throws MapControlException {
        //boolean done = false; //MT removed 3/21/18 to test without using while statement
        double height = 3;
        //double width;
        double valueEntry1 = this.getValueEntry();
        double width = valueEntry1;
        
//        while (done != true) {
//            double valueEntry1 = this.getValueEntry();
//                  width = valueEntry1;
//                  done = true;
//             
//            
//            if (valueEntry1 < 6 || valueEntry1 > 12) {
//
//                System.out.println("\t  Please enter a width between 6 and 12:");                
//
//            } else {
//                done = true;
//                width = valueEntry1; 
//            }
//           
//        }
           
        System.out.println("\t  Please enter the depth of the wagon you wish to build:");
        
        //done = false;
        //double depth = 0;
        double valueEntry2 = this.getValueEntry();
        double depth = valueEntry2;

//        while (!done) {
//            double valueEntry2 = this.getValueEntry();
//                  done = true;
//                  depth = valueEntry2;          
//            if (valueEntry2 < 12 || valueEntry2 > 18) {
//
//                System.out.println("\t  Please enter a depth between 12 and 18:");                
//                done = false;
//            } else {
//                done = true;
//                depth = valueEntry2;
//            }
//            
//        }
        
        double totalVolume = doAction(width, depth, height);
        
        System.out.println("\t  total volume = " + totalVolume);     
        
    }
    
        public double getValueEntry() {
        boolean validInput = false;
        String string1;
        double entry = 0;
        
            while (!validInput) {
                Scanner inFile;
                inFile = new Scanner(System.in);

                string1 = inFile.next();
                try {
                entry = Double.parseDouble(string1); //change the user's entry into a double
                validInput = inFile.hasNextDouble(); 
                //return Double.parseDouble(string1);
                } catch (NumberFormatException exc) {  //or handle the error if they enter a non-numeric value
                    System.out.println("Please enter a valid number"); 
                }
                
                
                //old logic used prior to week 11
//                if (!validInput) {
//                    System.out.println("2Please enter a valid number"); 
//                }
//                else {
//                    entry = inFile.nextDouble();
//                    validInput = true;
//                } 

            } 

                return entry;   
            
        }
            
        private double doAction(double width, double depth, double height ) throws MapControlException {
            
            double totalCost;
            
            try {
                totalCost = Control_Layer.MapControl.calcWagonVolume(width, height, depth);
            }
            catch(MapControlException e) {
                System.out.println("e.getMessage");
                return 0;
            }
            
            //totalCost = Control_Layer.MapControl.calcWagonVolume(width, depth, height);

        return totalCost;
        }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("WagonVolumeView.doAction Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
