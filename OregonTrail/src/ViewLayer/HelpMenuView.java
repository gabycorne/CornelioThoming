/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("**** displayMenuView() called ***");
    }
    

        public String getInputs() {    // gabby I modified all the code here from the on in the reading
         boolean valid = false;
        String selection = null;
        try {
        while (!valid){
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1){
                 ErrorView.display(this.getClass().getName(),"You must enter a value");//gabby
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
             ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());//gabby
        }
        return selection;
    
}
        
    @Override
        public boolean doAction(String input) {
            System.out.println("**** HelpMenuView.doAction() called ***");
            System.out.println("\tinput = " + input);
        
        return true;
        }
    
}
