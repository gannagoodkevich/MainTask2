package by.epam.java.maintask2.goodkevich.enntity;

public class Gingerbread extends Pastry {

	private String form;

	public Gingerbread() {
	}

	public Gingerbread(double cost, int calories, double weight, String name, String form) {
		super(cost, calories, weight, name);
		this.form = form;
	}
	
	public Gingerbread(Gingerbread another) {
		this.setCost(another.getCost());
		this.setCalories(another.getCalories());
		this.setWeight(another.getWeight());
		this.setName(another.getName());
		this.form = another.form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getForm() {
		return this.form;
	}

	@Override
	public String toString() {
		return "GingerBread[" + "cost=" + getCost() + "; calories=" + getCalories() + "; weight=" + getWeight()
				+ "; name=" + getName() + "; flavor=" + getForm() + "]";
	}
	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(this.getForm());
		return heshcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		Gingerbread other = (Gingerbread) obj;
		if(obj==null || obj.getClass()!=this.getClass() ||  !super.equals(obj)|| this.form != other.form) {
			f = false;
		}
		return f;
	}
}
