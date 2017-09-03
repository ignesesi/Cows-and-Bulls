import java.util.Scanner;

public class Cows_and_Bulls {
	
	public static final int MAX_NUMBERS = 4;	
	
	public static void random_numbers(int[] numbers){
		int[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i = 0; i < MAX_NUMBERS; i ++) {
			int curr = (int) (Math.random() * (9-i));
			numbers[i] = index[curr];
			index[curr] = index[9-i];
		}
	}
	
	public static void user_try(int[] curr_try) {
		System.out.print("Input ");
		System.out.print(MAX_NUMBERS);
		System.out.print(" numbers: ");
	
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] s = str.split(" ");
		
		for(int i = 0; i < MAX_NUMBERS; i++) {
			curr_try[i] = Integer.parseInt(s[i]);
		}

		//TO DO: valid input
	}

	public static boolean check_try(int[] curr_try, int[] numbers, int& cows, int& bulls) {
		for(int i = 0; i < MAX_NUMBERS; i++) {
			if(curr_try[i] == numbers[i]) {
				bulls++;
			}
		}
		
		for(int i = 0; i < MAX_NUMBERS; i++) {
			for(int j = 0; j < MAX_NUMBERS; j++) {
				if(numbers[i] == curr_try[j]) {
					cows++;
					break;
				}
			}
		}

		cows = cows - bulls;
		System.out.print(cows);
		System.out.print(" ");
		System.out.println(bulls);

		if(bulls == 4) {
			return true;
		}
		return false;
	}

	public static void test(int[] a){
		for(int i = 0; i < MAX_NUMBERS; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void output_cows_and_bulls(int cows, int bulls) {
		System.out.print("Cows: ");
		System.out.println(cows);
		System.out.print("Bulls: ");
		System.out.println(bulls);
	}

	public static void main(String[] args) {
		int[] numbers = new int[MAX_NUMBERS];
		random_numbers(numbers);
		test(numbers);	

		boolean win = false;
		while(!win) {
			int[] curr_try = new int[4];
			user_try(curr_try);
			test(curr_try);
			
			int cows = 0, bulls = 0;
			if(check_try(curr_try, numbers, cows, bulls)) {
				win = true;
				System.out.println("Congratulations! You win!");
				return;
			}
		
			output_cows_and_bulls(cows, bulls);	
		}
	}
}
