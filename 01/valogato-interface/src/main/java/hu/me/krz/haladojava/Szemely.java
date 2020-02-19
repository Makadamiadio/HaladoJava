package hu.me.krz.haladojava;

public abstract class Szemely {

	private String name;
	private int age;
	
	public Szemely(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Személy: "+ getName() + ", " + getAge();
	}
	
	
}
