import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NextInt(input);
		NextDouble(input);
		NextString(input);
		input.close();
	}

	public static void NextInt(Scanner input) {

		System.out.println("Geben Sie einen Integer ein! ");
		int varInputNextInt = input.nextInt();
		System.out.println("Ihr Integer = " + varInputNextInt + "\n");
	}

	public static void NextDouble(Scanner input) {
		// Typecasting Kommazahl 2 Stellen nach dem Komma
		// 6,035 => 6.04
		System.out.println("Geben Sie einen Double ein! ");
		double varNextDouble = input.nextDouble();
		System.out.println("Ihr Double = " + varNextDouble + "\n");
		varNextDouble = varNextDouble * 100;
		System.out.println("Type Cast Phase 1 = " + varNextDouble);
		varNextDouble = (int) varNextDouble;
		System.out.println("Type Cast Phase 2 = " + varNextDouble);
		varNextDouble = varNextDouble / 100;
		System.out.println("Type Cast Phase 3 = " + varNextDouble + "\n");

		// Math Round
		System.out.println("Geben Sie einen 2. Double ein! ");
		double varNextDouble2 = input.nextDouble();
		// varNextDouble2 = (Math.round(varNextDouble2*100))/100;
		varNextDouble2 = varNextDouble2 * 100;
		System.out.println("Math Round Phase 1 = " + varNextDouble2);
		varNextDouble2 = (Math.round(varNextDouble2));
		System.out.println("Math Round Phase 2 = " + varNextDouble2);
		varNextDouble2 = varNextDouble2 / 100;
		System.out.println("Math Round Phase 3 = " + varNextDouble2 + "\n");
	}

	public static void NextString(Scanner input) {
		System.out.println("Geben Sie einen String ein!");
		String varNextString = input.next();
		System.out.println("Ihr String = " + varNextString + "\n");
	}
}