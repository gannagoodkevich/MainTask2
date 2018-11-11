
//Tests(for all MainTask1)

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;
import by.epam.javatraining.maintask1.goodkevich.model.logic.VectorCalculation;

class ArrayTest {

	private SuperVector vector = null;

	@Test
	void maxValueArrayTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		double result = 5.0;
		assertEquals(result, VectorCalculation.maxValueArray(vector));
	}

	@Test
	void maxValueArrayTest1() {
		double testArray[] = { 5.0, 1.0 };
		vector = new SuperVector(testArray);
		double result = 5.0;
		assertEquals(result, VectorCalculation.maxValueArray(vector));
	}

	@Test
	void minValueArrayTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		double result = 1.0;
		assertEquals(result, VectorCalculation.minValueArray(vector));
	}

	@Test
	void minValueArrayTest1() {
		double testArray[] = { 5.0, 1.0 };
		vector = new SuperVector(testArray);
		double result = 1.0;
		assertEquals(result, VectorCalculation.minValueArray(vector));
	}

	@Test
	void averageTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		double result = 3.0;
		assertEquals(result, VectorCalculation.average(vector));
	}

	@Test
	void geometricMeanTest() {
		double testArray[] = { 1.0, 4.0 };
		vector = new SuperVector(testArray);
		double result = 2.0;
		assertEquals(result, VectorCalculation.geometricMean(vector));
	}

	@Test
	void sortCheckHigherTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		assertTrue(VectorCalculation.sortCheckHigher(vector));
	}

	@Test
	void sortCheckLowerTest() {
		double testArray[] = { 5.0, 1.0 };
		vector = new SuperVector(testArray);
		assertTrue(VectorCalculation.sortCheckLower(vector));
	}

	@Test
	void localMinTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		int result = -1;
		assertEquals(result, VectorCalculation.localMin(vector));
	}

	@Test
	void localMinTest0() {
		double testArray[] = { 1.0 };
		vector = new SuperVector(testArray);
		int result = -1;
		assertEquals(result, VectorCalculation.localMin(vector));
	}

	@Test
	void localMinTest00() {
		double testArray[] = { 1.0, 0.0, 6.0 };
		vector = new SuperVector(testArray);
		int result = 1;
		assertEquals(result, VectorCalculation.localMin(vector));
	}

	@Test
	void localMinTest1() {
		double testArray[] = { 9.0, 5.0 };
		vector = new SuperVector(testArray);
		int result = -1;
		assertEquals(result, VectorCalculation.localMin(vector));
	}

	@Test
	void localMinTest2() {
		double testArray[] = { 9.0, 5.0, 8.0, 0.0 };
		vector = new SuperVector(testArray);
		int result = 1;
		assertEquals(result, VectorCalculation.localMin(vector));
	}

	@Test
	void localMaxTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		int result = -1;
		assertEquals(result, VectorCalculation.localMax(vector));
	}

	@Test
	void localMaxTest0() {
		double testArray[] = { 1.0 };
		vector = new SuperVector(testArray);
		int result = -1;
		assertEquals(result, VectorCalculation.localMax(vector));
	}

	@Test
	void localMaxTest00() {
		double testArray[] = { 1.0, 2.0, 0.0 };
		vector = new SuperVector(testArray);
		int result = 1;
		assertEquals(result, VectorCalculation.localMax(vector));
	}

	@Test
	void localMaxTest1() {
		double testArray[] = { 9.0, 5.0 };
		vector = new SuperVector(testArray);
		int result = -1;
		assertEquals(result, VectorCalculation.localMax(vector));
	}

	@Test
	void localMaxTest2() {
		double testArray[] = { 0.0, 8.7, 2.0, 3.0 };
		vector = new SuperVector(testArray);
		int result = 1;
		assertEquals(result, VectorCalculation.localMax(vector));
	}

	@Test
	void linearSearchTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		assertTrue(VectorCalculation.linearSearch(vector, 1.0));
	}

	@Test
	void binorySearchTest() {
		double testArray[] = { 1.0, 5.0 };
		vector = new SuperVector(testArray);
		assertTrue(VectorCalculation.binorySearch(vector, 1.0));
	}

	@Test
	void binorySearchTest1() {
		double testArray[] = { 9.0, 5.0, 8.0 };
		vector = new SuperVector(testArray);
		assertTrue(VectorCalculation.binorySearch(vector, 9.0));
	}

	@Test
	void reversArrayTest() {
		double testArray[] = { 1.0, 5.0, 3.0 };
		double resultArray[] = { 3.0, 5.0, 1.0 };
		vector = new SuperVector(testArray);
		SuperVector vector1 = new SuperVector(resultArray);
		Assert.assertNotEquals(vector1, VectorCalculation.reversArray(vector));
	}

}