package by.epam.java.maintask2.goodkevich.enntity;

public class Marshmallow extends Sweetmeat {

	private String color;

	public Marshmallow() {

	}

	public Marshmallow(double cost, int calories, double weight, String name, String color) {
		super(cost, calories, weight, name);
		this.color = color;
	}

	public Marshmallow(Marshmallow another) {
			this.setCost(another.getCost());
			this.setCalories(another.getCalories());
			this.setWeight(another.getWeight());
			this.setName(another.getName());
			this.color = another.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Candy[" + "cost=" + getCost() + "; calories=" + getCalories() + "; weight=" + getWeight() + "; name="
				+ getName() + "; color=" + getColor() + "]";
	}

	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(this.getColor());
		return heshcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		Marshmallow other = (Marshmallow) obj;
		if(obj==null || obj.getClass()!=this.getClass() ||  !super.equals(obj)|| this.color != other.color) {
			f = false;
		}
		return f;
	}
}
