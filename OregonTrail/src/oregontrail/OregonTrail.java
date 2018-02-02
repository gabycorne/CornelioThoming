/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oregontrail;
import static java.time.Clock.system;
import oregontrail.Player;
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
        
        playerOne.setName("George"); 
        playerOne.bestTime(7.0);
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getBestTime();
        
        system.out.println("Name = " + playerOneName + ", time = " + playerOneTime);
    }
    
}
