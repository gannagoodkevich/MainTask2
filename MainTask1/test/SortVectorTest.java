import org.junit.Assert;
import org.junit.jupiter.api.Test;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;
import by.epam.javatraining.maintask1.goodkevich.model.logic.SortVector;

class SortVectorTest {
	private SuperVector vector = null;
	private SuperVector vector1 = null;

	@Test
	void bubbleSortTest() {
		double testArray[] = { 1.0, 5.0, 3.0 };
		double resultArray[] = { 1.0, 3.0, 5.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.bubbleSort(vector));
	}

	@Test
	void insertionSortTest() {
		double testArray[] = { 1.0, 5.0 };
		double resultArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.insertionSort(vector));
	}

	@Test
	void insertionSortTest1() {
		double testArray[] = { 1.0, 5.0, 2.0, 9.0 };
		double resultArray[] = { 1.0, 2.0, 5.0, 9.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.insertionSort(vector));
	}

	@Test
	void insertionSortTest2() {
		double testArray[] = { 1.5, 10.0, 2.7, 9.0, 1.0 };
		double resultArray[] = { 1.0, 1.5, 2.7, 9.0, 10.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.insertionSort(vector));
	}

	@Test
	void selectionSortTest() {
		double testArray[] = { 1.0, 5.0, 3.0 };
		double resultArray[] = { 1.0, 3.0, 5.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.selectionSort(vector));
	}

	@Test
	void quickSortTest() {
		double testArray[] = { 1.0, 5.0, 3.0 };
		double resultArray[] = { 1.0, 3.0, 5.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.quickSort(vector, 0, vector.size() - 1));
	}

	@Test
	void quickSortTest1() {
		double testArray[] = { 1.0, 5.0, 8.0, 3.0 };
		double resultArray[] = { 1.0, 3.0, 5.0, 8.0 };
		vector = new SuperVector(testArray);
		vector1 = new SuperVector(resultArray);
		Assert.assertEquals(vector1, SortVector.quickSort(vector, 0, vector.size() - 1));
	}

}
