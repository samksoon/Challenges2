
public class TestMain {

	public static void main(String[] args) {
		Point2D blah = new Point2D(1, 4);
		Point2D other = new Point2D(4, 8);
		Point2D gah = new Point2D(1, 4);
		Point2D meep = new Point2D(3, 5);
		System.out.println(blah);
		System.out.println(Geometry.distance(blah, other));
		System.out.println(blah);
		System.out.println(Geometry.Midpoint(blah, other));
		LineSegment lol = new LineSegment();
		LineSegment rofl = new LineSegment();
		lol.getPoints(blah, other);
		rofl.getPoints(gah, meep);
		System.out.println(lol.getLength());
		System.out.println(lol.Midpoint());
		System.out.println(lol.Slope());
		System.out.println(Geometry.Intersect(lol, rofl));

	}

}
