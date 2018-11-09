package by.epam.javatraining.maintask1.goodkevich.model;

public class SuperVector2D {
public static final int DEFOULT_SIZE = 4;
	
	private double array[][];
	private int count = -1;
	
	public SuperVector2D() {
		array = new double[DEFOULT_SIZE][DEFOULT_SIZE];
		count = DEFOULT_SIZE;
	}
	
	public SuperVector2D(int size) {
		if(size <= 0) {
			throw new IllegalStateException();
		}
		array = new double[size][size];
		count = size;
	}
	
	public SuperVector2D(double array[][]) {
		this.array = array;
		count = array.length;
	}
	
	public void copyVector2D(SuperVector2D Vector, SuperVector2D Vector1) {
		for(int i=0; i < Vector1.size2D(); i++) {
			for(int j=0; j < Vector1.size2D(); j++) {
				Vector1.set2D(i, j, Vector.get2D(i, j));
			}
		}
	}
	
	public boolean equalVector2D(SuperVector2D Vector, SuperVector2D Vector1) {
		boolean f = true;
		for(int i=0; i < Vector.size2D(); i++) {
			for(int j=0; j < Vector.size2D(); j++) {
				if(Vector.get2D(i, j) != Vector1.get2D(i, j)) {
					f = false;
				}
			}
		}
		return f;
	}
	
	public int size2D() {
		return array.length;
	}
	
	public double get2D(int index1, int index2) {
		return array[index1][index2];
	}
	
	public void set2D(int index1, int index2, double value) {
		array[index1][index2] = value;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for(int i=0; i < count; i++) {
			for(int j=0; j < count; j++) {
				builder.append(array[i][j]).append(" ");
			}
			builder.append("/n");
		}
		builder.append("]");
		return builder.toString();
	}
}
