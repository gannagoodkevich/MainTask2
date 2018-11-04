package by.epam.javatraining.maintask1.goodkevich.model;

public class VectorCalculations {
	public static double maxValueArray(SuperVector Vector) {
		double Max = Vector.get(0);
		for(int i=1; i < Vector.size(); i++) {
			if(Vector.get(i) > Max) {
				Max = Vector.get(i);
			}
		}
		return Max;
	}
	public static double minValueArray(SuperVector Vector) {
		double Min = Vector.get(0);
		for(int i=1; i < Vector.size(); i++) {
			if(Vector.get(i) < Min) {
				Min = Vector.get(i);
			}
		}
		return Min;
	}
	public static double average(SuperVector Vector) {
		double  Av=0;
		for(int i=0; i < Vector.size(); i++) {
			Av += Vector.get(i);
		}
		Av /= Vector.size();
		return Av;
	}
	public static double geometricMean(SuperVector Vector) {
		double GM=1;
		for(int i=0; i < Vector.size(); i++) {
			GM *= Vector.get(i);
		}
		GM = Math.sqrt(GM);
		return GM;
	}
	public static boolean sortCheckHigher(SuperVector Vector) {
		boolean f = true;
		for(int i=0; i < Vector.size()-1; i++) {
			if(Vector.get(i) > Vector.get(i+1)) {
				f = false;
			}
		}
		return f;
	}
	public static boolean sortCheckLower(SuperVector Vector) {
		boolean f = true;
		for(int i=0; i < Vector.size()-1; i++) {
			if(Vector.get(i) < Vector.get(i+1)) {
				f = false;
			}
		}
		return f;
	}
	public static int localMin(SuperVector Vector) {
		int pos = -1;
		if(Vector.size() !=1 || Vector.size() !=2) {
			for(int i=1; i < Vector.size() -1; i++) {
				if(Vector.get(i) < Vector.get(i+1) && Vector.get(i)< Vector.get(i-1)) {
					pos = i;
				}
			}
		}
		return pos;
	}
	public static int localMax(SuperVector Vector) {
		int pos = -1;
		if(Vector.size() !=1 || Vector.size() !=2) {
				for(int i=1; i < Vector.size()-1; i++) {
					if(Vector.get(i) > Vector.get(i+1) && Vector.get(i) > Vector.get(i-1)) {
						pos = i;
					}
				}
		}
		return pos;
	}
	public static boolean linearSearch(SuperVector Vector, double element) {
		boolean f = false;
		for(int i=0; i < Vector.size(); i++) {
			if(Vector.get(i)==element) {
				f = true;
			}
		}
		return f;
	}
	public static boolean binorySearch(SuperVector Vector, double element) {
		SuperVector Vector1 = new SuperVector(Vector.size());
		Vector.copyVector(SortVector.bubbleSort(Vector), Vector1);
		boolean f = false;
		if (Vector != null) {
			int low = 0, high = Vector.size(), mid;
			while (low < high) {
				mid = ((low + high) >>> 1); 
				if (element == Vector.get(mid)) {
					f = true;
					break;
				} else {
					if (element <= Vector.get(mid)) {
						high = mid;
					} else {
						low = mid + 1;
					}
				}
			}
		}
		return f;
	}
	public static SuperVector reversArray(SuperVector Vector) {
		for(int i = 0; i < Vector.size()/2; i++) {
			Vector.set(i,  Vector.get(i) + Vector.get(Vector.size() - i -1));
			Vector.set(Vector.size() - i -1, Vector.get(i) - Vector.get(Vector.size() - i -1));
			Vector.set(i, Vector.get(i) - Vector.get(Vector.size() - i -1));
		}
		return Vector;
	}
	
	public static double MaxValueArray2(double Array2[][]) {
		double Max = Array2[0][0];
		for(int i=0; i< Array2.length; i++) {
			for(int j=0; j<Array2[i].length; j++) {
				if(Max < Array2[i][j]) {
					Max = Array2[i][j];
				}
			}
		}
		return Max;
	}
	
	public static double MinValueArray2(double Array2[][]) {
		double Min = Array2[0][0];
		for(int i=0; i< Array2.length; i++) {
			for(int j=0; j<Array2[i].length; j++) {
				if(Min > Array2[i][j]) {
					Min = Array2[i][j];
				}
			}
		}
		return Min;
	}
	
	public static double AverageArray2(double Array2[][]) {
		double  Av=0;
		int amount=0;
		for(int i=0; i < Array2.length; i++) {
			for(int j=0; j<Array2[i].length; j++) {
				Av += Array2[i][j];
				amount++;
			}
		}
		Av /= amount;
		return Av;
	}
	public static double GeometricMeanArray2(double Array2[][]) {
		double  GM=1;
		for(int i=0; i < Array2.length; i++) {
			for(int j=0; j<Array2[i].length; j++) {
				GM*= Array2[i][j];
			}
		}
		GM = Math.sqrt(GM);
		return GM;
	}
	public static boolean SemetricArray2(double Array2[][]) {
		boolean f = true;
		for(int i=1; i<Array2.length; i++) {
			for(int j = 0; j<i-1; j++ ) {
				if(Array2[i][j] != Array2[j][i]) {
					f = false;
				}
			}
		}
		return f;
	}
}