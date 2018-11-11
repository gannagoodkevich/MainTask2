import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperMatrix;
import by.epam.javatraining.maintask1.goodkevich.model.logic.MatrixCalculation;

class SuperMatrixTest {
	
	private SuperMatrix vector = null;

	@Test
	void MaxValueArray2Test() {
		double testArray[][] = { { 1.1, 2, 2 }, { 0.0, 3, 0 } };
		vector = new SuperMatrix(testArray);
		double result = 3.0;
		assertEquals(MatrixCalculation.maxValueArray2(vector), result);
	}

	@Test
	void MinValueArray2Test() {
		double testArray[][] = { { 1.1, 2, 2 }, { 0.0, 3, 0 } };
		vector = new SuperMatrix(testArray);
		double result = 0.0;
		assertEquals(MatrixCalculation.minValueArray2(vector), result);
	}

	@Test
	void AverageArray2Test() {
		double testArray[][] = { { 1.1, 1.1 }, { 1.1, 1.1 } };
		vector = new SuperMatrix(testArray);
		double result = 1.1;
		assertEquals(MatrixCalculation.averageArray2(vector), result);
	}

	@Test
	void GeometricMeanArray2Test() {
		double testArray[][] = { { 2, 1 }, { 1, 2 } };
		vector = new SuperMatrix(testArray);
		double result = 2;
		assertEquals(MatrixCalculation.geometricMeanArray2(vector), result);
	}

	@Test
	void SemetricArray2Test() {
		double testArray[][] = { { 1, 1 }, { 1, 1 } };
		vector = new SuperMatrix(testArray);
		assertTrue(MatrixCalculation.semetricArray2(vector));
	}

	@Test
	void MinLocalValueArray2Test() {
		double testArray[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		vector = new SuperMatrix(testArray);
		String result = "1 1";
		assertEquals(MatrixCalculation.minLocalValueArray2(vector), (result));
	}

	@Test
	void MaxLocalValueArray2Test() {
		double testArray[][] = { { 1, 1, 1 }, { 1, 3, 1 }, { 1, 1, 1 } };
		vector = new SuperMatrix(testArray);
		String result = "1 1";
		assertEquals(MatrixCalculation.maxLocalValueArray2(vector), result);
	}

	@Test
	void transporationTest() {
		double testArray[][] = { { 1, 1, 1 }, { 2, 3, 1 }, { 2, 2, 1 } };
		double resArray[][] = { { 1, 2, 2 }, { 1, 3, 2 }, { 1, 1, 1 } };
		vector = new SuperMatrix(testArray);
		SuperMatrix vector1 = new SuperMatrix(resArray);
		Assert.assertNotEquals(vector1, MatrixCalculation.transporation(vector));
	}

}
