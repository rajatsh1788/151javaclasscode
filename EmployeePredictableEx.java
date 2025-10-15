import java.util.*;
import java.util.function.Predicate;
class Employee
{
    String name;
    double salary;
    Employee(String name, double salary)
    {
        this.name=name;
        this.salary=salary;
    }
}
public class EmployeePredictableEx
{
    public static void main(String args[])
    {
        // Creating an ArrayList of Employees
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Rajat", 50000));
        employees.add(new Employee("Rohit", 60000));
        employees.add(new Employee("hfsf", 40000));

        //Consumer to give bonus
        Predicate<Employee> highSalary = (e) -> e.salary > 50000;

        for(Employee e:employees)
        {
            if(highSalary.test(e))
            {
                System.out.println(e.name + " has highest salary");
            }
        }
    }
}