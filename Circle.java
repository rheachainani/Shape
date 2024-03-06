package assignment_5;

public class Circle extends Shape {
	private double radius;
	
	// constructor
	Circle(double radius){
		this.radius = radius;
	}

	// override abstract methods
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}  
}