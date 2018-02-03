/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
import java.io.Serializable;
/**
 *
 * @Code by Diana
 */
public class WarehouseTypeScene implements Serializable {
    
  private String numOfItems;

    public String getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(String numOfItems) {
        this.numOfItems = numOfItems;
    }

    @Override
    public String toString() {
        return "WarehouseTypeScene{" + "numOfItems=" + numOfItems + '}';
    }
  
    
}
