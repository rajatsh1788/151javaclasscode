import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SortingDemo
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(21);
        list.add(324);
        list.add(23);
        list.add(12);
        list.add(212);

        System.out.println(list);

        System.out.println("After sorting: ");

        Collections.sort(list);                // it uses TimSort which is a mixture of Merge sort and Insertion Sort
        System.out.println(list);
//                                                       // Comparable interface is in lang package it uses compareTo function. We use it to sort in ascending
        Collections.sort(list, Comparator.reverseOrder());     // comparator interface  is in util package. We use it to sort in reverse
        System.out.println(list);
    }
}