package Test;

import static org.junit.jupiter.api.Assertions.*;
import by.epam.java.maintask2.goodkevich.model.*;

import org.junit.jupiter.api.Test;

import by.epam.java.maintask2.goodkevich.enntity.Candy;
import by.epam.java.maintask2.goodkevich.enntity.NewYearGift;
import by.epam.java.maintask2.goodkevich.enntity.Sweet;
import by.epam.java.maintask2.goodkevich.model.Packer;

class LogicTest {
	NewYearGift ny = new NewYearGift();
	Sweet sweet = new Sweet(10.4, 2300, 0.5, "cheremushka", "milk", "none");
	Candy candy = new Candy(14.4, 2000, 1, "krabik", "strawbarry");
	
	@Test
	void calcMaxCostTest() {
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.findGoodyMaxCost(ny), candy);;
	}
	
	@Test
	void calcMaxCaloriesTest() {
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.findGoodyMaxCalories(ny), sweet);
	}

	@Test
	void calcMaxWeightTest() {
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.findGoodyMaxWeight(ny), candy);
	}
	
	@Test
	void calcTotalWeightTest() {
		double max = 1.5;
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.calcTotalWeight(ny), max);
	}
	
	@Test
	void calcTotalCostTest() {
		double max = 24.8;
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.calcTotalCost(ny), max);
	}
	
	@Test
	void calcTotalCaloriesTest() {
		int max = 4300;
		ny.addGoodies(sweet);
		ny.addGoodies(candy);
		assertEquals(Packer.calcTotalCalories(ny), max);
	}
}
