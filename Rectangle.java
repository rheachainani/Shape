package assignment_5;

public class Rectangle extends Shape {
	private double length, width;
	
	// constructor
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	// override abstract methods
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}