import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                Circle c = new Circle();
                c.getData();
                c.area();
                c.perimeter();
                break;

            case 2:
                Rectangle r = new Rectangle();
                r.getData();
                r.area();
                r.perimeter();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {

    double radius;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }

    public void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }

    public void perimeter() {
        double p = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle = " + p);
    }
}

class Rectangle implements Shape {

    double length, width;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextDouble();

        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }

    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle = " + a);
    }

    public void perimeter() {
        double p = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + p);
    }
}