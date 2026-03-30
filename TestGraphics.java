import Graphics.*;
import java.util.Scanner;

public class TestGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length and width of rectangle: ");
        double rectLength = sc.nextDouble();
        double rectWidth = sc.nextDouble();
        Graphics.Shape rectangle = new Graphics.Rectangle(rectLength, rectWidth);
        System.out.println("Rectangle area: " + rectangle.area());

        // Triangle
        System.out.print("Enter base and height of triangle: ");
        double triBase = sc.nextDouble();
        double triHeight = sc.nextDouble();
        Graphics.Shape triangle = new Graphics.Triangle(triBase, triHeight);
        System.out.println("Triangle area: " + triangle.area());

        // Square
        System.out.print("Enter side of square: ");
        double squareSide = sc.nextDouble();
        Graphics.Shape square = new Graphics.Square(squareSide);
        System.out.println("Square area: " + square.area());

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Graphics.Shape circle = new Graphics.Circle(radius);
        System.out.println("Circle area: " + circle.area());

        sc.close();
    }
}