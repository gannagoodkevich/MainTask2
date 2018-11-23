package by.epam.java.maintask2.goodkevich.util;

import java.io.File;
import java.io.IOException;

import by.epam.java.maintask2.goodkevich.enntity.Candy;
import by.epam.java.maintask2.goodkevich.enntity.Gingerbread;
import by.epam.java.maintask2.goodkevich.enntity.Goody;
import by.epam.java.maintask2.goodkevich.enntity.Marshmallow;
import by.epam.java.maintask2.goodkevich.enntity.NewYearGift;
import by.epam.java.maintask2.goodkevich.enntity.Sweet;

public class CreateUtil {

	private String[] parserbyLines(String str) {
		String delimeter = "\n";
		String[] subStr;
		subStr = str.split(delimeter);
		return subStr;
	}

	private String[] parserbyWords(String str) {
		String delimeter = " ";
		String[] subStr;
		subStr = str.split(delimeter);
		return subStr;
	}

	private Goody createGoody(String[] subStr) {
		if (subStr[subStr.length - 1].equals("S")) {
			Sweet goody = new Sweet(Double.parseDouble(subStr[0]), Integer.parseInt(subStr[1]),
					Double.parseDouble(subStr[2]), subStr[3], subStr[4], subStr[5]);
			return goody;
		}
		if (subStr[subStr.length - 1].equals("C")) {
			Candy goody = new Candy(Double.parseDouble(subStr[0]), Integer.parseInt(subStr[1]),
					Double.parseDouble(subStr[2]), subStr[3], subStr[4]);
			return goody;
		}
		if (subStr[subStr.length - 1].equals("G")) {
			Gingerbread goody = new Gingerbread(Double.parseDouble(subStr[0]), Integer.parseInt(subStr[1]),
					Double.parseDouble(subStr[2]), subStr[3], subStr[4]);
			return goody;
		}
		if (subStr[subStr.length - 1].equals("M")) {
			Marshmallow goody = new Marshmallow(Double.parseDouble(subStr[0]), Integer.parseInt(subStr[1]),
					Double.parseDouble(subStr[2]), subStr[3], subStr[4]);
			return goody;
		}
		Goody g = new Goody();
		return g;
	}

	public NewYearGift createNYG(File file1) throws IOException {
		NewYearGift nyg = new NewYearGift();
		// for (int i = Reader.reader(file1).size() - 1; i >=0; i--) {
		// String[] str = parser(Reader.reader(file1).get(i));
		// nyg.addGoodies(createGoody(str));
		// }
		String str = Reader.reader(file1);
		for (int i = parserbyLines(str).length - 1; i >=0; i--) {
			String str1[] = parserbyWords(parserbyLines(str)[i]);
			nyg.addGoodies(createGoody(str1));
		}
		return nyg;
	}
}
