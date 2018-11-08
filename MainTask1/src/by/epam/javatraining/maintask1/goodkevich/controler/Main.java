package by.epam.javatraining.maintask1.goodkevich.controler;


import by.epam.javatraining.maintask1.goodkevich.model.*;
import by.epam.javatraining.maintask1.goodkevich.model.SuperVector;
import by.epam.javatraining.maintask1.goodkevich.veiw.Veiw;

public class Main{
	public static void main(String[] args) {
		int size1 = Utiles.setVectorSizebyUser();
		int size2 = Utiles.setVectorSizeRandom();
		SuperVector vector1 = new SuperVector(size1);
		SuperVector vector2 = new SuperVector(size2);
		vector1.copyVector(Utiles.createVectorbyUser(size1), vector1);
		vector2.copyVector(Utiles.createVectorRendom(size2), vector2);
		Task11(vector1);
		Task12(vector1);
		Task13(vector1);
		Task14(vector1);
		Task15(vector2);
		Task16(vector2);
		Task17(vector2);
		size1 = Utiles.setVectorSizebyUser();
		size2 = Utiles.setVectorSizeRandom();
		SuperVector2D vector11 = new SuperVector2D(size1);
		SuperVector2D vector22 = new SuperVector2D(size2);
		vector11.copyVector2D(Utiles.createVector2DbyUser(size1), vector11);
		vector22.copyVector2D(Utiles.createVector2DRendom(size2), vector22);
		Task21(vector11);
		Task22(vector11);
		Task23(vector22);
		Task24(vector22);
		Task25(vector22);
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
		Veiw.OutBorder();
		Veiw.outputDoublevector(SortVector.insertionSort(Vector));
		Veiw.OutBorder();
		Veiw.outputDoublevector(SortVector.selectionSort(Vector));
		Veiw.OutBorder();
		Veiw.outputDoublevector(SortVector.quickSort(Vector, 0,Vector.size()-1));
	}
	public static void Task21(SuperVector2D vector){
		Veiw.OutputTheNumberOfTask(21);
		Veiw.OutputDouble(Vector2DCalculations.MaxValueArray2(vector));
		Veiw.OutputDouble(Vector2DCalculations.MinValueArray2(vector));
		Veiw.OutputDoublevector2D(vector);
	}
	public static void Task22(SuperVector2D vector){
		Veiw.OutputTheNumberOfTask(22);
		Veiw.OutputDouble(Vector2DCalculations.AverageArray2(vector));
		Veiw.OutputDouble(Vector2DCalculations.GeometricMeanArray2(vector));
	}
	public static void Task23(SuperVector2D vector){
		Veiw.OutputTheNumberOfTask(23);
		Veiw.OutputBoolean(Vector2DCalculations.SemetricArray2(vector));
	}
	public static void Task24(SuperVector2D vector){
		Veiw.OutputTheNumberOfTask(24);
		Veiw.OutputString(Vector2DCalculations.MaxLocalValueArray2(vector));
		Veiw.OutputString(Vector2DCalculations.MinLocalValueArray2(vector));
	}
	public static void Task25(SuperVector2D vector){
		Veiw.OutputTheNumberOfTask(25);
		Veiw.OutputDoublevector2D(vector);
		Veiw.OutBorder();
		Veiw.OutputDoublevector2D(Vector2DCalculations.transporation(vector));
		Veiw.Close();
	}
}