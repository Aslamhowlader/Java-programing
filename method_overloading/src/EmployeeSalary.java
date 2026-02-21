/*
3️⃣ Employee Salary: Create a class SalaryCalculator with overloaded calculateSalary() methods.
 The first method takes hours for hourly workers, the second method takes hours and a custom rate,
and the third method takes a fixed salary for fixed salary employees.

 */
class SalaryCalculator{
    double calculateSalary(double hour)
    {
        int rate=10;
        return hour*rate;
    }
    double calculateSalary(double hour,int rate)
    {

        return hour*rate;
    }
    double calculateSalary(int  fixed_salary)
    {

        return fixed_salary;
    }
}



public class EmployeeSalary {
    static void main(String[] args) {
        SalaryCalculator ob=new SalaryCalculator();



        System.out.println("Defilt value:"+ob.calculateSalary(10.60));
        System.out.println("hours and a custom rate :"+ob.calculateSalary(20,10));
        System.out.println("fixed salary employees : "+ob.calculateSalary(100));

    }

}
