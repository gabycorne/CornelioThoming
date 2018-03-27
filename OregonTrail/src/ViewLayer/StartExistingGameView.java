/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

/**
 *
 * @author mthoming
 */
public class StartExistingGameView extends View{
    
        @Override
        public void display() {
                this.console.println("**** GameMenuView() called ***");
                this.console.println("\tinput = ??");
            }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
