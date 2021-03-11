package oop_project;

public class PartTimeEmployee extends Employee implements DisplayInfo {

    private double hourRate;
    private int noOfHours;

    public PartTimeEmployee(String name, String address, int ssn, Gender sex,double hourRate, int noOfHours) {
        super(name, address, ssn, sex);
        this.hourRate = hourRate;
        this.noOfHours = noOfHours;
    }


    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "Name =' " + name + '\'' +
                ", Address =' " + address + '\'' +
                ", SSN = " + ssn +
                ", Sex = " + sex +
                ", HourRate = " + hourRate +
                ", Numbers of Hours = " + noOfHours +
                '}';
    }

    @Override
    public double earning(){
        return noOfHours * hourRate;

    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }

    @Override
    public void displayEarnings() {
        System.out.println(earning());
    }


}
