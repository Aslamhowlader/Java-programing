abstract  class shape{
    double h,w;
    shape(double h,double w)
    {
        this.h=h;
        this.w=w;

    }
    abstract void area();

}
class  trang extends shape{
    trang(double h,double w)
    {
        super(h,w);
    }


    void area() {
       System.out.println("Area :"+(h*w));
    }
}

class  recg extends shape{
    recg(double h, double w)
    {
        super(h,w);
    }


    void area() {
        System.out.println("Area :"+(0.5*h*w));
    }
}

public class runtime {
    public static void main(String[] args) {
        shape ob;
        trang ob1 = new trang(2, 4);

        ob = ob1;
        ob.area();

        recg ob2 =new recg(3,4);
        ob=ob2;
        ob.area();
    }
}