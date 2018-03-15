/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Control_Layer.InventoryControl;
/**
 *
 * @author Owner
 */
public  class BuildWagonView extends View{
    public BuildWagonView() {
        super("\n"
            + "\n================================="
            + "\n  You can build your wagon       "
            + "\n  select the necessary items that"
            + "\n  you will need.                 "
            + "\n                                 "
            + "\n  I - Iron                       "
            + "\n  B - Bed                        "
            + "\n  W - wheels                     "
            + "\n  A - Axle assemblies            "
            + "\n  H - Hounds and bolsters        "
            + "\n  C - Cover                      "     
            + "\n  Q - Quit Game                  "
            + "\n=================================");
     String[] wagonListItems = null;// individual assignment gabby
        
     InventoryControl.Wagonlist(wagonListItems);//individual assignment gabby
   
    }
    
    
    @Override
    public void display() {
        boolean done = false;
        do{
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    
    }
    
    @Override
     public boolean doAction(String menuOption) {
                    
        switch (menuOption) {
            case "I":  
                iron();
                break;
            case "B":  
                bed();
                break;
            case "W":  
                wheels();
                break;
            case "A":  
                axleAssemblies();
                break;
            case "H": 
                houndsBolsters();
                break;   
            case "C":  
                cover();
                break;    
            case "Q":  // Quit 
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again***");
                break;
        }

        return false;
        }

        private void iron() {
            System.out.println("**** hunting() called ***");
            System.out.println("no variable");
        }

        private void bed() {
            System.out.println("**** bed() called ***");
            System.out.println("no variable");
        }

        private void wheels() {
            System.out.println("**** wheels() called ***");
            System.out.println("no variable");
        }

        private void axleAssemblies() {
            System.out.println("**** axleAssemblies() called ***");
            System.out.println("no variable");
        }
        
        private void  houndsBolsters() {
            System.out.println("**** houndsBolsters() called ***");
            System.out.println("no variable");
        }
        
        private void cover() {
            System.out.println("**** cover() called ***");
            System.out.println("no variable");
        }
   
}
