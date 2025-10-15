
@FunctionalInterface
interface Bird 
{
    void canfly();
}
public class FunctionalInterfaceEx
{
    public static void main(String args[])
    {
                    //    Using anonymous class
        Bird b = new Bird()
        {
            public void canfly()
            {
                System.out.println("Using anonymous class");
            }
        };
        b.canfly();

        // Using lambda
        Bird c=()->{
            System.out.println("Using lambda expression");
           // b.canfly();
        };
        c.canfly();
    }
}