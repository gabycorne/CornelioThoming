/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

/**
 *
 * @author mthoming
 */
public class MapControl {
    
    public static double calcWagonVolume(double width, double height, double depth) {
                
        if (width < 1 || height < 1 || depth < 1) {
          return -1;
        }
    
        if (width > 12 || width < 6) {
            return -1;
        }

        if (depth > 18 || depth < 6) {
            return -1;
        }
        double wagonVolume = width * height * depth;
            return wagonVolume;
    }    
    
}
