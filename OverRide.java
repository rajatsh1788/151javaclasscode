class EmployeePoly
{                                   
    String Emp_name;
    void details()
    {
        System.out.println("Name from parent class: "+Emp_name);
    }
    void details(int salary, String company)
    {
        System.out.println("Employee Salary: "+salary);
    }
    void details(String company, int salary)
    {
        System.out.println("Institute name: "+company);
    }
}
class Faculty extends EmployeePoly
{
    void details()
    {
        System.out.println("Name from child class: "+Emp_name);
    }
}
public class OverRide
{
    public static void main(String args[])
    {
        Faculty f = new Faculty();
        f.Emp_name="Rajat Sharma";
        f.details();
    }
}