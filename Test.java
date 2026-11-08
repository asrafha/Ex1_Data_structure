package point;

public class Test {
	
	
	public static boolean chekPoint (Array_Of_Points arr ,Point p) {
		for (int i = 0 ;i< arr.getCount();i++)
			if (p.equals(arr.getPoints()[i]))
				return true;
			
		return false;
	}

	public static void main(String[] args) {
		Array_Of_Points  a1 = new Array_Of_Points () ;
		Point p1 = new Point(5,6);
		Point p2 = new Point(6,7);
		Point p3 = new Point(7,8);
		Point p4 = new Point(5,6);
		Point p5 = new Point(9,5);
		
		a1.addPoint(p1) ;
		a1.addPoint(p2) ;
		a1.addPoint(p3) ;
		a1.addPoint(p4);
		
		System.out.println(a1);
		System.out.println(a1.count);
		
		a1.chek_Point_Ind(1);
		a1.chek_Point_Value(p4);
		
		System.out.println(a1);
		System.out.println(a1.count);
		
		System.out.println(chekPoint(a1 ,p1));
		
		
		
		

	}

}
