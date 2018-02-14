/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author mthoming
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Control_Layer.GameControlTest.class, Control_Layer.InterviewControlTest.class, Control_Layer.InventoryControlTest.class, Control_Layer.MapControlTest.class})
public class Control_LayerSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
