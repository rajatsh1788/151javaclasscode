class EmployeePoly
{                                    // Compile time polymorphism or early binding or static binding or method overloading
    String Emp_name;
    void details()
    {
        System.out.println("Name: "+Emp_name);
    }
    void details(int salary)
    {
        System.out.println("Employee Salary: "+salary);
    }
    void details(String company)
    {
        System.out.println("Institute name: "+company);
    }
}
public class PolyMorphism
{
    public static void main(String args[])
    {
        EmployeePoly ob = new EmployeePoly();
        ob.Emp_name="Rajat Sharma";
        ob.details();
        ob.details(1000000);
        ob.details("KIET");
    }
}