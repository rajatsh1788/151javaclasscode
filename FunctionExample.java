import java.util.function.Function;
public class FunctionExample
{
    public static void main(String args[])
    {
        Function<Integer,Integer> sqaure =n -> n*n;

        System.out.println(sqaure.apply(5));
        System.out.println(sqaure.apply(9));
    }
}