/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import Exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
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
     * created by Diana.
     */
    @Test
    public void testHealthOfPlayer() {
        System.out.println("test case #1");
        System.out.println("healthOfPlayer");
        int mealsADay = 7;
        int hoursWalking = 5;
        int weight = 180;
        int expResult = 1500;
        int result = 0;
        try {
            result = GameControl.healthOfPlayer(mealsADay, hoursWalking, weight);
        } catch (GameControlException ex) {
            Logger.getLogger(GameControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Actual results:" + result + "calories");
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       System.out.println("test case #2");
         mealsADay = 0;
         hoursWalking = 10;
         weight = 180;
         expResult = -1;
        try {
            result = GameControl.healthOfPlayer(mealsADay, hoursWalking, weight);
        } catch (GameControlException ex) {
            Logger.getLogger(GameControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Actual results:" + result + "calories");
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
        System.out.println("test case #3");
         mealsADay = 0;
         hoursWalking = 12;
         weight = 180;
         expResult = -1;
        try {
            result = GameControl.healthOfPlayer(mealsADay, hoursWalking, weight);
        } catch (GameControlException ex) {
            Logger.getLogger(GameControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Actual results:" + result + "calories");
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
        System.out.println("test case #4");
         mealsADay = -2;
         hoursWalking = 12;
         weight = 180;
         expResult = -1;
        try {
            result = GameControl.healthOfPlayer(mealsADay, hoursWalking, weight);
        } catch (GameControlException ex) {
            Logger.getLogger(GameControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Actual results:" + result + "calories");
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
        System.out.println("test case #5");
         mealsADay = 1;
         hoursWalking = 1;
         weight = 180;
         expResult = 100;
        try {
            result = GameControl.healthOfPlayer(mealsADay, hoursWalking, weight);
        } catch (GameControlException ex) {
            Logger.getLogger(GameControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Actual results:" + result + "calories");
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
        System.out.println("test case #6");
        mealsADay = 2;
        hoursWalking = 10;
        weight = 180;
        expResult = -3000;
        try {
            result = GameControl.healthOfPlayer(mealsADay, hoursWalking, weight);
        } catch (GameControlException ex) {
            Logger.getLogger(GameControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Actual results:" + result + "calories");
        assertEquals(expResult, result, 0);
    }
    
}
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
