package by.epam.java.maintask2.goodkevich.model;

import by.epam.java.maintask2.goodkevich.enntity.Goody;
import by.epam.java.maintask2.goodkevich.enntity.NewYearGift;

public class ShopAssistant {

	public static double calcTotalCost(NewYearGift nyg) {
		double cost = 0;
		for (Goody goody : nyg.getListGoodies()) {
			cost += goody.getCost();
		}
		return cost;
	}

	public static double calcTotalCalories(NewYearGift nyg) {
		double calories = 0;
		for (Goody goody : nyg.getListGoodies()) {
			calories += goody.getCalories();
		}
		return calories;
	}

	public static double calcTotalWeight(NewYearGift nyg) {
		double weight = 0;
		for (Goody goody : nyg.getListGoodies()) {
			weight += goody.getWeight();
		}
		return weight;
	}

	public static Goody findGoodyMaxCost(NewYearGift nyg) {
		Goody goody = new Goody();
		double maxCost = 0;
		for (Goody gody : nyg.getListGoodies()) {
			if (maxCost < gody.getCost()) {
				maxCost = gody.getCost();
				goody = gody;
			}
		}
		return goody;
	}

	public static Goody findGoodyMaxCalories(NewYearGift nyg) {
		Goody goody = new Goody();
		double maxCost = 0;
		for (Goody gody : nyg.getListGoodies()) {
			if (maxCost < gody.getCalories()) {
				maxCost = gody.getCalories();
				goody = gody;
			}
		}
		return goody;
	}

	public static Goody findGoodyMaxWeight(NewYearGift nyg) {
		Goody goody = new Goody();
		double maxCost = 0;
		for (Goody gody : nyg.getListGoodies()) {
			if (maxCost < gody.getWeight()) {
				maxCost = gody.getWeight();
				goody = gody;
			}
		}
		return goody;
	}
	
	public static NewYearGift sortByWeight(NewYearGift nyg) {
		for (int i = 1; i < nyg.size(); i++) {
			for (int j = 0; j < nyg.size() - 1; j++) {
				if (nyg.getGoody(i).getWeight() < nyg.getGoody(j).getWeight()) {
					Goody buff = nyg.getGoody(i);
					nyg.setGoody(i, nyg.getGoody(j));
					nyg.setGoody(j, buff);
				}
			}
		}
		return nyg;
	}
	
	public static NewYearGift sortByCost(NewYearGift nyg) {
		for (int i = 1; i < nyg.size(); i++) {
			for (int j = 0; j < nyg.size() - 1; j++) {
				if (nyg.getGoody(i).getCost() < nyg.getGoody(j).getCost()) {
					Goody buff = nyg.getGoody(i);
					nyg.setGoody(i, nyg.getGoody(j));
					nyg.setGoody(j, buff);
				}
			}
		}
		return nyg;
	}
	
	public static NewYearGift sortByCalories(NewYearGift nyg) {
		for (int i = 1; i < nyg.size(); i++) {
			for (int j = 0; j < nyg.size() - 1; j++) {
				if (nyg.getGoody(i).getCalories() < nyg.getGoody(j).getCalories()) {
					Goody buff = nyg.getGoody(i);
					nyg.setGoody(i, nyg.getGoody(j));
					nyg.setGoody(j, buff);
				}
			}
		}
		return nyg;
	}
}
