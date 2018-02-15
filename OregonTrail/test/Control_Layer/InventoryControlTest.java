/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mthoming
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcItemTotalCost method, of class InventoryControl.
     * Author: MThoming
     */
    @Test
    public void testCalcItemTotalCost() {
        System.out.println("calcItemTotalCost");
        
        // Test case 1
        System.out.println("\tTest case 1 (Food)");
        
        //define the input variables
        double itemCost = 1;
        double itemQuantityToPurchase = 500.0;
        
        //define the expected output variable
        double expResult = 500.0;
        
        //call the method
        double result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);

        
        // Test case 2
        System.out.println("\tTest case 2 (Bullets)");
        
        //define the input variables
        itemCost = 5;
        itemQuantityToPurchase = 12.0;
        
        //define the expected output variable
        expResult = 60.0;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);   
        
                
        // Test case 3
        System.out.println("\tTest case 3 (Clothing)");
        
        //define the input variables
        itemCost = 10;
        itemQuantityToPurchase = 12.0;
        
        //define the expected output variable
        expResult = 120.0;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        
                
        // Test case 4
        System.out.println("\tTest case 4 (null item cost)");
        
        //define the input variables
        itemCost = 0;
        itemQuantityToPurchase = 500.0;
        
        //define the expected output variable
        expResult = -1;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);  
        
                
        // Test case 5
        System.out.println("\tTest case 5 (null quantity)");
        
        //define the input variables
        itemCost = 1;
        itemQuantityToPurchase = 0;
        
        //define the expected output variable
        expResult = -1;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        
                
        // Test case 6
        System.out.println("\tTest case 6 (negative quantity)");
        
        //define the input variables
        itemCost = 1;
        itemQuantityToPurchase = -3;
        
        //define the expected output variable
        expResult = -1;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);  
        
                
        // Test case 7
        System.out.println("\tTest case 7 (Low boundary)");
        
        //define the input variables
        itemCost = 1;
        itemQuantityToPurchase = 1;
        
        //define the expected output variable
        expResult = 1;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        
                        
        // Test case 8
        System.out.println("\tTest case 8 (High boundary)");
        
        //define the input variables
        itemCost = 1;
        itemQuantityToPurchase = 10000;
        
        //define the expected output variable
        expResult = 10000;
        
        //call the method
        result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
    }
    
}
