abstract class Hey
{
    public abstract void Rajat();                          // abstract concept
    public void show()
    {
        System.out.println("Non abstract method");
    }
}
 public class exam extends Hey
{
    public void Rajat()
        {
            System.out.println("Hello Rajat");
        }
    public static void main(String args[])
    {
        exam ob = new exam();
        ob.show();
    }
}