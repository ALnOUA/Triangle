import java.util.Arrays;


public class PolyPoints {
	private Point[] points;
	private int count;

	public PolyPoints(int n) {
		points = new Point[3];
		count = -1;
	}

	public PolyPoints() {
		points = new Point[3];
		count = -1;
	}

	public void add(Point p)  {
		if (count == points.length - 1) {
			points = Arrays.copyOf(points, points.length*2);
			// for (int i = 0; i < points.length; i++) {
			// temp[i]=points[i];
			// }
		}
		points[++count] = p;
	}

	public Point get(int i) {
		if (i < size())
			return points[i];
		else
			return null;
	}

	public void set(int i, Point p)  {
		if (i < size())
			points[i] = p;
		
	}

	public int size() {
		return count+1;
	}

	public void print() {
		for (int i = 0; i < size(); i++) {
			System.out.println(points[i]);
		}
	}
	public double getPerimetr(Point A, Point B,Point C) {
		
		return Math.sqrt((B.getX()-A.getX())*((B.getX()-A.getX()))+((B.getY()-A.getY())*(B.getY()-A.getY())));
		}
	public double getSquare(Point A, Point B,Point C) {
		
		return (Math.abs((A.getX()-C.getX()*(B.getY()-C.getY())-(B.getX()-C.getX())*(A.getY()-C.getY()))))/2;
		
	}
}
