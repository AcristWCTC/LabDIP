package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Instlogin
 */
public class JOptionPaneOutput implements MessageOutput {

    @Override
    public void sendMessage(final MessageInput msgInput) {
        Message msg = msgInput.getMessage();
        JOptionPane.showMessageDialog(null, msg.getMessageAsString());
    }
    
}
