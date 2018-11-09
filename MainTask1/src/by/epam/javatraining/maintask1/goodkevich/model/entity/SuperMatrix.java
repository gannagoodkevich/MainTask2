// This is a vector 2 dimensional
package by.epam.javatraining.maintask1.goodkevich.model.entity;

import ExseptionsForVector.ExseptionsForVector;

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

	public int size() {
		ExseptionsForVector.exceprionVectorEmpty(array);
		return array.length;
	}

	public double get(int index1, int index2) {
		ExseptionsForVector.exceprionVectorEmpty(array);
		ExseptionsForVector.exceprionVectorSizeNull(array.length);
		ExseptionsForVector.exceprionVectorSize(array.length, index1, index2);
		return array[index1][index2];
	}

	public void set(int index1, int index2, double value) {
		ExseptionsForVector.exceprionVectorEmpty(array);
		ExseptionsForVector.exceprionVectorSizeNull(array.length);
		ExseptionsForVector.exceprionVectorSize(array.length, index1, index2);
		array[index1][index2] = value;
	}

	@Override
	public String toString() {
		ExseptionsForVector.exceprionVectorEmpty(array);
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
