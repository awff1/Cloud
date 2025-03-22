package model;


public class Line {
	public Point p1;
	public Point p2;

	public Line() {}


	public Line(Point p1arg, Point p2arg) {
		p1 = p1arg;
		p2 = p2arg;
	}

	public Line(double x1, double y1, double x2, double y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}
	public void stretch(double d) {
		p2.x = p2.x - p1.x;
	}
}