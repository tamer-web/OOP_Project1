package oop_project;

public class EmployeeApp {
    public static void main(String[] args){
    Department d1 = new Department(101,"Programming");

    SalariedEmployee employee1 = new SalariedEmployee("Tamer G.","Tel-A",1,Gender.Male,10000.00,5000.00,1200);
    d1.addEmployee(employee1);

    PartTimeEmployee employee2 = new PartTimeEmployee("Liran R.","Tel-A.",2,Gender.Male,60.00,100);
    d1.addEmployee(employee2);

    CommissionEmployee employee3 = new CommissionEmployee("Becky Nasser","Jerusalem",3,Gender.female,2500.00,.025);
    d1.addEmployee(employee3);

        System.out.println(d1.getDeptName());
        d1.displayData();
        d1.displayDetails();
    }
}
