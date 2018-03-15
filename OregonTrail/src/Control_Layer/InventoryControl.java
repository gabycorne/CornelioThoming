/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import oregontrail.InventoryItem;

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

    // code by gabby
    public static void Wagonlist(String[] wagonListItems){
          
        wagonListItems = new String[6];
        wagonListItems[0] = "Iron";
        wagonListItems[1] = "Bed";
        wagonListItems[2] = "Wheels";
        wagonListItems[3] = "Axle Asamblies";
        wagonListItems[4] = "Hounds and Bolsters";
        wagonListItems[5] = "Cover";
        
        int count = 0;
                
        for(String list: wagonListItems){
        System.out.println(list);
        count++;
        }
        System.out.println(count);
       
        
       
    }
    
//   Find the sum of a list
//total (list): number
//BEGIN
//total = 0
//FOR index = 0 TO list.length -1
// total = total + list[index]
//ENDFOR
//RETURN total
//END

    public static void Wagonlist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
