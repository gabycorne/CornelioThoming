/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

/**
 *
 * @author mthoming
 */
public class InventoryControl {
    
    //Author: MThoming
    public static double calcItemTotalCost(double itemCost, double itemQuantityToPurchase) {
        
        //if (StringUtils.isNumeric(itemCost) = false) {
        //    return -1;
        //}
        
        if (itemCost < 1) {
          return -1;
        }
    
        if (itemQuantityToPurchase < 1 || itemQuantityToPurchase > 10000) {
            return -1;
        }
    
        double totalCost = itemCost * itemQuantityToPurchase;
            return totalCost;
    }
    
    
    //Author: Gaby Cornelio
    public static double calcItemTotalWeight( double itemWeight, double itemQuantityToPurchase){
      
       
       //test case 1
        if (itemQuantityToPurchase < 2 || itemQuantityToPurchase > 4){
                    return -1; 
        }
     
     
       double totalWeight = itemWeight * itemQuantityToPurchase;

        return totalWeight;
        
       
         }    
}
