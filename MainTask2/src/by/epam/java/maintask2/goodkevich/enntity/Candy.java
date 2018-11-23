package by.epam.java.maintask2.goodkevich.enntity;

public class Candy extends Sweetmeat{

	private String flavor;
	
	public Candy(){	
	}
	
	public Candy(double cost, int calories, double weight, String name, String flavor) {
		super(cost, calories, weight, name);
		this.flavor = flavor;
	}
	
	public Candy(Candy another) {
		this.setCost(another.getCost());
		this.setCalories(another.getCalories());
		this.setWeight(another.getWeight());
		this.setName(another.getName());
		this.flavor = another.flavor;
	}
	
	public void setFlavor(String flavor) {			
		this.flavor = flavor;
	}

	public String getFlavor() {
		return this.flavor;
	}
	
	@Override
	public String toString() {
		return "Candy[" + "cost=" + getCost() + "; calories=" + getCalories() + "; weight=" + getWeight() + "; name="
				+ getName() + "; flavor=" + getFlavor() + "]";
	}
	
	@Override
	public int hashCode() {
		int heshcode;
		heshcode = Integer.parseInt(this.getFlavor());
		return heshcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean f = true;
		Candy other =(Candy) obj;
		if(obj==null || obj.getClass()!=this.getClass() ||  !super.equals(obj)|| this.flavor != other.flavor) {
			f = false;
		}
		return f;
	}
}
