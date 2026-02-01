
/* Suppose you are creating a simulation of animal sounds. Define a class Animal with a method
 makeSound(). Create subclasses Dog and Cat that override makeSound(). Demonstrate dynamic
method dispatch by calling makeSound() using an Animal reference.

 */

class Animal1{
   void makeSound()
    {
        System.out.println("Animal class");
    }
}
class Dog extends Animal1{
    void makeSound()
    {
        System.out.println(" Dog class");
    }
}
class Cat extends Animal1{
    void makeSound(){

        System.out.println("Cat class");
    }
}


public class Animal {
    public static void main(String[] args) {

         Animal1 ob;
         Dog ob1 =new Dog();
         ob=ob1;
         ob. makeSound();
         Cat ob2 =new Cat();
         ob=ob2;
         ob.makeSound();


    }
}
