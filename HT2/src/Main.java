/*
 * Main
 *
 * Problem#2
 *
 * 18.10.2018
 */

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter three numbers:\n");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		Func m = new Func();
		boolean ans= m.check(a, b, c);
	    System.out.print("Numbers are equal?\n" + ans);
	}
}
