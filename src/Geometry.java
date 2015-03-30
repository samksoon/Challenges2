
public class Geometry {

	public static double distance(Point2D first, Point2D second)
	{
		return Math.sqrt(
			(first.getX()-second.getX())*(first.getX()-second.getX())
		  + (first.getY()-second.getY())*(first.getY()-second.getY())
		);
	}
	
}
