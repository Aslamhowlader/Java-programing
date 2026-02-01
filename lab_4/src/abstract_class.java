
/*4. Design a class hierarchy for shapes. Create an abstract class Shape with a method draw().
Create subclasses Circle and Rectangle that override draw(). Write a program to call draw() on a
Shape reference pointing to different objects.
 */


abstract  class Shape{
   abstract void draw();
}
class Circle extends Shape{
     void  draw()
    {
        System.out.println("class Circle");
    }
}
class Rectangle extends Shape{
    void  draw()
    {
        System.out.println("class  Rectangle ");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Shape ob;
        Rectangle ob1 =new Rectangle();
        ob=ob1;
        ob.draw();
        Circle ob2 =new Circle();
        ob=ob2;
        ob.draw();
    }
}
