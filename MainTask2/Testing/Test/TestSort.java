package Test;

import static org.junit.jupiter.api.Assertions.*;
import by.epam.java.maintask2.goodkevich.model.*;

import org.junit.jupiter.api.Test;

import by.epam.java.maintask2.goodkevich.enntity.Candy;
import by.epam.java.maintask2.goodkevich.enntity.NewYearGift;
import by.epam.java.maintask2.goodkevich.enntity.Sweet;
import by.epam.java.maintask2.goodkevich.model.Packer;

class TestSort {
	NewYearGift ny = new NewYearGift();
	NewYearGift ny1 = new NewYearGift();
	Sweet sweet = new Sweet(10.4, 2300, 0.5, "cheremushka", "milk", "none");
	Candy candy = new Candy(14.4, 2000, 1, "krabik", "strawbarry");
	
	@Test
	void sortByCostTest() {
		ny.addGoodies(sweet);
		ny.addGoodies(candy);		
		assertEquals(Packer.sortByCost(ny), ny);;
	}
	
	@Test
	void sortByCostTest1() {
		ny.addGoodies(sweet);
		ny1.addGoodies(candy);
		ny1.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.sortByCost(ny1).toString(), ny.toString());;
	}
	
	@Test
	void sortByCaloriesTest() {
		ny.addGoodies(candy);
		ny.addGoodies(sweet);
		assertEquals(Packer.sortByCalories(ny), ny);;
	}
	
	@Test
	void sortByCaloriesTest1() {
		ny.addGoodies(candy);
		ny.addGoodies(sweet);
		ny1.addGoodies(sweet);
		ny1.addGoodies(candy);
		assertEquals(Packer.sortByCalories(ny1).toString(), ny.toString());;
	}
	
	@Test
	void sortByWeightTest() {
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.sortByWeight(ny), ny);;
	}

	@Test
	void sortByWeightTest1() {
		ny.addGoodies(sweet);
		ny1.addGoodies(candy);
		ny1.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.sortByWeight(ny1).toString(), ny.toString());;
	}
	
}
