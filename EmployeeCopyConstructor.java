import java.util.*;
public class EmployeeCopyConstructor
{
    int id;
    String name;
    EmployeeCopyConstructor(int i, String na)
    {
        id=i;
        name=na;
    }
    EmployeeCopyConstructor(EmployeeCopyConstructor ob1)     // Copy Constructor
    {
        id=ob1.id;
        name=ob1.name;
    }
    void printInfo()
    {
        System.out.println("Details of Employee are: "+id+" "+name);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter deatils");
        int id=in.nextInt();
        String name=in.next();
        EmployeeCopyConstructor ob1 = new EmployeeCopyConstructor(id,name);
        EmployeeCopyConstructor ob2 = new EmployeeCopyConstructor(ob1);
        ob2.id=151;
        ob1.printInfo();
        ob2.printInfo();
    }
}