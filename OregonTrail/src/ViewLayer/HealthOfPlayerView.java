/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Diana Cornelio
 */
public class HealthOfPlayerView {
    
    public void displayHealthOfPlayerView() {
      System.out.println("Please enter your weight");
      int weight = getInputs();
      System.out.println("Please enter how many hours you walked");
      int  hoursWalked = getInputs();
      
        doAction(weight, hoursWalked);
    }
     public int getInputs(){ 
        System.out.println("Please enter a number");
        Scanner Keyboard = new Scanner(System.in);
        boolean valid = false;
        int selection = 0;
        while (!valid){
            
            selection = Keyboard.nextInt();
            
            
        if (selection < 1 ){
            System.out.println("You have entered an invalid selection. Try again");
            continue;
        }
        break;
        }
        return selection;
     }
     private boolean doAction(int weight, int hoursWalking){
         
        if(weight > 99 || weight < 270 && hoursWalking > 1 || hoursWalking < 10 ){
              System.out.println(" You are in good condition to make this jorney. ");  
                }
        else{
             System.out.println( " You need to either eat more to add more calories to your diet or to walk less. ");  
        }
         return false;

     }

   

      
    }