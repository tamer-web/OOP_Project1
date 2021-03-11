package oop_project;

public class CommissionEmployee extends Employee implements DisplayInfo{
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String name,String address, int ssn, Gender sex, double grossSales,double commissionRate){
        super( name,address, ssn, sex);
        this.grossSales =grossSales;
        this.commissionRate = commissionRate;

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return  "CommissionEmployee{ " +
                "Name ='" + name + '\'' +
                ", Address ='" + address + '\'' +
                ", SSN =" + ssn +
                ", Sex =" + sex +
                ", GrossSales =" + grossSales +
                ", CommissionRate =" + commissionRate +
                 '}';
    }

    @Override
    public double earning() {
        return (grossSales * commissionRate);
    }

    @Override
    public void displayEarnings() {
        System.out.println(earning());
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }
}
