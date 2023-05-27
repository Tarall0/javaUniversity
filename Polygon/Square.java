package Polygon;

public class Square extends Polygon{
	
	private int side;
	
	public Square(int x, int y, int side) {
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int area() {
		
		return side * side;
	}
	
	public int side() {
		return side;
	}

}
