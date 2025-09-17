import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;
public class LinkedHashSetExample
{
    public static void main(String args[])
    {                                                                  
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();     // LinkedHashSet is for ordered and it is unique
        numbers.add(21);
        numbers.add(12);
        numbers.add(111);
        System.out.println("LinkedHashSet is "+numbers);
        
        TreeSet<Integer> ts = new TreeSet<>();         // TreeSet is for sorted and unique
        ts.add(21);
        ts.add(12);
        ts.add(111);
        System.out.println("TreeSet is "+ts);

        HashSet<Integer> number2 = new HashSet<>();   // HashSet is for unordered (randomly) and it is unique
        number2.add(21);
        number2.add(12);
        number2.add(111);
        System.out.println("HashSet is "+number2);
    }
}