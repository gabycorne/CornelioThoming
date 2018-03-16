/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import java.util.Arrays;
import oregontrail.InventoryItem;

/**
 *
 * @author mthoming
 */
class itemsInScene {
    
        public static int purchasedItemsTotal(int[] purchasedItems){
          
        purchasedItems = new int[6];
        purchasedItems[0] = 10;  //10 boxes of bullets at $1/ea
        purchasedItems[1] = 500; //125lbs of food at $4/lb
        purchasedItems[2] = 400; //2 oxen at $200/ea
        purchasedItems[3] = 40;  //10 sets of clothes at $4/ea
        purchasedItems[4] = 250; //2 wagon tongues at $125/ea
        purchasedItems[5] = 200; //2 wagon wheels at $100/ea
        
        int sum = 0;
                
        for(int i: purchasedItems){
            System.out.println(Arrays.toString(purchasedItems));
        sum += i;
        }
            System.out.println(sum);
        return sum;

       
        // individual assignment
       
    }

//    static void add(InventoryItem item) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
