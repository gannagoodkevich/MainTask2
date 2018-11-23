package by.epam.java.maintask2.goodkevich.enntity;

public class Pastry extends Goody {
	private String flower;

	public Pastry() {

	}

	public Pastry(double cost, int calories, double weight, String name) {
		super(cost, calories, weight, name);
	}
	
	public Pastry(String flower) {
		super();
		this.flower = flower;
	}
	
	public Pastry(Pastry another) {
		this.setCost(another.getCost());
		this.setCalories(another.getCalories());
		this.setWeight(another.getWeight());
		this.setName(another.getName());
		this.flower = another.flower;
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	@Override
	public String toString() {
		return "Pastry[cost=" + getCost() + ";calories=" + getCalories() + ";weight=" + getWeight() + ";name="
				+ getName() + ";flower" + flower + "]";
	}

	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(flower);
		return heshcode;
	}

	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		Pastry other = (Pastry) obj;
		if (obj == null || obj.getClass() != this.getClass() || !super.equals(obj)
				|| !this.flower.equals(other.flower)) {
			f = false;
		}
		return f;
	}

}
