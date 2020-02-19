package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato {

	private int puska;
	public Diak(String name, int age, int db) {
		super(name, age);
		this.puska = db;
	}
	
	public int getPuska() {
		return this.puska;
	}

	@Override
	public boolean joAlanyE() {
		if(this.puska <= 0) 
			 return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "Diák: "+ getName() + ", " + getAge() + ", puskái: " + getPuska() ;
	}

}
