
public class Output {
	public static void win() {
		System.out.println("Congratulations! You win!");
	}

	public static void result(Result res) {
		System.out.print("Cows: ");
		System.out.print(res.getCows());
		System.out.print(" Bulls: ");
		System.out.println(res.getBulls());
	}

	public static void askForInput() {
		System.out.print("Input ");
		System.out.print(Numbers.MAX_NUMBERS);
		System.out.println(" numbers: ");
	}
}

