

public class Triangle extends Figure {
	Point apexA;
	Point apexB;
	Point apexC;
	private Line sideAB;
	private Line sideAC;
	private Line sideBC;
	public Triangle(Point apexA, Point apexB, Point apexC, Line sideAB, Line sideAC, Line sideBC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		sideAB=new Line(apexA,apexB);
		sideAC=new Line(apexA,apexC);
		sideBC=new Line(apexB,apexC);
	}
	public Line getSideAB() {
		if(sideAB==null) sideAB=new Line(apexA,apexB);
		return sideAB;
	}
	public Line getSideAC() {
		if(sideAC==null) sideAC=new Line(apexA,apexC);
		return sideAC;
	}
	public Line getSideBC() {
		if(sideBC==null) sideBC=new Line(apexB,apexC);
		return sideBC;
	}
	
	
	
	

}
