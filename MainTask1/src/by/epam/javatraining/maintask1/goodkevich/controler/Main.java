//Java MainTak1
//This is a controller. Here all methods are shown(including additional task).
//
//But I can not work with logger. There are many errors:(
//
//
//Author: Ann Goodkevich
//
//Date: 09.11.2018
//

package by.epam.javatraining.maintask1.goodkevich.controler;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperMatrix;
import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;

//import org.apache.log4j.Logger;

import by.epam.javatraining.maintask1.goodkevich.model.logic.SortVector;
import by.epam.javatraining.maintask1.goodkevich.veiw.Utiles;
import by.epam.javatraining.maintask1.goodkevich.model.logic.MatrixCalculation;
import by.epam.javatraining.maintask1.goodkevich.model.logic.VectorCalculation;
import by.epam.javatraining.maintask1.goodkevich.veiw.Veiw;

public class Main {
	// public static Logger LOG = Logger.getRootLogger();
	public static void main(String[] args) {
		int size1 = Utiles.setVectorSizebyUser();
		int size2 = Utiles.setVectorSizeRandom(1, 20);
		SuperVector vector1 = new SuperVector(size1);
		SuperVector vector2 = new SuperVector(size2);
		vector1 = Utiles.createVectorbyUser(size1);
		vector2 = Utiles.createVectorRendom(size2, 26, 100);
		Task11(vector1);
		Task12(vector1);
		Task13(vector1);
		Task14(vector1);
		Task15(vector2);
		Task16(vector2);
		Task17(vector2);
		size1 = Utiles.setVectorSizebyUser();
		size2 = Utiles.setVectorSizeRandom(1, 20);
		SuperMatrix vector11 = new SuperMatrix(size1);
		SuperMatrix vector22 = new SuperMatrix(size2);
		vector11 = Utiles.createVector2DbyUser(size1);
		vector22 = Utiles.createVector2DRendom(size2, 36, 100);
		Task21(vector11);
		Task22(vector11);
		Task23(vector22);
		Task24(vector22);
		Task25(vector22);
	}

	public static void Task11(SuperVector vector) {
		Veiw.outputTheNumberOfTask(11);
		Veiw.outputDouble(VectorCalculation.maxValueArray(vector));
		Veiw.outputDouble(VectorCalculation.minValueArray(vector));
	}

	public static void Task12(SuperVector vector) {
		Veiw.outputTheNumberOfTask(12);
		Veiw.outputDouble(VectorCalculation.average(vector));
		Veiw.outputDouble(VectorCalculation.geometricMean(vector));
	}

	public static void Task13(SuperVector vector) {
		Veiw.outputTheNumberOfTask(13);
		Veiw.outputBoolean(VectorCalculation.sortCheckHigher(vector));
		Veiw.outputBoolean(VectorCalculation.sortCheckLower(vector));
	}

	public static void Task14(SuperVector vector) {
		Veiw.outputTheNumberOfTask(14);
		Veiw.outputInt(VectorCalculation.localMax(vector));
		Veiw.outputInt(VectorCalculation.localMin(vector));
	}

	public static void Task15(SuperVector vector) {
		Veiw.outputTheNumberOfTask(15);
		double element = Veiw.inputDouble();
		Veiw.outputBoolean(VectorCalculation.linearSearch(vector, element));
		Veiw.outputBoolean(VectorCalculation.binorySearch(vector, element));
	}

	public static void Task16(SuperVector vector) {
		Veiw.outputTheNumberOfTask(16);
		Veiw.outputDoublevector(VectorCalculation.reversArray(vector));
	}

	public static void Task17(SuperVector vector) {
		Veiw.outputTheNumberOfTask(17);
		Veiw.outputDoublevector(SortVector.bubbleSort(vector));
		Veiw.outBorder();
		Veiw.outputDoublevector(SortVector.insertionSort(vector));
		Veiw.outBorder();
		Veiw.outputDoublevector(SortVector.selectionSort(vector));
		Veiw.outBorder();
		Veiw.outputDoublevector(SortVector.quickSort(vector, 0, vector.size() - 1));
	} /// aaaaaaagrrrrr

	public static void Task21(SuperMatrix vector) {
		Veiw.outputTheNumberOfTask(21);
		Veiw.outputDouble(MatrixCalculation.maxValueArray2(vector));
		Veiw.outputDouble(MatrixCalculation.minValueArray2(vector));
		Veiw.outputDoublevector2D(vector);
	}

	public static void Task22(SuperMatrix vector) {
		Veiw.outputTheNumberOfTask(22);
		Veiw.outputDouble(MatrixCalculation.averageArray2(vector));
		Veiw.outputDouble(MatrixCalculation.geometricMeanArray2(vector));
	}

	public static void Task23(SuperMatrix vector) {
		Veiw.outputTheNumberOfTask(23);
		Veiw.outputBoolean(MatrixCalculation.semetricArray2(vector));
	}

	public static void Task24(SuperMatrix vector) {
		Veiw.outputTheNumberOfTask(24);
		Veiw.outputString(MatrixCalculation.maxLocalValueArray2(vector));
		Veiw.outputString(MatrixCalculation.minLocalValueArray2(vector));
	}

	public static void Task25(SuperMatrix vector) {
		Veiw.outputTheNumberOfTask(25);
		Veiw.outputDoublevector2D(vector);
		Veiw.outBorder();
		Veiw.outputDoublevector2D(MatrixCalculation.transporation(vector));
		Veiw.close();
	}
}