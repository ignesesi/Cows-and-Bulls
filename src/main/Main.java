package main;

import objects.*;
import input_output.*;

public class Main {
	public static Result check_try(int[] curr_try, Numbers numbers) {
		Result res = new Result();
		for(int i = 0; i < Numbers.MAX_NUMBERS; i++) {
			if(curr_try[i] == numbers.getElementAt(i)) {
				res.setBulls(res.getBulls() + 1);
			}
		}
		
		for(int i = 0; i < Numbers.MAX_NUMBERS; i++) {
			for(int j = 0; j < Numbers.MAX_NUMBERS; j++) {
				if(numbers.getElementAt(i) == curr_try[j]) {
					if(i != j) {
						res.setCows(res.getCows() + 1);
					}
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.randomNumbers();
		
		//Test.test(numbers);

		while(true) {
			int[] curr_try = new int[4];
			
			//PLAYER
			User.guess(curr_try);
			
			Result res = new Result();
			res = check_try(curr_try, numbers); 
			if(res.getBulls() == 4) {
				Output.win();
				return;
			}
			Output.result(res);	
		}
	}
}
