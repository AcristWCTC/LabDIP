
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;


public class GuiOutput implements Input {

	public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
