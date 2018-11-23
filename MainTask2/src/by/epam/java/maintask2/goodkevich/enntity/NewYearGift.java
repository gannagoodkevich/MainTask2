package by.epam.java.maintask2.goodkevich.enntity;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {
	private List<Goody> goodies;
	
	public NewYearGift() {
		goodies = new ArrayList<>();
	}
	
	public NewYearGift(List<Goody> goodies) {
		this.goodies = goodies;
	}
	
	public List<Goody> getListGoodies(){
		return goodies;
	}
	
	public Goody getGoody(int index) {
		return goodies.get(index);
	}
	
	public void setListGoodies(List<Goody> goodies) {
		this.goodies = goodies;
	}
	
	public void setGoody(int index, Goody gd) {
		this.goodies.set(index, gd);
		}
	
	public void addGoodies(Goody goody) {
		this.goodies.add(goody);
	}
	
	public int size() {
		return goodies.size();
	}
	
	public String toString() {
		String out = "All goodies:\n";
		for (Goody goody : this.getListGoodies()) {
			out += goody.toString() + "\n";
		}
		return out;
	}	
}
