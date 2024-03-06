package assignment_5;
public abstract class Shape {
	// non-abstract method
	public void showShape(String shape) { 
	    System.out.println("Selected shape: " + shape);
	}
	// abstract methods
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
} 