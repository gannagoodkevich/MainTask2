package by.epam.javatraining.maintask1.goodkevich.model;

public class Vector2DCalculations {
	public static double MaxValueArray2(SuperVector2D Vector) {
		double Max = Vector.get2D(0, 0);
		for(int i=0; i < Vector.size2D(); i++) {
			for(int j=0; j < Vector.size2D(); j++) {
				if(Max < Vector.get2D(i, j)) {
					Max = Vector.get2D(i, j);
				}
			}
		}
		return Max;
	}
	
	public static double MinValueArray2(SuperVector2D Vector) {
		double Min = Vector.get2D(0, 0);
		for(int i=0; i < Vector.size2D(); i++) {
			for(int j=0; j < Vector.size2D(); j++) {
				if(Min > Vector.get2D(i, j)) {
					Min = Vector.get2D(i, j);
				}
			}
		}
		return Min;
	}
	
	public static double AverageArray2(SuperVector2D Vector) {
		double  Av=0;
		int amount=0;
		for(int i=0; i < Vector.size2D(); i++) {
			for(int j=0; j < Vector.size2D(); j++) {
				Av += Vector.get2D(i, j);
				amount++;
			}
		}
		Av /= amount;
		return Av;
	}
	
	public static double GeometricMeanArray2(SuperVector2D Vector) {
		double  GM=1;
		for(int i=0; i < Vector.size2D(); i++) {
			for(int j=0; j < Vector.size2D(); j++) {
				GM*= Vector.get2D(i, j);
			}
		}
		GM = Math.sqrt(GM);
		return GM;
	}
	
	public static boolean SemetricArray2(SuperVector2D Vector) {
		boolean f = true;
		for(int i = 1; i <  Vector.size2D(); i++) {
			for(int j = 0; j < Vector.size2D() - 1; j++ ) {
				if(Vector.get2D(i, j) != Vector.get2D(j, i)) {
					f = false;
				}
			}
		}
		return f;
	}
	
	public static String MinLocalValueArray2(SuperVector2D Vector) {
		String pos = "null";
		if(Vector.size2D() >= 3) {
			for(int i=1; i < Vector.size2D()-1; i++) {
				for(int j=1; j < Vector.size2D()-1; j++) {
					pos = posMin2D(Vector, i, j);
				}
			}
		}
		return pos;
	}
	
	public static String posMin2D(SuperVector2D Vector, int i, int j) {
		String str1 = "null", str2 = "null";
		if(Vector.get2D(i, j) < Vector.get2D(i+1, j) 
		  && Vector.get2D(i, j) < Vector.get2D(i-1, j) 
		  && Vector.get2D(i, j) < Vector.get2D(i, j-1) 
		  && Vector.get2D(i, j) < Vector.get2D(i, j+1)) {
					str1 = Integer.toString(i);
					str2 = Integer.toString(j);
		}
		return str1 + " " + str2;
	}
	
	public static String MaxLocalValueArray2(SuperVector2D Vector) {
		String pos = "null";
		if(Vector.size2D() >= 3) {
			for(int i = 1; i < Vector.size2D()-1; i++) {
				for(int j = 1; j < Vector.size2D()-1; j++) {
					pos = posMax2D(Vector, i, j);
				}
			}
		}
		return pos;
	}
	
	public static String posMax2D(SuperVector2D Vector, int i, int j) {
		String str1 = "null", str2 = "null";
		if(Vector.get2D(i, j) > Vector.get2D(i+1, j) 
		  && Vector.get2D(i, j) > Vector.get2D(i-1, j) 
		  && Vector.get2D(i, j) > Vector.get2D(i, j-1) 
		  && Vector.get2D(i, j) > Vector.get2D(i, j+1)) {
					str1 = Integer.toString(i);
					str2 = Integer.toString(j);
		}
		return str1 + " " + str2;
	}
	
	public static SuperVector2D transporation(SuperVector2D Vector)	{
		for(int i = 1; i <  Vector.size2D(); i++) {
			for(int j = 0; j < Vector.size2D()-1; j++ ) {
				double buff = Vector.get2D(i, j);
				Vector.set2D(i, j, Vector.get2D(j, i));
				Vector.set2D(j, i, buff);	
			}
		}
		return Vector;
	}
}
