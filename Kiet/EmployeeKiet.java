package Kiet;
public class EmployeeKiet
{
    public String name;
    private int id;
    protected int salary;
    String Department;
    void employeeDetails()
    {
        System.out.println("Details of the employees are: "+id+" "+name+" "+salary+" "+Department);
    }
    public static void main(String args[])
    {
        EmployeeKiet ek = new EmployeeKiet();
        ek.name="Rajat";
        ek.id=151;
        ek.salary=35646845;
        ek.Department="AI-ML";
        ek.employeeDetails();
    }
}