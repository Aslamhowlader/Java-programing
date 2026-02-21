
/*
6️⃣ Discount Calculator: Create a class DiscountCalculator with overloaded discount() methods.
The first method takes price and gives a 10% discount, the second takes price and a custom percentage,
 and the third takes price and quantity and gives 10% discount if quantity > 5.

 */
class DiscountCalculator1{
    float discount(float price)
    {
        return price-(10/100*price);
    }
    float discount(float price,float percentage)
    {
        return price-(price*percentage/100);
    }
    float discount(float price,int quantity)
    {
        if(quantity>5)
        {
          return price-(10/100*price);
         return price;
        }
    }

}

public class DiscountCalculator {
    static void main(String[] args) {
        DiscountCalculator1 ob =new DiscountCalculator1();
        System.out.println(ob.discount(3.66,4));
    }


}
