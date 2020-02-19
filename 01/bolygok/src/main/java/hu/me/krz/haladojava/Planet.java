package hu.me.krz.haladojava;

public final class Planet {
	
	private final Point position;
	private final int radius;
	private final String name;
	
	public Planet(Point position, int radius, String name){
		this.position = position;
		this.radius = radius;
		this.name = name;
	}
	
	public Point getPos(){
		return this.position;
	}
	
	public int getRad(){
		return this.radius;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.position.toString() + ", " + this.radius + "\n";
	}
	
}
