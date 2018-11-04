package by.epam.javatraining.maintask1.goodkevich.veiw;

import java.util.Scanner;

import by.epam.javatraining.maintask1.goodkevich.model.SuperVector;

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
	public static void InputDoubleArray(double Array[]) {
		for(int i=0; i < Array.length; i++) {
			Array[i] = in.nextDouble();
		}
	}
	public static void InputDoubleArray2(double Array2[][]) {
		for(int i=0; i<Array2.length; i++) {
			for(int j=0; j<Array2[i].length; j++) {
				Array2[i][j] = in.nextDouble();
			}
		}
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
	public static void outputDoublevector(SuperVector Vector) {
		for(int i=0; i < Vector.size(); i++) {
			System.out.print(Vector.get(i)+"\n");
		}
	}
	public static void OutputDoubleArray2(double Array2[][]) {
		for(int i=0; i<Array2.length; i++) {
			for(int j=0; j<Array2[i].length; j++) {
				System.out.print(Array2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static void OutputTheNumberOfTask(int num) {
		System.out.print("The answer on "+ num +" task\n");
	}
}