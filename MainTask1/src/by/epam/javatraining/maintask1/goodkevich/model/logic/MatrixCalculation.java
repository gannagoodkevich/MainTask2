// There are methods for processing Vector 2-dimensioned

package by.epam.javatraining.maintask1.goodkevich.model.logic;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperMatrix;

public class MatrixCalculation {
	public static double maxValueArray2(SuperMatrix vector) {
		double max = vector.get(0, 0);
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size(); j++) {
				if (max < vector.get(i, j)) {
					max = vector.get(i, j);
				}
			}
		}
		return max;
	}

	public static double minValueArray2(SuperMatrix vector) {
		double min = vector.get(0, 0);
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size(); j++) {
				if (min > vector.get(i, j)) {
					min = vector.get(i, j);
				}
			}
		}
		return min;
	}

	public static double averageArray2(SuperMatrix vector) {
		double av = 0;
		int amount = 0;
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size(); j++) {
				av += vector.get(i, j);
				amount++;
			}
		}
		av /= amount;
		return av;
	}

	public static double geometricMeanArray2(SuperMatrix vector) {
		double gm = 1;
		for (int i = 0; i < vector.size(); i++) {
			for (int j = 0; j < vector.size(); j++) {
				gm *= vector.get(i, j);
			}
		}
		gm = Math.sqrt(gm);
		return gm;
	}

	public static boolean semetricArray2(SuperMatrix vector) {
		boolean f = true;
		for (int i = 1; i < vector.size(); i++) {
			for (int j = 0; j < vector.size() - 1; j++) {
				if (vector.get(i, j) != vector.get(j, i)) {
					f = false;
				}
			}
		}
		return f;
	}

	public static String minLocalValueArray2(SuperMatrix vector) {
		String pos = "null";
		if (vector.size() >= 3) {
			for (int i = 1; i < vector.size() - 1; i++) {
				for (int j = 1; j < vector.size() - 1; j++) {
					pos = posMin2D(vector, i, j);
				}
			}
		}
		return pos;
	}

	public static String posMin2D(SuperMatrix vector, int i, int j) {
		String str1 = "null", str2 = "null";
		if (vector.get(i, j) < vector.get(i + 1, j) && vector.get(i, j) < vector.get(i - 1, j)
				&& vector.get(i, j) < vector.get(i, j - 1) && vector.get(i, j) < vector.get(i, j + 1)) {
			str1 = Integer.toString(i);
			str2 = Integer.toString(j);
		}
		return str1 + " " + str2;
	}

	public static String maxLocalValueArray2(SuperMatrix vector) {
		String pos = "null";
		if (vector.size() >= 3) {
			for (int i = 1; i < vector.size() - 1; i++) {
				for (int j = 1; j < vector.size() - 1; j++) {
					pos = posMax2D(vector, i, j);
				}
			}
		}
		return pos;
	}

	public static String posMax2D(SuperMatrix vector, int i, int j) {
		String str1 = "null", str2 = "null";
		if (vector.get(i, j) > vector.get(i + 1, j) && vector.get(i, j) > vector.get(i - 1, j)
				&& vector.get(i, j) > vector.get(i, j - 1) && vector.get(i, j) > vector.get(i, j + 1)) {
			str1 = Integer.toString(i);
			str2 = Integer.toString(j);
		}
		return str1 + " " + str2;
	}

	public static SuperMatrix transporation(SuperMatrix vector) {
		for (int i = 1; i < vector.size(); i++) {
			for (int j = 0; j < vector.size() - 1; j++) {
				double buff = vector.get(i, j);
				vector.set(i, j, vector.get(j, i));
				vector.set(j, i, buff);
			}
		}
		return vector;
	}
}
