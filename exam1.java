interface Hey
{
    public void Rajat();
}                                              //interface concept
 public class exam1 implements Hey
{
    public void Rajat()
        {
            System.out.println("Hello Rajat");
        }
    public static void main(String args[])
    {
        exam1 ob = new exam1();
        ob.Rajat();
    }
}