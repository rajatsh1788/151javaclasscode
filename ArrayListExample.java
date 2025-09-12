import java.util.ArrayList;
public class ArrayListExample
{
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        System.out.println(fruits);

        for(String s:fruits)
        {
            System.out.println(s);
        }
        for(int i=0;i<fruits.size();i++)
        {
            System.out.println(fruits.get(i));
        }
    }
}