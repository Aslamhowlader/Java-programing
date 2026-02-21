abstract class Shape1 {
    abstract double area(); // abstract method returns double
}

// Circle subclass
class Circle extends Shape1 {
    private double r;

    // Constructor to set radius
    Circle(double r) {
      this.r = r;
    }


    double area() {
        return 3.14 * r * r;
    }
}

// Rectangle subclass
class Rectangle extends Shape1 {
    private double w, h;

    // Constructor to set width and height
    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }


    double area() {
        return w * h;
    }
}

// Main class
public class Shape {
    public static void main(String[] args) {

        Shape1 ob;

        // Rectangle example
        Rectangle ob1 = new Rectangle(4, 6);
        ob = ob1;
        System.out.println("Rectangle Area: " + ob.area());

        // Circle example
        Circle c = new Circle(5);
        ob = c;
        System.out.println("Circle Area: " + ob.area());
    }
}