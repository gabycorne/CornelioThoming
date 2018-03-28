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

/**
 *
 * @author mthoming
 */
public class WriteItemsList extends View {

    public static void writeItemsList(ArrayList<String> list, String filepath) throws IOException {
    
        try (PrintWriter output = new PrintWriter(filepath)) {
        
            String header = "The following items are in the list:";
            output.println(header);
            //if itemList is not empty, write each item on a new line
//            if (list.isEmpty()) {
//            //do nothing
//            } else {
//                for (ItemType itemType : OregonTrail.ItemType()) {
//                    output.println(itemType...());
//                }
//            }
            output.flush();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
