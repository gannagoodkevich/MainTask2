package by.epam.java.maintask2.goodkevich.enntity;

public class Sweetmeat extends Goody{

	public Sweetmeat() {

	}

	public Sweetmeat(double cost, int calories, double weight, String name) {
		super(cost, calories, weight, name);
	}
	
	public Sweetmeat(Sweetmeat another) {
		this.setCost(another.getCost());
		this.setCalories(another.getCalories());
		this.setWeight(another.getWeight());
		this.setName(another.getName());
	}
	
	@Override
	public String toString() {
		return "Pastry[cost=" + getCost() + ";calories=" + getCalories() + ";weight=" + getWeight() + ";name="
				+ getName() +  "]";
	}

	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(getName());
		return heshcode;
	}

	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		if (obj == null || obj.getClass() != this.getClass() || !super.equals(obj)) {
			f = false;
		}
		return f;
	}
}
