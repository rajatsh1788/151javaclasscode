import java.util.PriorityQueue;
public class PriorityQueueExample
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(19);
        pq.add(15);
        pq.add(8);
        pq.add(1);
        System.out.println(pq);
        System.out.println("Adding using offer: "+pq.offer(35));
        System.out.println("Queue is: "+pq);
        pq.add(3);
        System.out.println("Queue is: "+pq);

        pq.clear();   // clear
        System.out.println(pq);

       // pq.remove();             // remove will throw error if queue if empty
        System.out.println(pq.poll());   // poll will not cause error if queue is empty but it will print null
    }
}