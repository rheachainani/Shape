/*
 * Name: Rhea Chainani
 * PRN: 22070126086
 * Batch: AIML-B1
*/
package assignment_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate area, perimeter, and volume (if applicable):");
        System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Pyramid");

        int choice = scanner.nextInt();
        Shape selectedShape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                selectedShape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                selectedShape = new Rectangle(length, width);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                selectedShape = new Square(side);
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                selectedShape = new Sphere(sphereRadius);
                break;
            case 5:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                selectedShape = new Cylinder(cylinderRadius, cylinderHeight);
                break;
            case 6:
                System.out.print("Enter the length of the pyramid's base: ");
                double pyramidBaseLength = scanner.nextDouble();
                System.out.print("Enter the width of the pyramid's base: ");
                double pyramidBaseWidth = scanner.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double pyramidHeight = scanner.nextDouble();
                selectedShape = new Pyramid(pyramidBaseLength, pyramidBaseWidth, pyramidHeight);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        scanner.close();

        if (selectedShape != null) {
            System.out.println("Area: " + selectedShape.calculateArea());
            
            if (selectedShape instanceof Volume) {
                Volume volumeShape = (Volume) selectedShape;
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
            else {
            	System.out.println("Perimeter: " + selectedShape.calculatePerimeter());
            }
        }
    }
}