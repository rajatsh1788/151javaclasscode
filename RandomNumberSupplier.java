import java.util.function.Supplier;
import java.util.Random;
public class RandomNumberSupplier
{
    public static void main(String args[])
    {
        Random random = new Random();

        Supplier<Integer> rn = () -> random.nextInt(100);

        System.out.println("Random number: "+rn.get());
        System.out.println("Another random number: "+rn.get());
    }
}