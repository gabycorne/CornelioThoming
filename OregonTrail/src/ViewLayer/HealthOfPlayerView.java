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
public class HealthOfPlayerView extends View {
    
    @Override
    public void display() {
      System.out.println("Please enter your weight");
      String weight = getInput();// I change this to a string it was int
      System.out.println("Please enter how many hours you walked");
      String  hoursWalked = getInput();
      
     
    }


     private boolean doAction(int weight, int hoursWalking){
         
        if(weight > 99 || weight < 270 && hoursWalking > 1 || hoursWalking < 10 ){
            ErrorView.display(this.getClass().getName(),"You are in good condition to make this jorney.");//gabby
                }
        else{
             ErrorView.display(this.getClass().getName(),"You need to either eat more to add more calories to your diet or to walk less.");//gabby
        }
         return false;

     }

    @Override
    public boolean doAction(String value) {
        return false;
        
    }

   

      
    }