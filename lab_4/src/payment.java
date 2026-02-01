class payment1{
    void  pay(){
        System.out.println("class payment1");
    }
}

 class CreditCardPayment extends  payment1{
     void  pay(){
         System.out.println("class CreditCardPayment ");
     }

}
class PayPalPayment extends payment1{
    void  pay(){
        System.out.println(" class PayPalPayment");
    }
}
public class payment {
    public static void main(String[] args) {

        payment1 ob;
        CreditCardPayment ob1=new CreditCardPayment();
        ob=ob1;

        ob.pay();
        PayPalPayment ob2 =new PayPalPayment();
        ob=ob2;
        ob.pay();



    }
}

