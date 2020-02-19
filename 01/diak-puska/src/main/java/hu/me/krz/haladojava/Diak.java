package hu.me.krz.haladojava;

public class Diak extends Szemely implements Comparable<Diak>{
	
	private int puska;

	public Diak(String name, int age, int puska) {
		super(name, age);
		this.puska = puska;
	}

	@Override
	public int compareTo(Diak hasonlo) {
		if(this.puska < hasonlo.puska)
			return 1;
		else if(this.puska > hasonlo.puska)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Diák: "+ getName() + ", " + getAge() + ", puskái: " + this.puska;
	}

}
