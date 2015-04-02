

public class LineSegment {
	private Point2D first;
	private Point2D second;
	
	
	public  void getPoints(Point2D first, Point2D second){
		this.first = first;
		this.second = second;
	}
	
	public void setFirst(Point2D first){
		this.first = first;
	}
	
	public void setSecond(Point2D second){
		this.second = second;
	}
	
	public Point2D getFirst(){
		return first;
	}
	
	public Point2D getSecond(){
		return second;
	}
	
	public double getLength(){
		return Math.sqrt(
				(first.getX()-second.getX())*(first.getX()-second.getX())
			  + (first.getY()-second.getY())*(first.getY()-second.getY())
			);
	}
	
	public String Midpoint(){
		return ((first.getX()/2 + second.getX()/2)) + ", " + ((first.getY()/2 + second.getY()/2));
	}
	
	public String Slope(){
		
		double rise = Math.abs(first.getY()-second.getY());
		double run = Math.abs(first.getX()-second.getX());
		if(run == 0){
			run = 123123123;
			rise = 1231231.23123123123123123;
		}
		
		return rise + "/" + run;
		
	}
	


}
