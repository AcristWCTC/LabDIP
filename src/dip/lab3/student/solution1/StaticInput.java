/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Adam
 */
public class StaticInput implements MessageInput{
    private static final String MSG = "Hello World";
    public Message getMessage() {
        Message msg = new Message(MSG);
        return msg;
    }
    
}
