package dip.lab3.student.solution1;

/**
 *
 * @author Instlogin
 */
public class StartUp {
    public static void main(String[] args) {
        // Try switching input and output strategies to see how flexible
        // this is...
        
        MessageInput input = new KeyboardInput();
        MessageOutput output = new JOptionPaneOutput();
    
        MessageService service = new MessageService(input, output);
        service.produceMessage();
        
        
    }
    
    
}
