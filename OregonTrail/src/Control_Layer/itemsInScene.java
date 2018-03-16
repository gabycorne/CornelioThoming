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
public class itemsInScene {
    
        public static int purchasedItemsTotal(int[] purchasedItems){
          
        purchasedItems[0] = 10;  //10 boxes of bullets at $1/ea
        purchasedItems[1] = 500; //125lbs of food at $4/lb
        purchasedItems[2] = 400; //2 oxen at $200/ea
        purchasedItems[3] = 40;  //10 sets of clothes at $4/ea
        purchasedItems[4] = 250; //2 wagon tongues at $125/ea
        purchasedItems[5] = 200; //2 wagon wheels at $100/ea
        
        int sum = 0;
            System.out.println("Individual cost of items in the array:");
            System.out.println("$" + purchasedItems[0]);
            System.out.println("$" + purchasedItems[1]);
            System.out.println("$" + purchasedItems[2]);
            System.out.println("$" + purchasedItems[3]);
            System.out.println("$" + purchasedItems[4]);
            System.out.println("$" + purchasedItems[5]);
        for(int i: purchasedItems){
            sum += i;
        }
            //System.out.println(sum);
        return sum;

       
        // individual assignment
       
    }

//    static void add(InventoryItem item) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
