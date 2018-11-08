package by.epam.javatraining.maintask1.goodkevich.model;

import java.util.Random;

import by.epam.javatraining.maintask1.goodkevich.veiw.Veiw;

public class Utiles {
	public static SuperVector createVectorRendom(int size){
		Random rand = new Random();
		SuperVector Vector = new SuperVector(size);
		double start = 36;
		double finish = 100;
		for(int i=0; i< size; i++) {
			Vector.set(i, start + rand.nextDouble()*(finish - start));
		}
		return Vector;
	}
	
	public static SuperVector createVectorbyUser(int size){
		SuperVector Vector = new SuperVector(size);
		for(int i=0; i < size; i++) {
			Vector.set(i, Veiw.InputDouble());
		}
		return Vector;
	}
	
	public static SuperVector2D createVector2DRendom(int size) {
		Random rand = new Random();
		SuperVector2D Vector = new SuperVector2D(size);
		double start = 36;
		double finish = 100;
		for(int i=0; i< size; i++) {
			for(int j=0; j < size; j++) {
				Vector.set2D(i, j, start + rand.nextDouble()*(finish - start));
			}
		}
		return Vector;
	}
	
	public static SuperVector2D createVector2DbyUser(int size){
		SuperVector2D Vector = new SuperVector2D(size);
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				Vector.set2D(i, j, Veiw.InputDouble());
			}
		}
		return Vector;
	}
	
	public static int setVectorSizeRandom() {
		Random rand = new Random();
		int start = 1;
		int finish = 30;
		return start + rand.nextInt(finish - start + 1);
	}
	
	public static int setVectorSizebyUser() {
		int M;
		M = Veiw.InputInt();
		return M;
	}
}
