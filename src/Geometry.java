
public class Geometry {

	public static double distance(Point2D first, Point2D second)
	{
		return Math.sqrt(
			(first.getX()-second.getX())*(first.getX()-second.getX())
		  + (first.getY()-second.getY())*(first.getY()-second.getY())
		);
	}
	
	public static String Midpoint(Point2D first, Point2D second){
		
		return ((first.getX()/2 + second.getX()/2)) + ", " + ((first.getY()/2 + second.getY()/2));
	}
	
public static boolean checkSlope(LineSegment x, Point2D y){
		boolean check;
		double rise1 = x.getFirst().getY()-y.getY();
		double rise2 = x.getFirst().getY() - x.getSecond().getY();
		double run1 = x.getFirst().getX()-y.getX();
		double run2 = x.getFirst().getX()-x.getSecond().getX();
		
		double slope1 = rise1/run1;
		double slope2 = rise2/run2;
		if(slope1 == slope2 || rise1 == 0 && rise2 == 0){
			check = true;
		}
		else{
			
			check = false;
		}
		
		return check;
		
	}
	
	public static boolean Intersect(LineSegment one, LineSegment two){
		boolean cross;
		double x1 = one.getFirst().getX();
		double y1 = one.getFirst().getY();
		
		double x2 = one.getSecond().getX();
		double y2 = one.getSecond().getY();
		
		double x3 = two.getFirst().getX();
		double y3 = two.getFirst().getY();
		
		double x4 = two.getSecond().getX();
		double y4 = two.getSecond().getY();
		
		double avgx = (x1 + x2 + x3 + x4)/4;
		double avgy = (y1 + y2 + y3 + y4)/4;
		
		Point2D avg = new Point2D(avgx, avgy);
		if(checkSlope(one, avg) == true ){
			cross = true;
		}
		else{
			cross = false;
		}
		
		if(one.getFirst() == two.getFirst() 
				|| one.getSecond() == two.getSecond() 
				|| one.getFirst() == two.getSecond() 
				|| one.getSecond() == two.getFirst() 
				)
		{
			cross = true;
		}
		return cross;
				
	}
	
	public static Point2D getIntersect(LineSegment one, LineSegment two){
		boolean cross;
		double x1 = one.getFirst().getX();
		double y1 = one.getFirst().getY();
		
		double x2 = one.getSecond().getX();
		double y2 = one.getSecond().getY();
		
		double x3 = two.getFirst().getX();
		double y3 = two.getFirst().getY();
		
		double x4 = two.getSecond().getX();
		double y4 = two.getSecond().getY();
		
		double avgx = (x1 + x2 + x3 + x4)/4;
		double avgy = (y1 + y2 + y3 + y4)/4;
		
		Point2D avg = new Point2D(avgx, avgy);
		if(checkSlope(one, avg) == true ){
			cross = true;
		}
		else{
			cross = false;
		}
		if(cross == false){
			avg = null;
		}
		
		return avg;
				
	}
	
}
