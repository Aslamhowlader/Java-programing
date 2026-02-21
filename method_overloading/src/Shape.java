/*1️⃣ Area of Shapes: Create a class AreaCalculator that calculates the area of three types of shapes.
For a Circle, take radius; for a Rectangle, take length and width; and for a Triangle,
 take base and height. Use the same method name area() with different parameters for each shape.
 */


class AreaCalculation{
    double area(double radius)
    {
        return 3.14*radius*radius;
    }

    double area(double length,double width)
    {
        return length*width;
    }

    double area(double base,int height)
    {
        return 0.5*base*height;
    }
}



public  class Shape {
    static void main(String[] args) {
        AreaCalculation ob = new AreaCalculation();

        double Circle =ob.area(2);
        double Rectangle=ob.area(3,4.5);
        double Triangle =ob.area(5,6);
        System.out.println("Circle : "+Circle);
        System.out.println("Rectangle: "+Rectangle);
        System.out.println("Triangle: "+Triangle);
    }
}