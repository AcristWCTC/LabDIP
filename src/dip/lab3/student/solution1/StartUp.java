package dip.lab3.student.solution1;

/**
 *
 * @author Instlogin
 */
public class StartUp {
    public static void main(String[] args) {
        // Try switching input and output strategies to see how flexible
        // this is...
        
        MessageInput input = new StaticInput();
        MessageOutput output = new ConsoleMessageOutput();
    
        MessageService service = new MessageService(input, output);
        service.produceMessage();
        
        
    }
    
    
}
