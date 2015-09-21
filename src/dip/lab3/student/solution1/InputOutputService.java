
package dip.lab3.student.solution1;


public class InputOutputService {

	public static void main(String[] args) {
		
		Output reader = new FileOutput();
		Input writer = new GuiOutput();
		
		
		InputOutputService copier = new InputOutputService( reader, writer );
		copier.copy();
		
		System.out.println("Program ended. Line of reader input copied successfully to writer output.");
	}
}
