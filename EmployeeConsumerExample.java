import java.util.*;
import java.util.function.Consumer;
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
public class EmployeeConsumerExample
{
    public static void main(String args[])
    {
        // Creating an ArrayList of Employees
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Rajat", 50000));
        employees.add(new Employee("Rohit", 60000));

        //Consumer to give bonus
        Consumer<Employee> giveBonus = (e) -> e.salary +=5000;

        // Consumer to display employee details
        Consumer<Employee> show = (e) -> System.out.println(e.name +" => "+e.salary);

        employees.forEach(giveBonus);
        employees.forEach(show);
    }
}