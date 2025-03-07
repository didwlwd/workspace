package z.practice_point_ex1;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {//원 넓이
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		c = new Circle(x,y,radius);
		return c.toString() + " / " + (double)(radius * radius * Math.PI);
	}
	
	public String calcCricum(int x, int y, int radius) {//원 둘레
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		c = new Circle(x,y,radius);
		return c.toString() + " / " + (double)(2.0 * radius * Math.PI);
	}
}
