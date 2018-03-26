/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Owner
 */
public class PlayerHealthException extends Exception {

 
    public PlayerHealthException() {
    }

    
    public PlayerHealthException(String msg) {
        super(msg);
    }
}
