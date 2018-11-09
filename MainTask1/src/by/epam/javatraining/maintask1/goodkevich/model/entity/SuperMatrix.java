// This is a vector 2 dimensional
package by.epam.javatraining.maintask1.goodkevich.model.entity;

public class SuperMatrix {
	public static final int DEFAULT_SIZE = 4;

	private double array[][];
	private int count = -1;

	public SuperMatrix() {
		array = new double[DEFAULT_SIZE][DEFAULT_SIZE];
		count = DEFAULT_SIZE;
	}

	public SuperMatrix(int size) {
		array = new double[size][size];
		count = size;
	}

	public SuperMatrix(double array[][]) {
		this.array = array;
		count = array.length;
	}

	// !!!
	public void copySuperMatrix(SuperMatrix vector1) {
		for (int i = 0; i < vector1.size(); i++) {
			for (int j = 0; j < vector1.size(); j++) {
				vector1.set(i, j, this.get(i, j));
			}
		}
	}

	// !!!
	// public boolean equalMatrix(SuperMatrix vector1) {
	// boolean f = true;
	// for (int i = 0; i < vector1.size(); i++) {
	// for (int j = 0; j < vector1.size(); j++) {
	// if (this.get(i, j) != vector1.get(i, j)) {
	// f = false;
	// }
	// }
	// }
	// return f;
	// }

	public int size() {
		return array.length;
	}

	public double get(int index1, int index2) {
		return array[index1][index2];
	}

	public void set(int index1, int index2, double value) {
		array[index1][index2] = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				builder.append(array[i][j]).append(" ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
