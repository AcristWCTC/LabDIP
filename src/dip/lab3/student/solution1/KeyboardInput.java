
package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardInput implements Output {

        @Override
	public String readln() {
            System.out.println("Please enter some text, then press return:");

            Scanner input = new Scanner(System.in);
            public message getMessage(){
            message = input.nextLine();
            return message;
	}
}
