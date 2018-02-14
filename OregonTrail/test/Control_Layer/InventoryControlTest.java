/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mthoming
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcItemTotalCost method, of class InventoryControl.
     */
    @Test
    public void testCalcItemTotalCost() {
        System.out.println("calcItemTotalCost");
        double itemCost = 0.2;
        double itemQuantityToPurchase = 500.0;
        double expResult = 100.0;
        double result = InventoryControl.calcItemTotalCost(itemCost, itemQuantityToPurchase);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
