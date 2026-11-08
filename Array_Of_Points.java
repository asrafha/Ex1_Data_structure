package point;

public class Array_Of_Points {
	
	
	Point [] points;
	int count ;
	final int MAX =100;
	
	public Array_Of_Points () {
		this.count=0;
		this.points = new Point [MAX];
	}
	
	public Array_Of_Points (Array_Of_Points other) {
		this.count=other.count;
		this.points =new Points (MAX) ;
		for (int i= 0 ;i< count ;i++)
			this.Point[i]=new Point(other.points[i])
	}
	

   
	public boolean addPoint (Point one) {
		if (count < points.length) {
			points[count]=one ;
			count++;
			return true;
		}
		return false;
	}
	
	public int getCount () {
		return this.count;
	}
	
	public int getMax () {
		return this.MAX;
	}
	public Point[] getPoints () {
		return this.points;
	}
	
	public String toString () {
		String result = "";
		for (int i=0 ;i<count ;i++)
			result+= points[i].toString() + "\n";
		return result;
	}
	
	public void chek_Point_Ind (int num) {
		if (points[num] != null) {
			points[num]=null ;
		for (int i = num ;i<count-1 ;i++) 
			points[i]= points[i+1];
		points[count-1]=null;
		count--;
		}else
			return;
	}
	
	public void chek_Point_Value (Point one) {
		for (int i =0 ;i < count ;i++) {
			if (points[i].getY() == one.getY() && points[i].getX() == one.getX()) {
				chek_Point_Ind (i);
				i--;
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
