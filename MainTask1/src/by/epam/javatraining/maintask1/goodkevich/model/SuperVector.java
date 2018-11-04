package by.epam.javatraining.maintask1.goodkevich.model;

public class SuperVector {
	public static final int DEFOULT_SIZE = 10;
	
	private double array[];
	private int count = -1;
	
	public SuperVector() {
		array = new double[DEFOULT_SIZE];
	}
	
	public SuperVector(int size) {
		array = new double[size];
	}
	
	public SuperVector(double array[]) {
		this.array = array;
		count = array.length;
	}
	
	public void copyVector(SuperVector Vector, SuperVector Vector1) {
		for(int i=0; i < Vector.size(); i++) {
			Vector1.set(i, Vector.get(i));
		}
	}
	
	public boolean equalVector(SuperVector Vector, SuperVector Vector1) {
		boolean f = true;
		int i=0, j=0;
		if(Vector.get(i++) != Vector1.get(j++)) {
			f = false;
		}
		return f;
	}
	
	public int size() {
		return array.length;
	}
	
	public double get(int index) {
		return array[index];
	}
	
	public void set(int index, double value) {
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
