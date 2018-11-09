package ExseptionsForVector;

public class ExseptionsForVector {
	public static void exceprionVectorSizeNull(int size) throws NegativeArraySizeException {
		if (size < 0) {
			throw new NegativeArraySizeException("Size of vector can't be negative");
		}
	}

	public static void exceprionVectorSize(int size, int cursize) throws ArrayIndexOutOfBoundsException {
		if (size < cursize) {
			throw new ArrayIndexOutOfBoundsException("Out of border");
		}
	}

	public static void exceprionVectorEmpty(double arr[]) throws NullPointerException {
		if (arr == null)
			throw new NullPointerException("Vector is null");
	}

	public static void exceprionVectorEmpty(double arr[][]) throws NullPointerException {
		if (arr == null)
			throw new NullPointerException("Matrix is null");
	}
	public static void exceprionVectorSize(int size, int i, int j) throws ArrayIndexOutOfBoundsException {
		if (size < i || size < j) {
			throw new ArrayIndexOutOfBoundsException("Out of border");
		}
	}
}
