
public class TestMain {

	public static void main(String[] args) {
		Point2D blah = new Point2D(1, 4);
		System.out.println(blah);
		Point2D other = new Point2D(4, 8);
		System.out.println(Geometry.distance(blah, other));
		blah.setX(15);
		blah.setY(10);
		System.out.println(blah);
		

	}

}
