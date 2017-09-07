//TEST
package input_output;

import objects.Numbers;

public class Test {
	public static void test(Numbers a){
		for(int i = 0; i < Numbers.MAX_NUMBERS; i++) {
			System.out.print(a.getElementAt(i));
			System.out.print(" ");
		}
		System.out.println();
	}	
}

