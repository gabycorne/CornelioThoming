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
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("**** GameMenuView() called ***");
    }

    @Override
    public boolean doAction(String value) {
        System.out.println("******assignItemsToScenes[] called*****");
        return false;
    }

}
