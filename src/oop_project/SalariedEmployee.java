package oop_project;

public class SalariedEmployee extends Employee implements DisplayInfo{

    double salary;
    double bonus;
    double deductions;



    public SalariedEmployee(String name, String address, int ssn, Gender sex, double salary, double bonus, double deductions) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public double earning(){
        return (salary + bonus) -deductions;
    }

    @Override
    public void displayDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SalariesEmployee{" +
                "Salary=" + salary +
                ", Bonus=" + bonus +
                ", Deductions=" + deductions +
                '}';
    }

    @Override
    public void displayEarnings() {

        System.out.println(earning());
    }
}
