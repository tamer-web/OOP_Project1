package oop_project;

import java.util.ArrayList;

public class Department {
    int deptNo;
    String deptName;
    ArrayList <Employee>employeeList;

    public Department(int deptNo,String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        employeeList = new ArrayList<>();
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

   public void addEmployee(Employee e) {
        employeeList.add(e);
   }

   public void removeEmployee(int i){
        employeeList.remove(i);
   }
   public int getEmployeeSize(){
       return employeeList.size();
   }
   public void displayData(){
        for(int i=0; i<employeeList.size();i++){
            System.out.println(employeeList.get(i).getSsn() +" "+ employeeList.get(i).getName() +" "+ employeeList.get(i).getSex());
        }
   }
   public void displayDetails(){
        for(int i=0;i<employeeList.size();i++){
         if(employeeList.get(i) instanceof SalariedEmployee)
            //Casting
             ((SalariedEmployee)employeeList.get(i)).displayDetails();
         if(employeeList.get(i) instanceof PartTimeEmployee)
                //Casting
                ((PartTimeEmployee)employeeList.get(i)).displayDetails();
            if(employeeList.get(i) instanceof CommissionEmployee)
                //Casting
                ((CommissionEmployee)employeeList.get(i)).displayDetails();
         }
   }
}
