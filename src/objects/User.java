//TODO: valid input
package objects;

import java.util.Scanner;
import input_output.Output;

public class User {
	public static void guess(int[] curr_try) {
		Output.askForInput();
	
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] s = str.split(" ");
		
		for(int i = 0; i < Numbers.MAX_NUMBERS; i++) {
			curr_try[i] = Integer.parseInt(s[i]);
		}
	}
}

