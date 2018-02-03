/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oregontrail;
/**
 *
 * @author Owner
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      InventoryItem itemOne = new InventoryItem();
      Map mapOne = new Map();
      Location currentLocation = new Location();
        
        playerOne.setName("George"); 
        playerOne.setBestTime(7.00);
        itemOne.setInventoryType("Wagon Wheel");
        itemOne.setQuantityInStock(5);
        itemOne.setRequiredAmount(50);
        mapOne.setRowCount(2);
        mapOne.setColumnCount(2);
        currentLocation.setRow(1);
        currentLocation.setColumn(5);
        currentLocation.setVisited(true);
        currentLocation.setAmountRemaining(200);        
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getBestTime();
        String itemOneInventoryType = itemOne.getInventoryType();
        Actor.Father.getName();
        Actor.Father.getDescription();
        Actor.Mother.getName();
        Actor.Mother.getDescription();
        Actor.Son.getName();
        Actor.Son.getDescription();
        Actor.Daughter.getName();
        Actor.Daughter.getDescription();
        Actor.Baby.getName();
        Actor.Baby.getDescription();
        Actor.Grandfather.getName();
        Actor.Grandfather.getDescription();
        Actor.Cousin.getName();
        Actor.Cousin.getDescription();
        Actor.Aunt.getName();
        Actor.Aunt.getDescription();
        
        System.out.println(playerOne.toString());
        System.out.println(Actor.Father);
        System.out.println(Actor.Mother);
        System.out.println(Actor.Son);
        System.out.println(Actor.Daughter);
        System.out.println(Actor.Baby);
        System.out.println(Actor.Grandfather);
        System.out.println(Actor.Cousin);
        System.out.println(Actor.Aunt);
        System.out.println(itemOne.toString());
        System.out.println(mapOne.toString());
        System.out.println(currentLocation.toString());
    }
    
}
