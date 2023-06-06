package GeneralJavaClasses;

public class MathsPolygon {
	
	double weight;
	double height;
	
	
	public MathsPolygon(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public MathsPolygon(double weight) {
		this.weight = weight;
	}
	
	public double rectangle_area(double weight, double height) {
		return weight * height;
	}
	
	public double square_area(double side) {
		return side * side;
	}
	

}

