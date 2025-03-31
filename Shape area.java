
class ShapeArea {
    
    // Method to calculate area of a circle (pi * r^2)
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle (length * width)
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square (side * side)
    public double area(int side) {
        return side * side;
    }
    
    // Method to calculate area of a triangle (0.5 * base * height)
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        // Create an object of ShapeArea
        ShapeArea shape = new ShapeArea();
        
        // Calculate and print area of different shapes
        double circleArea = shape.area(5.0); // Circle with radius 5.0
        double rectangleArea = shape.area(10.0, 20.0); // Rectangle with length 10.0 and width 20.0
        double squareArea = shape.area(4); // Square with side length 4
        double triangleArea = shape.area(6.0, 8.0); // Triangle with base 6.0 and height 8.0

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
