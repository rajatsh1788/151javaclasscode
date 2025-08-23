public class methodCode
{
    int id;
    String name;
    public void displayMethod()
    {
        System.out.println("Details are: "+id+" "+name);
    }
    public static void main(String args[])
    {
        methodCode m1 = new methodCode();
        m1.id = 151;
        m1.name = "Rajat";
        m1.displayMethod();
    }
}