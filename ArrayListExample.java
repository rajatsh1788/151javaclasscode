import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class ArrayListExample
{
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        System.out.println(fruits);
        System.out.println();
        for(String s:fruits)
        {
            System.out.println(s);
        }
        System.out.println();
        for(int i=0;i<fruits.size();i++)
        {
            System.out.println(fruits.get(i));
        }
        System.out.println();
        Iterator itr=fruits.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        fruits.add(1,"Hello");
        System.out.println(fruits);
        System.out.println(fruits.set(2,"New"));
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}