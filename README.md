# Shape Calculator

The Shape Calculator is a Java program designed to calculate the area, perimeter, and volume of various geometric shapes. The program includes classes for Circle, Rectangle, Square, Sphere, Cylinder, and Pyramid, providing a versatile tool for mathematical computations related to these shapes.

## Files

1. **Shape.java**: Abstract class providing a framework for shape calculations.
2. **Volume.java**: Interface defining a method for volume calculation.
3. **Circle.java**: Class for calculating the area and perimeter of a circle.
4. **Rectangle.java**: Class for calculating the area and perimeter of a rectangle.
5. **Square.java**: Class for calculating the area and perimeter of a square.
6. **Sphere.java**: Class for calculating the surface area and volume of a sphere.
7. **Cylinder.java**: Class for calculating the surface area and volume of a cylinder.
8. **Pyramid.java**: Class for calculating the surface area and volume of a pyramid.
9. **Main.java**: Main program for user interaction and shape calculations.

## Usage

1. Run `Main.java`.
2. Select a shape from the menu.
3. Enter the required measurements.
4. View the calculated area, perimeter, and volume (if applicable).

## Code Overview

### Shape.java

- Abstract class with methods for displaying the selected shape - `showShape()` and abstract methods for area and perimeter calculation - `calculateArea()` and `calculatePerimeter()`.

### Volume.java

- Interface defining the `calculateVolume()` method for shapes that have a volume.

### Circle.java, Rectangle.java, Square.java, Sphere.java, Cylinder.java, Pyramid.java

- Concrete classes implementing specific shapes with methods to calculate area, perimeter, and volume (if applicable).

### Main.java

- Main program for user interaction.
- Displays a menu for shape selection and takes user input.
- Creates an instance of the selected shape class based on user input.
- Displays the calculated area, perimeter, and volume.

