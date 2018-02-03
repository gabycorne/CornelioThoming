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
    private double description;
    private double blockedLocation;
    private String displaySymbol;

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
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

    @Override
    public String toString() {
        return "WarehouseTypeScene{" + "travelTime=" + travelTime + ", description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }
    
   
    
}
