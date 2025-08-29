public class ExceptionExample
{
    public static void main(String args[])
    {
        System.out.println(1);
        System.out.println(10);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        try
        {
            System.out.println(100/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println(9);
        System.out.println("End of program");
    }
}