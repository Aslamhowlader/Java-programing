class  A{
    A(){
        System.out.println("Class A");
    }
}
class B extends A{
    B()
    {
        System.out.println("Class B");
    }
}
class C extends B{
    C()
    {
        System.out.println("class C");
    }
}


public class multilevel1 {
    public static void main(String[] args) {

        C ob = new C();
        


    }
}
