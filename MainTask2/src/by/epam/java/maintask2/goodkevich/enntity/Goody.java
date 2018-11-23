package by.epam.java.maintask2.goodkevich.enntity;

public class Goody {
	private double cost;
	private int calories;
	private double weight;
	private String name;

	public Goody() {
	}

	public Goody(double cost, int calories, double weight, String name) {
		this.cost = cost;
		this.calories = calories;
		this.weight = weight;
		this.name = name;
	}
	
	public Goody(Goody another) {
		this.calories = another.calories;
		this.cost = another.cost;
		this.weight = another.weight;
		this.name = another.name; // question!!
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return this.cost;
	}

	public int getCalories() {
		return this.calories;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Goody[cost=" + cost + ";calories=" + calories + ";weight=" + weight + ";name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(name);
		return heshcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		Goody other = (Goody) obj;
		if (obj == null || obj.getClass() != this.getClass() || this.calories != other.calories
				|| this.cost != other.cost || !this.name.equals(other.name) || this.weight != other.weight) {
			f = false;
		}
		return f;
	}
}
