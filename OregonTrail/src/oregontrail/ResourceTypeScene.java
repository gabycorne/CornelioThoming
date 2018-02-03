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
public class ResourceTypeScene implements Serializable {
    
  
  private String amountAvailable;
  private double resourceType;

    public String getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(String amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public double getResourceType() {
        return resourceType;
    }

    public void setResourceType(double resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "ResourceTypeScene{" + "amountAvailable=" + amountAvailable + ", resourceType=" + resourceType + '}';
    }
  
    
}


