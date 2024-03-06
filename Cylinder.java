package assignment_5;

public class Cylinder extends Shape implements Volume {
	private double radius;
    private double height;

    // constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // override abstract methods
    @Override
	public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
	public double calculatePerimeter() {
        return 0; // not applicable for a cylinder
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
