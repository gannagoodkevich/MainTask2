package by.epam.java.maintask2.goodkevich.enntity;

public class Sweet extends Sweetmeat {

	private String chocolate;
	private String filling;

	public Sweet() {
	}

	public Sweet(double cost, int calories, double weight, String name, String chocolate, String filling) {
		super(cost, calories, weight, name);
		this.chocolate = chocolate;
		this.filling = filling;
	}

	public void setChocolate(String chocolate) {
		this.chocolate = chocolate;
	}

	public Sweet(Sweet another) {
		this.setCost(another.getCost());
		this.setCalories(another.getCalories());
		this.setWeight(another.getWeight());
		this.setName(another.getName());
		this.chocolate = another.chocolate;
		this.filling = another.filling;
	}

	public String getChocolate() {
		return this.chocolate;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}

	public String getFilling() {
		return this.filling;
	}

	@Override
	public String toString() {
		return "Sweet[" + "cost=" + getCost() + "; calories=" + getCalories() + "; weight=" + getWeight() + "; name="
				+ getName() + "; chocolate=" + getChocolate() + "; filling=" + getFilling() + "]";
	}

	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(this.getFilling() + this.getChocolate());
		return heshcode;
	}

	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		Sweet other = (Sweet) obj;
		if (obj == null || obj.getClass() != this.getClass() || !super.equals(obj) || this.chocolate != other.chocolate
				|| this.filling != other.filling) {
			f = false;
		}
		return f;
	}

}
