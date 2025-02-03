/*
Design an Employee Management System where you create an abstract class 
Employee with abstract methods like calculateSalary() and displayDetails(). 
Create two derived classes, FullTimeEmployee and PartTimeEmployee, and 
implement the abstract methods. For FullTimeEmployee, calculate salary as 
a fixed monthly rate, and for PartTimeEmployee, calculate salary based on 
hourly rates. Demonstrate polymorphism by creating an array of Employee 
objects and calculating/displaying salaries using overridden methods.
 */
abstract class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }
    abstract void calculateSalary();
    abstract void displayDetails();
}
class FullTimeEmployee extends Employee {
    int monthlysalary;
    FullTimeEmployee(int id, String name, int monthlysalary) {
        super(id,name);
        this.monthlysalary=monthlysalary;
    }
    void calculateSalary() {
        System.out.println("Salary: "+monthlysalary);
    }
    void displayDetails() {
        System.out.println("FULL-TIME EMPLOYEE DETAILS");
        System.out.println("Employee ID: "+id+"\nName: "+name+"\nSalary: "+monthlysalary+"\n");
        
    }
}
class PartTimeEmployee extends Employee {
    int workinghrs;
    int hrlyrate;
    PartTimeEmployee(int id, String name, int workinghrs, int hrlyrate) {
        super(id, name);
        this.workinghrs=workinghrs;
        this.hrlyrate=hrlyrate;
    }
    void calculateSalary() {
        System.out.println("Salary: "+(workinghrs*hrlyrate));
    }
    void displayDetails() {
        System.out.println("PART-TIME EMPLOYEE DETAILS");
        System.out.println("Employee ID: "+id+"\nName: "+name+"\nSalary: "+(workinghrs*hrlyrate)+"\n");
    }
}
public class EmployeeMS {
    public static void main(String[] args) {
        Employee[] e=new Employee[4];
        e[0]=new FullTimeEmployee(01, "Full Emp1", 10000);
        e[1]=new PartTimeEmployee(02, "Part Emp1", 26, 500);
        e[2]=new FullTimeEmployee(03, "Full Emp2", 10000);
        e[3]=new PartTimeEmployee(04, "Part Emp2", 31, 560);
        for(int i=0;i<e.length;i++) {
            e[i].calculateSalary();
            e[i].displayDetails();
        }
    }
}
