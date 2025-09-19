import java.util.*;
public class HashMapExample
{
    public static void main(String args[])
    {                       //                                   unique keys but values can be duplicate
//                                                               we can have only one key as null
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Rajat");
        map.put(2,"Rohit");
        map.put(6,"Shivam");
        map.put(5,null);
        map.put(4,"Sunny");
        map.put(7,"SHahsi");
        map.put(null,"Ranjan");
        System.out.println(map);
        System.out.println("\nTraversing via key ");
        for(Integer k : map.keySet())                   //first method
        {
            System.out.println(k+" "+map.get(k));
        }

        System.out.println("\nTraversing via entry");
        for(Map.Entry<Integer, String> entry :map.entrySet())        // second method
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        System.out.println("\nTraversing via iterator");
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();      // third method
        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key: "+ entry.getKey() + " ,Value: "+entry.getValue());
        }
    }
}