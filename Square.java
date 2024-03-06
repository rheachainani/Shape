package assignment_5;

public class Square extends Shape {
	private double side;
	
	// constructor
	Square(double side){
		this.side = side;
	}
	
	// override abstract methods
	@Override
	public double calculateArea() {
		return side * side;
	}

	@Override
	public double calculatePerimeter() {
		return 4 * side; 
	}
} 