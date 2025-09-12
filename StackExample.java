import java.util.Stack;
public class StackExample
{
    public static void main(String args[])
    {
        Stack<Integer> st= new Stack<>();
        //push,pop,peek,empty,search
        st.push(2);
        st.push(5);
        st.push(9);
        st.push(8);
        st.push(3);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.empty());
        System.out.println(st.search(5));
    }
}