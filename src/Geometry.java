
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
	
}
