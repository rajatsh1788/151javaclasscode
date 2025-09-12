

import java.util.Vector;
public class VectorExample
{
    public static void main(String args[])
    {
        Vector <String> vc = new Vector<>();   // default size 10
        System.out.println(vc.capacity());       // capacity means how many elements can be in vector
        vc.add("1");
        vc.add("2");
        vc.add("3");
        System.out.println(vc.capacity());
        System.out.println(vc.size());           // size means how many elements are in vector

        Vector <String> vc1 = new Vector<>(4);     // we are giving capacity as 4
        Vector <String> vc2 = new Vector<>(4,1);  // 1 means memory size will increase 1 each time when capacity gets full
        vc1.add("1");
        vc1.add("2");
        vc1.add("3");
        vc1.add("4");
        System.out.println(vc1.capacity());         
        vc1.add("5");                           // if capacity exceeds, then the memory size will automatically get doubled-
        //                                               -if not declared to increase by how much by default
        System.out.println(vc1.capacity());

        Vector <String> vc3 = new Vector<>();
        vc3.add("A");
        vc3.add("B");
        vc3.add("C");  
        System.out.println("Third vector is: "+vc3);
        vc.addAll(vc3);          // addAll is used to append values of one vector to another
        System.out.println(vc);
        System.out.println(vc.firstElement());
        System.out.println(vc.lastElement());
        vc.clear();    // clear is used to clear the vector
        System.out.println("Values of vc are: "+vc);
    }
}