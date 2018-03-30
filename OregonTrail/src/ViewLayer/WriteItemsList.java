/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Control_Layer.ItemType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mthoming
 */
public class WriteItemsList extends View {

    @Override
    public void display() {
        String filepath = "";
               
        try (PrintWriter output = new PrintWriter(filepath)) {
        
            String header = "The following items are in the list:";
            output.println(header);
        
            String[][] strArr = {{"Number", "Item"},
                                 {"1", "Food"},
                                 {"2", "Bullets"},
                                 {"3", "Wagon Wheels"},
                                 {"4", "Wagon Tongues"},
                                 {"5", "Wagon Axle"},
                                 {"6", "Oxen"},
                                 {"7", "Tools"},                             
                                };

        for (String[] strArr1 : strArr) {
            for (String[] strArr2 : strArr) {
                this.console.println(Arrays.asList());
            }
        }

            output.flush();
        } catch (Exception e) {
            try {
                throw new IOException(e.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(WriteItemsList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
