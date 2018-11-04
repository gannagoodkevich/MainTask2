package by.epam.javatraining.maintask1.goodkevich.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void MaxValueArrayTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		double result = 5.0;
		if( VectorCalculations.maxValueArray(Vector) != result) {
			fail("Not yet implemented");
		}
	}
	@Test
	void MaxValueArrayTest1() {
		double TestArray[] = {5.0, 1.0};
		SuperVector Vector = new SuperVector(TestArray);
		double result = 5.0;
		if( VectorCalculations.maxValueArray(Vector) != result) {
			fail("Not yet implemented");
		}
	}
	@Test
	void MinValueArrayTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		double result = 1.0;
		if( VectorCalculations.minValueArray(Vector) != result) {
			fail("Not yet implemented");
		}
	}
	@Test
	void MinValueArrayTest1() {
		double TestArray[] = {5.0, 1.0};
		SuperVector Vector = new SuperVector(TestArray);
		double result = 1.0;
		if( VectorCalculations.minValueArray(Vector) != result) {
			fail("Not yet implemented");
		}
	}
	@Test
	void AverageTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		double result = 3.0;
		if( VectorCalculations.average(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void GeometricMeanTest() {
		double TestArray[] = {1.0, 4.0};
		SuperVector Vector = new SuperVector(TestArray);
		double result = 2.0;
		if( VectorCalculations.geometricMean(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void SortCheckHigherTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		if( !VectorCalculations.sortCheckHigher(Vector)) {
			fail("Fail");
		}
	}
	@Test
	void SortCheckLowerTest() {
		double TestArray[] = {5.0, 1.0};
		SuperVector Vector = new SuperVector(TestArray);
		if( !VectorCalculations.sortCheckLower(Vector)) {
			fail("Fail");
		}
	}
	@Test
	void LocalMinTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = -1;
		if( VectorCalculations.localMin(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMinTest0() {
		double TestArray[] = {1.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = -1;
		if( VectorCalculations.localMin(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMinTest00() {
		double TestArray[] = {1.0, 0.0, 6.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = 1;
		if( VectorCalculations.localMin(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMinTest1() {
		double TestArray[] = {9.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = -1;
		if( VectorCalculations.localMin(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMinTest2() {
		double TestArray[] = {9.0, 5.0, 8.0, 0.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = 1;
		if( VectorCalculations.localMin(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMaxTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = -1;
		if( VectorCalculations.localMax(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMaxTest0() {
		double TestArray[] = {1.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = -1;
		if( VectorCalculations.localMax(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMaxTest00() {
		double TestArray[] = {1.0, 2.0, 0.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = 1;
		if( VectorCalculations.localMax(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMaxTest1() {
		double TestArray[] = {9.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = -1;
		if( VectorCalculations.localMax(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LocalMaxTest2() {
		double TestArray[] = {0.0, 8.7, 2.0, 3.0};
		SuperVector Vector = new SuperVector(TestArray);
		int result = 1;
		if( VectorCalculations.localMax(Vector) != result) {
			fail("Fail");
		}
	}
	@Test
	void LinearSearchTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		if(!VectorCalculations.linearSearch(Vector, 1.0)) {
			fail("Fail");
		}
	}
	@Test
	void BinorySearchTest() {
		double TestArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		if(!VectorCalculations.binorySearch(Vector, 1.0)) {
			fail("Fail");
		}
	}
	@Test
	void BinorySearchTest1() {
		double TestArray[] = {9.0, 5.0, 8.0};
		SuperVector Vector = new SuperVector(TestArray);
		if(!VectorCalculations.binorySearch(Vector, 9.0)) {
			fail("Fail");
		}
	}
	@Test
	void ReversArrayTest() {
		double TestArray[] = {1.0, 5.0, 3.0};
		double ResultArray[] = {3.0, 5.0, 1.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(VectorCalculations.reversArray(Vector), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void BubbleSortTest() {
		double TestArray[] = {1.0, 5.0, 3.0};
		double ResultArray[] = {1.0, 3.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.bubbleSort(Vector), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void InsertionSortTest() {
		double TestArray[] = {1.0, 5.0};
		double ResultArray[] = {1.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.insertionSort(Vector), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void InsertionSortTest1() {
		double TestArray[] = {1.0, 5.0, 2.0, 9.0};
		double ResultArray[] = {1.0, 2.0, 5.0, 9.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.insertionSort(Vector), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void InsertionSortTest2() {
		double TestArray[] = {1.5, 10.0, 2.7, 9.0, 1.0};
		double ResultArray[] = {1.0, 1.5, 2.7, 9.0, 10.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.insertionSort(Vector), Vector1) == false) {
			fail("Fail");
		}
	}
	@Test
	void SelectionSortTest() {
		double TestArray[] = {1.0, 5.0, 3.0};
		double ResultArray[] = {1.0, 3.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.selectionSort(Vector), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void QuickSortTest() {
		double TestArray[] = {1.0, 5.0, 3.0};
		double ResultArray[] = {1.0, 3.0, 5.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.quickSort(Vector, 0, Vector.size()-1), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void QuickSortTest1() {
		double TestArray[] = {1.0, 5.0, 8.0, 3.0};
		double ResultArray[] = {1.0, 3.0, 5.0, 8.0};
		SuperVector Vector = new SuperVector(TestArray);
		SuperVector Vector1 = new SuperVector(ResultArray);
		if( Vector.equalVector(SortVector.quickSort(Vector, 0, Vector.size()-1), Vector1)== false) {
			fail("Fail");
		}
	}
	@Test
	void MaxValueArray2Test() {
		double TestArray[][] = {{1.1, 2,2}, 
								{0.0, 3,0}};
		double Result = 3.0;
		if( VectorCalculations.MaxValueArray2(TestArray) != Result) {
			fail("Fail");
		}
	}
	@Test
	void MinValueArray2Test() {
		double TestArray[][] = {{1.1, 2,2}, 
								{0.0, 3,0}};
		double Result = 0.0;
		if( VectorCalculations.MinValueArray2(TestArray) != Result) {
			fail("Fail");
		}
	}
	@Test
	void AverageArray2Test() {
		double TestArray[][] = {{1.1, 1.1}, 
								{1.1, 1.1}};
		double Result = 1.1;
		if( VectorCalculations.AverageArray2(TestArray) != Result) {
			fail("Fail");
		}
	}
	@Test
	void GeometricMeanArray2Test() {
		double TestArray[][] = {{2, 1}, 
								{1, 2}};
		double Result = 2;
		if( VectorCalculations.GeometricMeanArray2(TestArray) != Result) {
			fail("Fail");
		}
	}
	@Test
	void SemetricArray2Test() {
		double TestArray[][] = {{1, 1}, 
								{1, 1}};
		if( !VectorCalculations.SemetricArray2(TestArray)) {
			fail("Fail");
		}
	}
}