/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

/**
 *
 * @author mthoming
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
    void displayStartProgramView() {        
        boolean endOfView = false;
        do {
            String input = getInputs();
            
            input = input.toUpperCase();
            
           if (input == null || input.length() < 1 || input.equals("Q")) {
               boolean isValidInput = false;
               return;
            }
           
            endOfView = doAction(input);
        } while (endOfView != true);
        
    }
    
    private String getInputs() {
        //add "scanner" statement to get input from the user
        
        
        System.out.println("**** getInputs() called ***");
        
        String input = new String();
        input = "testInput";
        
        return input;
        /*
        getInputs(): String[] {

        inputs = new String array one element long

        Display a description of the view

        valid = false
        WHILE valid == false (no input value has been enterd)

            Display the prompt message
            Get the value entered from the keyboard
            Trim off leading and trailing blanks from the value

            IF length of the value < 1 then
                Display "You must enter a non-blank value”
                Continue (move to the top of the loop and repeat)
            ENDIF

            Assign the value to the fist position in the inputs array

            valid = true (ends the loop)
        ENDWHILE

        RETURN inputs
        */
    }

    private boolean doAction(String input) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinput = " + input);
        
        return true;
    }    

    public void display() {
        System.out.println("*** display() called ***");
    }
    
}
