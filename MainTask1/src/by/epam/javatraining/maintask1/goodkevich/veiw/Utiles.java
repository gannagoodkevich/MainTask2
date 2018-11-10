//That methods are for initialization for vectors

package by.epam.javatraining.maintask1.goodkevich.veiw;

import java.util.Random;

import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperMatrix;
import by.epam.javatraining.maintask1.goodkevich.model.entity.SuperVector;
import by.epam.javatraining.maintask1.goodkevich.veiw.Veiw;

public class Utiles {
	public static SuperVector createVectorRendom(int size, int start, int finish) {
		Random rand = new Random();
		SuperVector Vector = new SuperVector(size);
		for (int i = 0; i < size; i++) {
			Vector.set(i, start + rand.nextDouble() * (finish - start));
		}
		return Vector;
	}

	public static SuperVector createVectorbyUser(int size) {
		SuperVector Vector = new SuperVector(size);
		for (int i = 0; i < size; i++) {
			Vector.set(i, Veiw.inputDouble());
		}
		return Vector;
	}

	public static SuperMatrix createVector2DRendom(int size, int start, int finish) {
		Random rand = new Random();
		SuperMatrix Vector = new SuperMatrix(size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Vector.set(i, j, start + rand.nextDouble() * (finish - start));
			}
		}
		return Vector;
	}

	public static SuperMatrix createVector2DbyUser(int size) {
		SuperMatrix Vector = new SuperMatrix(size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Vector.set(i, j, Veiw.inputDouble());
			}
		}
		return Vector;
	}

	public static int setVectorSizeRandom(int start, int finish) {
		Random rand = new Random();
		return start + rand.nextInt(finish - start + 1);
	}

	public static int setVectorSizebyUser() {
		int M;
		M = Veiw.inputInt();
		if (M <= 0) {
			throw new IllegalStateException();
		}
		return M;
	}
}
