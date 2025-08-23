import java.util.*;
public class Employee
{
    void getDetails()
    {
        Scanner in = new Scanner(System.in);
        String name=in.nextLine();
        int salary=in.nextInt();
        System.out.println(name+"  "+salary);
    }
    public static void main(String args[])
    {
        Employee ob = new Employee();
        ob.getDetails();
    }
}