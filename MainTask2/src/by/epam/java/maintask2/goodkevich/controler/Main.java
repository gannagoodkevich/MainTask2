package by.epam.java.maintask2.goodkevich.controler;

import java.io.File;
import java.io.IOException;

import by.epam.java.maintask2.goodkevich.enntity.NewYearGift;
import by.epam.java.maintask2.goodkevich.model.ShopAssistant;
import by.epam.java.maintask2.goodkevich.util.CreateUtil;
import by.epam.java.maintask2.goodkevich.view.View;

public class Main {

	public static void main(String obj[]) throws IOException {
		NewYearGift nyg = new NewYearGift();
		CreateUtil create = new CreateUtil();
		File file1 = new File("C:\\Users\\Андрей\\eclipse-workspace\\MainTask2\\bin\\test1.txt");
		nyg = create.createNYG(file1);
		View.outDouble(ShopAssistant.calcTotalCost(nyg));
		View.outString(nyg.toString());
		View.outString(ShopAssistant.findGoodyMaxCost(nyg).toString());
		View.outString(ShopAssistant.sortByWeight(nyg).toString());
		View.outString(ShopAssistant.sortByCost(nyg).toString());
		View.outString(ShopAssistant.sortByCalories(nyg).toString());
	}
}
