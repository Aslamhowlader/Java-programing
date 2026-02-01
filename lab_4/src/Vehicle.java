
/*You are designing a system where different types of vehicles have their own way of starting.
Create a parent class Vehicle with a method start(). Create subclasses Car and Bike that override
the start() method. Write a program to demonstrate dynamic method dispatch when calling start()
using a Vehicle reference.
*/

class vehicle1{
    void Start(){
        System.out.println("Class vehicle1 ");
    }
}
class Car extends vehicle1{

    void Start(){
        System.out.println("Class Car ");
    }
}
class Bike extends vehicle1{
    void Start(){
        System.out.println("Class Bike ");
    }
}


public class Vehicle {
    public static void main(String[] args) {
          vehicle1 ob;
          Bike ob1=new Bike();
          ob=ob1;
          ob1.Start();
          Car ob2 =new Car();
          ob=ob2;
          ob.Start();
    }

}