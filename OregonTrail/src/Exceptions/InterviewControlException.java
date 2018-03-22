/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author gabby
 */
public class InterviewControlException extends Exception {

   public InterviewControlException() {
    }

    public InterviewControlException(String string) {
        super(string);
    }

    public InterviewControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InterviewControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InterviewControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
}
