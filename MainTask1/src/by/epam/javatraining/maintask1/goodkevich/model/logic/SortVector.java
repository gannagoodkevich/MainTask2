//There are methods for processing vector, that DO sort vector

package by.epam.javatraining.maintask1.goodkevich.model.logic;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;

public class SortVector {

	public static SuperVector bubbleSort(SuperVector vector) {
		if(!VectorCalculation.sortCheckHigher(vector)) {
			bubbleActuallSort(vector);
		}
		return vector;
	}
	public static SuperVector bubbleActuallSort(SuperVector vector) {
		if (!VectorCalculation.sortCheckHigher(vector)) {
			for (int i = 1; i < vector.size(); i++) {
				for (int j = 0; j < vector.size() - 1; j++) {
					if (vector.get(i) < vector.get(j)) {
						vector.set(i, vector.get(i) + vector.get(j));
						vector.set(j, vector.get(i) - vector.get(j));
						vector.set(i, vector.get(i) - vector.get(j));
					}
				}
			}
		}
		return vector;
	}

	public static SuperVector insertionSort(SuperVector vector) {
		double y;
		int j;
		for (int i = 1; i < vector.size(); i++) {
			y = vector.get(i);
			j = i - 1;
			while (j >= 0 && y < vector.get(j)) {
				vector.set(j + 1, vector.get(j));
				j--;
			}
			vector.set(j + 1, y);
		}
		return vector;
	}

	public static SuperVector selectionSort(SuperVector vector) {
		int min;
		double buff;
		for (int i = 0; i < vector.size() - 1; i++) {
			min = i;
			for (int j = i + 1; j < vector.size(); j++) {
				if (vector.get(min) > vector.get(j)) {
					min = j;
				}
			}
			buff = vector.get(i);
			vector.set(i, vector.get(min));
			vector.set(min, buff);
			min = i;
		}
		return vector;
	}

	public static SuperVector quickSort(SuperVector vector, int left, int right) {
		int i = left;
		int j = right;
		double key = vector.get(left + (right - left) / 2);
		do {
			while (vector.get(i) < key) {
				i++;
			}
			while (vector.get(j) > key) {
				--j;
			}
			if (i <= j) {

				double temp = vector.get(i);
				vector.set(i, vector.get(j));
				vector.set(j, temp);
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j) {
			vector = quickSort(vector, left, j);
		}
		if (i < right) {
			vector = quickSort(vector, i, right);
		}
		return vector;
	}

}
