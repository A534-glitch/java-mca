
package Graphics;

public class Rectangle {   
    double length, breadth;

    
    public Rectangle(double len, double wid) {
        length = len;
        breadth = wid;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
Traingle.java
package Graphics;
public class Triangle {
    double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
Square.java
package Graphics;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}
Circle.java
package Graphics;
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
TestShapes.java
import Graphics.Rectangle;
import Graphics.Triangle;
import Graphics.Square;
import Graphics.Circle;

public class TestShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(4, 6);
        Square square = new Square(4);
        Circle circle = new Circle(3);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}





