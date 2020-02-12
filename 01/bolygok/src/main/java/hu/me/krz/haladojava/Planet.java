package hu.me.krz.haladojava;

public final class Planet {
	
	private final long position;
	private final int radius;
	private final String name;
	
	public Planet(long position, int radius, String name){
		this.position = position;
		this.radius = radius;
		this.name = name;
	}
	
	public long getPos(){
		return this.position;
	}
	
	public int getRad(){
		return this.radius;
	}
	
	public String getName(){
		return this.name;
	}
	
}
