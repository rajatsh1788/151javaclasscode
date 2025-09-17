import java.util.ArrayDeque;
public class Deque
{
    public static void main(String args[])
    {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("F");
        deque.add("L");

        deque.offer("c");  // adds at the end safely
        deque.offerFirst("first");
        deque.offerLast("last");
        System.out.println(deque);

        //Access elements
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        //Remove
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}