public class StaticVariable
{
    int id;
    static String org;
    void details()
    {
        System.out.println("ID: "+id+" Organisation: "+org);
    }
    static void Deta()
    {
        System.out.println("Inside static method");
    }
    public static void main(String args[])
    {
        Deta();
        StaticVariable ob1 = new StaticVariable();
        ob1.id=101;
        ob1.org="KIET";
        ob1.details();
        StaticVariable ob2 = new StaticVariable();
        ob2.id=102;
         ob2.details();
    }
}