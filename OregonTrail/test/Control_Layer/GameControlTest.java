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
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcWagonVolume method, of class GameControl.
     */
    @Test
    public void testCalcWagonVolume() {
        System.out.println("calcWagonVolume");
        
        //Test case 1 
        System.out.println("\tTest case 1 (8*3*12 = 288 valid test) ");
        double width = 8.0;
        double height = 3.0;
        double depth = 12.0;
        double expResult = 288.0;
        double result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test case 2 
        System.out.println("\tTest case 2 (0*3*12 invalid test)");
        width = 0.0;
        height = 3.0;
        depth = 12.0;
        expResult = -1;
        result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0);

        //Test case 3 
        System.out.println("\tTest case 3 (8*0*12 invalid test)");
        width = 8.0;
        height = 0.0;
        depth = 12.0;
        expResult = -1;
        result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0);
        
        //Test case 4 
        System.out.println("\tTest case 4 (8*3*0 invalid test)");
        width = 8.0;
        height = 3.0;
        depth = 0.0;
        expResult = -1;
        result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0);  
        
        //Test case 5 
        System.out.println("\tTest case 5 (6*3*12 = 216 boundary test)");
        width = 6.0;
        height = 3.0;
        depth = 12.0;
        expResult = 216;
        result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0); 
        
        //Test case 6 
        System.out.println("\tTest case 6 (8*3*6 = 144 boundary test)");
        width = 8.0;
        height = 3.0;
        depth = 6.0;
        expResult = 144;
        result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0);    
        
        //Test case 7 
        System.out.println("\tTest case 7 (12*3*18 = 648 boundary test)");
        width = 12.0;
        height = 3.0;
        depth = 18.0;
        expResult = 648;
        result = GameControl.calcWagonVolume(width, height, depth);
        assertEquals(expResult, result, 0.0);        
    }
    
}
