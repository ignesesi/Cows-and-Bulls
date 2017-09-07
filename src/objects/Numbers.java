//TODO: invalid index, value
package objects;

import input_output.Test;

public class Numbers {
	public static final int MAX_NUMBERS = 4;
	private int[] elements;

	public Numbers() {
		this.elements = new int[MAX_NUMBERS];
	}
	
	public void setElementAt(int index, int value) {
		if(index >= MAX_NUMBERS) {
			System.out.println("Invalid index.");
			return;
		}
		this.elements[index] = value;
	}

	public int getElementAt(int index) {
		if(index >= MAX_NUMBERS) {
			System.out.println("Invalid index.");
			return 0;
		}
		return this.elements[index];
	}
	
	public void randomNumbers() {
		int[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i = 0; i < MAX_NUMBERS; i++) {
			int curr = (int) (Math.random() * (9 - i));
			this.elements[i] = index[curr];
			index[curr] = index[9 - i];
		}
	}
}

