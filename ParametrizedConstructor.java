import java.util.*;
public class ParametrizedConstructor
{
    String name;
    int id;
    ParametrizedConstructor(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    void display()
    {
        System.out.println("Name: "+name+"  id: "+id);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name="Rajat";
        int id=151;
        ParametrizedConstructor m1 = new ParametrizedConstructor(name,id);
        m1.display();
    }
}