package by.epam.javatraining.maintask1.goodkevich.veiw;

import java.util.Scanner;

import by.epam.javatraining.maintask1.goodkevich.model.SuperVector;
import by.epam.javatraining.maintask1.goodkevich.model.SuperVector2D;

public class Veiw {
	private static Scanner in;
	static {
		in = new Scanner (System.in);
	}
	public static void Close() {
		in.close();
	}
	public static int InputInt() {
		int M = in.nextInt();
		return M;
	}
	public static double InputDouble() {
		double M = in.nextDouble();
		return M;
	}
	public static void OutputInt(int m) {
		System.out.println(m);
	}
	public static void OutputDouble(double m) {
		System.out.println(m);
	}
	public static void OutputBoolean(boolean f) {
		if(f) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void OutputString(String str) {
		System.out.println(str);
	}
	public static void outputDoublevector(SuperVector Vector) {
		for(int i=0; i < Vector.size(); i++) {
			System.out.print(Vector.get(i)+"\n");
		}
	}
	public static void OutputDoublevector2D(SuperVector2D Vector) {
		for(int i=0; i < Vector.size2D(); i++) {
			for(int j=0; j < Vector.size2D(); j++) {
				System.out.print(Vector.get2D(i, j)+" ");
			}
			System.out.print("\n");
		}
	}
	public static void OutputTheNumberOfTask(int num) {
		System.out.print("The answer on "+ num +" task\n");
	}
	public static void OutBorder() {
		System.out.println("---------------");
	}
}