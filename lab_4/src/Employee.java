class Employees {
    double calculateSalary() {
        return 0;   // Default implementation
    }
}

class FullTimeEmployee extends Employees {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employees {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Employee {
    public static void main(String[] args) {
        Employees e1 = new FullTimeEmployee(30000);
        Employees e2 = new PartTimeEmployee(200, 80);

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}