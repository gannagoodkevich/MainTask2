//Here you can see methods for user interface(inputting and outputting date on console)

package by.epam.javatraining.maintask1.goodkevich.veiw;

import java.util.Scanner;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperMatrix;
import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;

public class Veiw {
	private static Scanner in;
	static {
		in = new Scanner(System.in);
	}

	public static void close() {
		in.close();
	}

	public static int inputInt() {
		int m = in.nextInt();
		return m;
	}

	public static double inputDouble() {
		double m = in.nextDouble();
		return m;
	}

	public static void outputInt(int m) {
		System.out.println(m);
	}

	public static void outputDouble(double m) {
		System.out.println(m);
	}

	public static void outputBoolean(boolean f) {
		if (f) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void outputString(String str) {
		System.out.println(str);
	}

	public static void outputDoublevector(SuperVector vector) {
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + "\n");
		}
	}

	public static void outputDoublevector2D(SuperMatrix vector) {
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size(); j++) {
				System.out.print(vector.get(i, j) + " ");
			}
			System.out.print("\n");
		}
	}

	public static void outputTheNumberOfTask(int num) {
		System.out.print("The answer on " + num + " task\n");
	}

	public static void outBorder() {
		System.out.println("---------------");
	}
}