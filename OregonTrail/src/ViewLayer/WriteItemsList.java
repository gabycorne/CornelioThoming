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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;


/**
 *
 * @author mthoming
 */
public class WriteItemsList extends View {

    public void exportList(String filepath) {

        String[][] itemList = {{"Row", "Item"},
                     {"1", "Food"},
                     {"2", "Bullets"},
                     {"3", "Wagon Wheels"},
                     {"4", "Wagon Tongues"},
                     {"5", "Wagon Axle"},
                     {"6", "Oxen"},
                     {"7", "Tools"},                             
                    };
               String item = "";
        //try (PrintWriter output = new PrintWriter(filepath)) {
        
        try (PrintWriter output = new PrintWriter(new FileOutputStream(filepath))){
            //String header = "The following items are in the list:";
            //output.println(itemList);
            this.console.println("\n Report Title: Item List \n");
            output.println("\n Report Title: Item List \n\n");

            if ("".equals(itemList[0][0])) {
            } else {
                for (int i=0; i<8; i++) {
                    for (int j=0; j<2; j++) {
                        item += itemList[i][j];
                    }
                    this.console.println(" "+ itemList[i][0] + "\t" + itemList[i][1]);
                    output.println(" "+ itemList[i][0]+"\t" + itemList[i][1]);
                }
                this.console.println("\n ***File output completed successfully***");
                output.flush();
            }
            
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
