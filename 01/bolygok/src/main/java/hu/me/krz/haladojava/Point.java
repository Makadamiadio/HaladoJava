package hu.me.krz.haladojava;

public class Point {
	
	private long x;
	private long y;
	private long z;
	
	public Point(long x, long y, long z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public long getX(){
		return this.x;
	}
	public long getY(){
		return this.y;
	}
	public long getZ(){
		return this.z;
	}
	
	public Point translate(Point move){
		 move.x += this.x;
		 move.y += this.y;
		 move.z += this.z;
		
		return move;
	}
	
	@Override
	public String toString() {
		return "XYZ: "+this.x+", "+this.y+", "+this.z;
	}
	
}

