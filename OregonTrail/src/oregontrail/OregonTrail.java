/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oregontrail;

import ViewLayer.BuildWagonView;
import ViewLayer.BuyFoodView;
import ViewLayer.CrossRiverView;
import ViewLayer.GetFoodView;
import ViewLayer.MainMenuView;
import ViewLayer.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */    
    
    public static Player getplayer;

    //private Player player;
    private static Game currentGame = null;
    private static Game loadSavedGame = null;  //might be able to delete
    private static Game saveCurrentGame = null; //might be able to delete
    private static Player player = null;
    //private static Item item;
    public static Map map;
    private static PrintWriter logFile = null;
    //MT L12 variables for the input and output files
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static Game getCurrentGame(){
         return currentGame;
    }
    
    
    public static Game getLoadSavedGame() {
        return loadSavedGame;
    }    
    
    public static void setLoadSavedGame(Game loadSavedGame) {
        OregonTrail.saveCurrentGame = saveCurrentGame;
    }

    /*    
    public static Item getItem() {
    return item;
    }
    
    public static void setItem(Item item) {
    OregonTrail.item = item;
    }
    */

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
            
        OregonTrail.map = map;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Game getloadSavedGame() {
        return loadSavedGame;
    }

    public static void setloadSavedGame(Game loadSavedGame) {
        OregonTrail.loadSavedGame = loadSavedGame;
    }
    
    public static Game getSaveCurrentGame() {
        return saveCurrentGame;
    }    
    
    public static void setSaveCurrentGame(Game saveCurrentGame) {
        OregonTrail.saveCurrentGame = saveCurrentGame;
    }    
       
    public static Player getPlayer(){
        return OregonTrail.player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }
    

    public static void main(String[] args) {

        try{
            //MT L12 create new BufferedReader object and assign it to the inFile attribute
            OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            OregonTrail.outFile = new PrintWriter(System.out, true);
            OregonTrail.logFile = new PrintWriter("logFile.txt");// gabby
            //show the game description
            ViewLayer.StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            startProgramView.displayGetUserName();
            
            } catch (Exception e){
                System.out.println(e);
            }
        
            //MT L12 add a "finally" statement to ensure the inFile is closed and catches all errors
            finally {
                try {
                    if (OregonTrail.inFile != null)
                        OregonTrail.inFile.close();
                    
                    if (OregonTrail.outFile != null)
                        OregonTrail.outFile.close();
                    
                    if (OregonTrail.logFile != null)
                        OregonTrail.logFile.close();
                    
                } catch (IOException ex) {
                    System.out.println("Error closing files");
                    return;  //MT L12 this is from pg.5 & pg. 9 of the instructions, but I'm not sure if it's really needed.
                            //There is no error whether it's here or not, so I'm not sure which way is correct.
                }
                
            }
    }    
   
    //MT L12 Getter and Setter methods for the outFile and inFile variables created at the top of this class

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        OregonTrail.inFile = inFile;
    }
    
    public static PrintWriter getLogFile(){
    return logFile;
    }   // gabby
    public static void setLogFile(PrintWriter logFile){
    OregonTrail.logFile = logFile;//gabby
    }

    public static PrintWriter getOutPut() {// i created this to delete the error on the new class errorview
        return null;
    }
    

    
}
