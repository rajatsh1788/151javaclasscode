import java.util.HashSet;
public class HashSetExample
{
    public static void main(String args[])
    {                                                                  // this is unordered  and unique
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(2);
        System.out.println(numbers);
        
        HashSet<Integer> number1 = new HashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(11);
        number1.add(23);
        System.out.println(number1);

        number1.addAll(numbers);         // to take union
        System.out.println("After union: "+number1);
        number1.removeAll(numbers);         // removeAll to take difference
        System.out.println("After differnece: "+number1);
        number1.retainAll(numbers);         // to take intersection
        System.out.println("After intersection: "+number1);
    }
}