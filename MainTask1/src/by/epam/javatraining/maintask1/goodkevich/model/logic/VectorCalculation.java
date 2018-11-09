//There are methods for processing vector, that DON'T sort vector

package by.epam.javatraining.maintask1.goodkevich.model.logic;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;

public class VectorCalculation {

	public static double maxValueArray(SuperVector vector) {
		double Max = vector.get(0);
		for (int i = 1; i < vector.size(); i++) {
			if (vector.get(i) > Max) {
				Max = vector.get(i);
			}
		}
		return Max;
	}

	public static double minValueArray(SuperVector vector) {
		double Min = vector.get(0);
		for (int i = 1; i < vector.size(); i++) {
			if (vector.get(i) < Min) {
				Min = vector.get(i);
			}
		}
		return Min;
	}

	public static double average(SuperVector vector) {

		double Av = 0;
		for (int i = 0; i < vector.size(); i++) {
			Av += vector.get(i);
		}
		Av /= vector.size();
		return Av;
	}

	public static double geometricMean(SuperVector vector) {

		double GM = 1;
		for (int i = 0; i < vector.size(); i++) {
			GM *= vector.get(i);
		}
		GM = Math.sqrt(GM);
		return GM;
	}

	public static boolean sortCheckHigher(SuperVector vector) {

		boolean f = true;
		for (int i = 0; i < vector.size() - 1; i++) {
			if (vector.get(i) > vector.get(i + 1)) {
				f = false;
			}
		}
		return f;
	}

	public static boolean sortCheckLower(SuperVector vector) {

		boolean f = true;
		for (int i = 0; i < vector.size() - 1; i++) {
			if (vector.get(i) < vector.get(i + 1)) {
				f = false;
			}
		}
		return f;
	}

	public static int localMin(SuperVector vector) {

		int pos = -1;
		if (vector.size() != 1 || vector.size() != 2) {
			for (int i = 1; i < vector.size() - 1; i++) {
				if (vector.get(i) < vector.get(i + 1) && vector.get(i) < vector.get(i - 1)) {
					pos = i;
				}
			}
		}
		return pos;
	}

	public static int localMax(SuperVector vector) {

		int pos = -1;
		if (vector.size() != 1 || vector.size() != 2) {
			for (int i = 1; i < vector.size() - 1; i++) {
				if (vector.get(i) > vector.get(i + 1) && vector.get(i) > vector.get(i - 1)) {
					pos = i;
				}
			}
		}
		return pos;
	}

	public static boolean linearSearch(SuperVector vector, double element) {

		boolean f = false;
		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i) == element) {
				f = true;
			}
		}
		return f;
	}

	public static boolean binorySearch(SuperVector vector, double element) {
		SuperVector vector1 = new SuperVector(vector.size());
		vector.copyVector(SortVector.bubbleSort(vector), vector1);
		boolean f = false;
		if (vector != null) {
			int low = 0, high = vector.size(), mid;
			while (low < high) {
				mid = ((low + high) >>> 1);
				if (element == vector.get(mid)) {
					f = true;
					break;
				} else {
					if (element <= vector.get(mid)) {
						high = mid;
					} else {
						low = mid + 1;
					}
				}
			}
		}
		return f;
	}

	public static SuperVector reversArray(SuperVector vector) {
		for (int i = 0; i < vector.size() / 2; i++) {
			vector.set(i, vector.get(i) + vector.get(vector.size() - i - 1));
			vector.set(vector.size() - i - 1, vector.get(i) - vector.get(vector.size() - i - 1));
			vector.set(i, vector.get(i) - vector.get(vector.size() - i - 1));
		}
		return vector;
	}
}