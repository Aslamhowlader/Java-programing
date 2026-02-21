/*
5️⃣ Volume Calculator: Create a class VolumeCalculator. Use one parameter for Cube (side³),
 three parameters for Cuboid (length × width × height),
 and two parameters for Cylinder (π × r² × height). All methods use the same name volume()
 */
class VolumeCalculator1
{
    double volume(double side)
    {
        return side*side*side;
    }
    double volume(double l,double w,double h)
    {
        return (l*w*h);
    }
    double   volume(double r,double h)
    {
        return (3.14*r*r*h);
    }
}

public class VolumeCalculator {

    static void main(String[] args) {
        VolumeCalculator1 ob=new VolumeCalculator1();
        System.out.println("Cube:"+ob.volume(4.8));
        System.out.println("Cuboid:"+ ob.volume(2,4,5));
        System.out.println("Cylinder:"+ob.volume(5,7));

    }
}
