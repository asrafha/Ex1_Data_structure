package point;

public class Point {
	
	private double x;
	
	private double y;
	
	public Point (double x ,double y) {
		this.x =x;
		this.y =y;
	}
	
	public Point (Point other) {
		this.x =other.x;
		this.y =other.y;
	}
	
	public double getX () {
		return this.x;
	}
	
	public double getY () {
		return this.y;
	}
	
	public void setX (double x) {
		this.x=x;
	}
	
	public void setY (double y) {
		this.y=y;
	}

	public String toString () {
		return "this x is" + this.x +" and this y is"+this.y;
	}
	
	public double distance (Point other) {
		
	double tx = this.x -other.x;
	double ty =this.y -other.y ;
	
	return Math.sqrt(tx*tx +ty*ty);
	}
	
	public boolean equals (Point other) {
		return this.x == other.x && this.y ==other.y;
	}
	
}
