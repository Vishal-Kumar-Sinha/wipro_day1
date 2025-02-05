/*
Given a list of employees, each with a name, age, and salary, write a Java 
program using the Streams API to:
 
Filter employees who are older than 30.
Find the average salary of employees who meet the age condition.
Collect the names of these employees into a List.
Print the list of employee names and the average salary.
Hint: Use filter(), map(), collect(), and average() methods from Streams
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    String getEmpname() {
        return name;
    }
    int getEmpage() {
        return age;
    }
    double getEmpsalary() {
        return salary;
    }
}
public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> employees=Arrays.asList(
            new Employee("Vishal", 25, 50000),
            new Employee("John Doe", 36, 25000),
            new Employee("Bob Smith", 47, 75000),
            new Employee("Apple Pie", 22, 15000),
            new Employee("Joe Paul", 52, 26000)
        );
        List<String> senioremp=employees.stream().filter(se -> se.getEmpage()>30).map(Employee::getEmpname).collect(Collectors.toList());
        System.out.println("Employees who are older than 30: "+senioremp);

        double avgsalary=employees.stream().filter(e -> e.getEmpage()>30).mapToDouble(Employee::getEmpsalary).average().getAsDouble();
        System.out.println("Average salary of employees who are older than 30: "+avgsalary);
    }
}
