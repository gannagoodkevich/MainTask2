//That is vector

package by.epam.javatraining.maintask1.goodkevich.model.entity;

import ExseptionsForVector.ExseptionsForVector;

public class SuperVector {
	public static final int DEFOULT_SIZE = 10;

	private double array[];
	private int count = -1;

	public SuperVector() {
		array = new double[DEFOULT_SIZE];
		count = DEFOULT_SIZE;
	}

	public SuperVector(int size) {
		array = new double[size];
		count = size;
	}

	public SuperVector(double array[]) {
		this.array = array;
		count = array.length;
	}

	public int size() {
		ExseptionsForVector.exceprionVectorEmpty(array);
		return array.length;
	}

	public double get(int index) {
		ExseptionsForVector.exceprionVectorEmpty(array);
		ExseptionsForVector.exceprionVectorSizeNull(array.length);
		ExseptionsForVector.exceprionVectorSize(array.length, index);
		return array[index];
	}

	public void set(int index, double value) {
		ExseptionsForVector.exceprionVectorEmpty(array);
		ExseptionsForVector.exceprionVectorSizeNull(array.length);
		ExseptionsForVector.exceprionVectorSize(array.length, index);
		array[index] = value;
	}

	public void add(double value) {
		ExseptionsForVector.exceprionVectorEmpty(array);
		ExseptionsForVector.exceprionVectorSizeNull(array.length);
		if (count < array.length) {
			array[count++] = value;
		}
	}

	@Override
	public String toString() {
		ExseptionsForVector.exceprionVectorEmpty(array);
		ExseptionsForVector.exceprionVectorSizeNull(array.length);
		StringBuilder builder = new StringBuilder("[");
		for (double i : array) {
			builder.append(i).append(" ");
		}
		String str = builder.toString().substring(0, builder.toString().length()-1);
		str += "]";
		return str;
	}
}
