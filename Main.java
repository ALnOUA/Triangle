

public class Main {

	public static void main(String[] args) {
		PolyPoints poly = new PolyPoints();
		poly.add(new Point(1,5));
		poly.add(new Point(2,5));
		poly.add(new Point(3,5));
		Point A = new Point(2,3);
		Point B = new Point(2,1);
		Point C = new Point(5,2);
		System.out.println(poly.getSquare(A, B, C));
		System.out.println(poly.getPerimetr(A, B, C));
	}

}
