package by.epam.javatraining.maintask1.goodkevich.controler;


import by.epam.javatraining.maintask1.goodkevich.model.*;
import by.epam.javatraining.maintask1.goodkevich.model.SuperVector;
import by.epam.javatraining.maintask1.goodkevich.veiw.Veiw;

public class Main{
	public static void main(String[] args) {
		int M;
		M = Veiw.InputInt();
		double Array[]= new double[M];
		Veiw.InputDoubleArray(Array);
		SuperVector Vector = new SuperVector(Array);
		Task11(Vector);
		Task12(Vector);
		Task13(Vector);
		Task14(Vector);
		Task15(Vector);
		Task16(Vector);
		Task17(Vector);
		int I, J;
		I = Veiw.InputInt();
		J = Veiw.InputInt();
		double Array2[][] = new double[I][J];
		Veiw.InputDoubleArray2(Array2);
		Veiw.OutputDoubleArray2(Array2);
		Task21(Array2);
		Task22(Array2);
		Task23(Array2);
	}
	public static void Task11(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(11);
		Veiw.OutputDouble(VectorCalculations.maxValueArray(Vector));
		Veiw.OutputDouble(VectorCalculations.minValueArray(Vector));
	}
	public static void Task12(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(12);
		Veiw.OutputDouble(VectorCalculations.average(Vector));
		Veiw.OutputDouble(VectorCalculations.geometricMean(Vector));
	}
	public static void Task13(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(13);
		Veiw.OutputBoolean(VectorCalculations.sortCheckHigher(Vector));
		Veiw.OutputBoolean(VectorCalculations.sortCheckLower(Vector));
	}
	public static void Task14(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(14);
		Veiw.OutputInt(VectorCalculations.localMax(Vector));
		Veiw.OutputInt(VectorCalculations.localMin(Vector));
	}
	public static void Task15(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(15);
		double element = Veiw.InputDouble();
		Veiw.OutputBoolean(VectorCalculations.linearSearch(Vector, element));
		Veiw.OutputBoolean(VectorCalculations.binorySearch(Vector, element));
	}
	public static void Task16(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(16);
		Veiw.outputDoublevector(VectorCalculations.reversArray(Vector));
	}
	public static void Task17(SuperVector Vector){
		Veiw.OutputTheNumberOfTask(17);
		Veiw.outputDoublevector(SortVector.bubbleSort(Vector));
		Veiw.outputDoublevector(SortVector.insertionSort(Vector));
		Veiw.outputDoublevector(SortVector.selectionSort(Vector));
		Veiw.outputDoublevector(SortVector.quickSort(Vector, 0,Vector.size()-1));
		//!!!Veiw.Close();!!!
	}
	public static void Task21(double Array2[][]){
		Veiw.OutputTheNumberOfTask(21);
		Veiw.OutputDouble(VectorCalculations.MaxValueArray2(Array2));
		Veiw.OutputDouble(VectorCalculations.MinValueArray2(Array2));
	}
	public static void Task22(double Array2[][]){
		Veiw.OutputTheNumberOfTask(22);
		Veiw.OutputDouble(VectorCalculations.AverageArray2(Array2));
		Veiw.OutputDouble(VectorCalculations.GeometricMeanArray2(Array2));
	}
	public static void Task23(double Array2[][]){
		Veiw.OutputTheNumberOfTask(23);
		Veiw.OutputBoolean(VectorCalculations.SemetricArray2(Array2));
	}
	
}