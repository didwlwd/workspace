package z.practice_point_ex1;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {//사각형 넓이
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.toString() + " / " + (height*width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {//사각형 둘레
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.toString() + " / " + 2*(height*width);
	}
}
