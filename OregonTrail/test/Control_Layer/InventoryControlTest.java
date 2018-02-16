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
        System.out.println("calcItemTotalCost (Michael's Tests)");
        
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
    
    
    //Author: Gaby Cornelio
    @Test
    public void testCalcItemTotalWeight() {
        System.out.println("calcItemTotalWeight (Gaby's Tests)");
      System.out.println("test case 1");
        double itemWeight = 50;
        double itemQuantityToPurchase = 4;
        double expResult = 200;
        double result = InventoryControl.calcItemTotalWeight(itemWeight, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
     
        
        System.out.println("test case 2");
         itemWeight = 50;
         itemQuantityToPurchase = -1;
        expResult = -1;
         result = InventoryControl.calcItemTotalWeight(itemWeight, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         System.out.println("test case 3");
         itemWeight = 50;
         itemQuantityToPurchase = 5;
        expResult = -1;
         result = InventoryControl.calcItemTotalWeight(itemWeight, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         System.out.println("test case 4");
         itemWeight = 50;
         itemQuantityToPurchase = 0;
        expResult = -1;
         result = InventoryControl.calcItemTotalWeight(itemWeight, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         System.out.println("test case 5");
         itemWeight = 50;
         itemQuantityToPurchase = 2;
        expResult = 100;
         result = InventoryControl.calcItemTotalWeight(itemWeight, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         System.out.println("test case 6");
         itemWeight = 50;
         itemQuantityToPurchase = 4;
        expResult = 200;
         result = InventoryControl.calcItemTotalWeight(itemWeight, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
