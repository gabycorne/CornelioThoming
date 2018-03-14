/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
import java.io.Serializable;
/**
 *
 * @code by Diana
 */
public class Scene implements Serializable {
    
    
    private String travelTime;
    private String description;
    private double blockedLocation;
    private String displaySymbol;
    private InventoryItem inventoryItem;
    private Location[] location = new Location[15];


    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return "WarehouseTypeScene{" + "travelTime=" + travelTime + ", description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }

    public void setPosition(int i) {
       System.out.println("set position called");
    }

}
