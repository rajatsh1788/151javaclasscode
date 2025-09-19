import java.util.*;
public class HashTableDemo
{
    public static void main(String args[])
    {
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(1,"Abc");
        table.put(2,"Xyz");
        System.out.println("Our HashTable is "+table);

        table.put(1,"pq");     // it will override the value at that key
        System.out.println(table);

        table.putIfAbsent(2,"Rajat");    // it will insert value if that keu do not contain any value before  
        System.out.println(table);
    }
}