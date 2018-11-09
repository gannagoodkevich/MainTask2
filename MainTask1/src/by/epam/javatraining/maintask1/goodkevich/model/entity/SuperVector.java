//That is vector

package by.epam.javatraining.maintask1.goodkevich.model.entity;

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
	
	public void copyVector(SuperVector vector, SuperVector vector1) {
		for(int i = 0; i < vector.size(); i++) {
			vector1.set(i, vector.get(i));
		}
	}
	
	public boolean equalVector(SuperVector vector1) {
		boolean f = true;
		int i=0, j=0;
		if(this.get(i++) != vector1.get(j++)) {
			f = false;
		}
		return f;
	}
	
	public int size() {
		return array.length;
	}
	
	public double get(int index) {
		if(index > this.size() || index < 0) {
			throw new IllegalStateException();
		}
		return array[index];
	}
	
	public void set(int index, double value) {
		if(index > this.size() || index < 0) {
			throw new IllegalStateException();
		}
		array[index] = value;
	}
	
	public void add(double value) {
		if(count < array.length) {
			array[count++] = value;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for(double i : array) {
			builder.append(i).append(" ");
		}
		builder.append("]");
		return builder.toString();
	}
}
