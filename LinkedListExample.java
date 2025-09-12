import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample
{
    public static void main(String args[])
    {
        LinkedList<String> employees = new LinkedList<>();
        employees.add("John");
        employees.add(1,"Rajat");
        employees.addFirst("Rohit");
        employees.addLast("Sunny");

        System.out.println("Employees after adding: "+employees);

        Iterator itr = employees.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("Get First: "+employees.getFirst());
        System.out.println("Get Last: "+employees.getLast());
        System.out.println();
        employees.remove();   // removes first
        employees.removeLast();  // removes last
        employees.remove(1);    // removes at that particular index
        System.out.println("After removing: "+employees);


        employees.add("Meena");
        employees.add("John");
        System.out.println(employees);
        System.out.println(employees.indexOf("John"));
        System.out.println(employees.lastIndexOf("John"));
    }
}