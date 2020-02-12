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
	
	public Point translate(Point point, Point move){
		point.x += move.x;
		point.y += move.y;
		point.z += move.z;
		
		return point;
	}
	
}

