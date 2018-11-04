package by.epam.javatraining.maintask1.goodkevich.model;

public class SortVector {

	public static SuperVector bubbleSort(SuperVector Vector) {
		for(int i=1; i< Vector.size(); i++) {
			for(int j=0; j < Vector.size()-1; j++) {
				if(Vector.get(i) < Vector.get(j)) {
					Vector.set(i,  Vector.get(i) + Vector.get(j));
					Vector.set(j, Vector.get(i) - Vector.get(j));
					Vector.set(i, Vector.get(i) - Vector.get(j));
					}
			}
		}
		return Vector;
	}
	
	public static SuperVector insertionSort(SuperVector Vector) {
		double y; 
		int j;
		for(int i =1; i < Vector.size(); i++) {
			y = Vector.get(i);
			j = i-1;
			while(j>=0 && y < Vector.get(j)) {
				Vector.set(j+1, Vector.get(j));
				j--;
			}
			Vector.set(j+1, y);
		}
		return Vector;
	}
	
	public static SuperVector selectionSort(SuperVector Vector) {
		int min;
		double buff;
		for(int i=0; i < Vector.size()-1; i++) {
			min=i;
			for(int j = i+1; j<Vector.size(); j++) { 
				if(Vector.get(min) > Vector.get(j)){
					min=j;
				}
			}
			 buff =  Vector.get(i);
			 Vector.set(i, Vector.get(min));
			 Vector.set(min, buff);
			min = i;
		}
		return Vector;
	}
	
	public static SuperVector quickSort(SuperVector Vector, int left, int right) {
		int i = left;
	    int j = right;
	    double key = Vector.get(left+(right-left)/2);
	      do {
	         while( Vector.get(i) < key){
	        	 i++;
	         }
	         while(Vector.get(j)> key){
	        	 --j;
	         }
	         if(i <= j){
	         
	        	 double temp =  Vector.get(i);
				 Vector.set(i, Vector.get(j));
				 Vector.set(j, temp);
	            i ++ ; 
	            j --;
	         }
	      } while(i <= j);
	      if (left < j){
	    	  Vector = quickSort(Vector, left, j);
	      }
	      if (i < right) {
	    	  Vector = quickSort(Vector, i, right);
	      }
		return Vector;
	}
	
}
