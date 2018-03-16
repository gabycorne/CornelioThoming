/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import Control_Layer.ItemType;
import java.util.ArrayList;

/**
 *
 * @author mthoming
 */
public class ResourceScene extends Scene {
    
    private double amountOfResource;
    private ItemType resourceType;
    private ArrayList<InventoryItem> items = new ArrayList();
    
    public ArrayList<InventoryItem> getItems() {
        return items;
    }
    
    public void setItems(ArrayList<InventoryItem> items) {
        this.items = items;
    }
}
