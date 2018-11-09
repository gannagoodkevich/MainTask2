import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperMatrix;
import by.epam.javatraining.maintask1.goodkevich.model.logic.MatrixCalculation;

class SuperMatrixTest {

	@Test
	void MaxValueArray2Test() {
		double testArray[][] = { { 1.1, 2, 2 }, { 0.0, 3, 0 } };
		SuperMatrix Vector = new SuperMatrix(testArray);
		double Result = 3.0;
		assertEquals(MatrixCalculation.maxValueArray2(Vector), Result);
	}

	@Test
	void MinValueArray2Test() {
		double testArray[][] = { { 1.1, 2, 2 }, { 0.0, 3, 0 } };
		SuperMatrix Vector = new SuperMatrix(testArray);
		double Result = 0.0;
		assertEquals(MatrixCalculation.minValueArray2(Vector), Result);
	}

	@Test
	void AverageArray2Test() {
		double testArray[][] = { { 1.1, 1.1 }, { 1.1, 1.1 } };
		SuperMatrix Vector = new SuperMatrix(testArray);
		double Result = 1.1;
		assertEquals(MatrixCalculation.averageArray2(Vector), Result);
	}

	@Test
	void GeometricMeanArray2Test() {
		double testArray[][] = { { 2, 1 }, { 1, 2 } };
		SuperMatrix Vector = new SuperMatrix(testArray);
		double Result = 2;
		assertEquals(MatrixCalculation.geometricMeanArray2(Vector), Result);
	}

	@Test
	void SemetricArray2Test() {
		double testArray[][] = { { 1, 1 }, { 1, 1 } };
		SuperMatrix vector = new SuperMatrix(testArray);
		assertTrue(MatrixCalculation.semetricArray2(vector));
	}

	@Test
	void MinLocalValueArray2Test() {
		double testArray[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		SuperMatrix Vector = new SuperMatrix(testArray);
		String result = "1 1";
		assertEquals(MatrixCalculation.minLocalValueArray2(Vector), (result));
	}

	@Test
	void MaxLocalValueArray2Test() {
		double testArray[][] = { { 1, 1, 1 }, { 1, 3, 1 }, { 1, 1, 1 } };
		SuperMatrix vector = new SuperMatrix(testArray);
		String result = "1 1";
		assertEquals(MatrixCalculation.maxLocalValueArray2(vector), result);
	}

	@Test
	void transporationTest() {
		double testArray[][] = { { 1, 1, 1 }, { 2, 3, 1 }, { 2, 2, 1 } };
		double resArray[][] = { { 1, 2, 2 }, { 1, 3, 2 }, { 1, 1, 1 } };
		SuperMatrix vector = new SuperMatrix(testArray);
		SuperMatrix vector1 = new SuperMatrix(resArray);
		Assert.assertNotEquals(vector1, MatrixCalculation.transporation(vector));
	}

}
