/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @made by Gabby
 */
public class Game implements Serializable {
    
    private String name;
    private double totalTime;
    private double bestTime;
    private Player player;
    private Map map;
    private InventoryItem[] inventoryItem = new InventoryItem[7];

    //default constructor
    public Game() {
    }

    //getters and setters
    public static Map getMap() {
        return null;
    }

    public void setMap(Map map) {
        this.map = map;
    }
        
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public InventoryItem[] getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem[] inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    
    //toString
    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    //hashCode and equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
