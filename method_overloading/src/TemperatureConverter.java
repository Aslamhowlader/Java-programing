
/*
4️⃣ Temperature Converter: Create a class TemperatureConverter with three overloaded convert() methods.
 The first converts Celsius to Fahrenheit, the second converts Fahrenheit to Celsius,
 and the third converts Celsius to rounded Fahrenheit.
 */
class TemperatureConverter1
{
  double  convert(double Celsius)
    {
        return (Celsius*1.8)+32;
    }
    double convert(int Fahrenheit)

    {
        return (Fahrenheit-32)/1.8;
    }
     double convert(double Celsius,boolean T )
    {
        double Fahrenheit=(Celsius*1.8)+32;
        if(T)
        {
            return (int) Math.round(Fahrenheit);
        }
        else
        {
            return (int) Fahrenheit;
        }

    }
}

public class TemperatureConverter {
    static void main(String[] args) {


        TemperatureConverter1 ob =new TemperatureConverter1();
        System.out.println("Celsius to Fahrenheit:"+ob.convert(20.0));
        System.out.println("converts Fahrenheit to Celsius:"+ob.convert(30));
        System.out.println("Celsius to rounded Fahrenheit:"+ob.convert(23.0,true));
    }
}
