package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato{
	
	private double avgn;

	public Tanar(String name, int age, double angryVideoGameNerd) {
		super(name, age);
		this.avgn = angryVideoGameNerd;
	}
	

	@Override
	public boolean joAlanyE() {
		if(getAge() < 30 && this.avgn > 4)
			return true;
		else
		return false;
	}

	@Override
	public String toString() {
		return "Tanár: "+ getName() + ", " + getAge() + ", markmyprofessor pont: " + this.avgn;
	}

}
