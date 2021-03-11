package oop_project;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double base;

    public BasePlusCommissionEmployee(String name,String address, int ssn, Gender sex, double grossSales,double commissionRate,double base){
        super(name,address,ssn,sex,grossSales,commissionRate);
        this.base = base;
    }


    public  double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public String toString() {
        return  ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", sex=" + sex +
                "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ",BasePlusCommissionEmployee =" + base+
                '}';
    }

    @Override
    public double earning() {
        return super.earning()+base;
    }

    @Override
    public void displayEarnings() {
        System.out.println("Earnings =" + earning());
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
        displayEarnings();
    }
}
