interface Institute
{                                          // interface will have variables as static, final, public
    void Register();                          // these methods are by default public and abstract
    void Infrastructure();
    void Students();                       // java 7-----have abstract methods as public 
    void Staff();                         // java 8----Can have default and static methods with body
    //                                 // java 9----Can have private methods inside interfaces.

     static void staticConcrete()
     {
        System.out.println("Static Concrete method inside Interface");
     }   
    default void defConcrete()
    {
        System.out.println("Default concrete method inside Interface");
    }
    private void privateConcrete()
    {
        System.out.println("Private concrete method inside interface");
    }                                     
}
class ABC implements Institute
{
    public void Register()
    {
        System.out.println("Kiet is registered with AKTU.");
    }
    public void Infrastructure()
    {
        System.out.println("Kiet has digital classrooms and labs.");
    }
    public void Students()
    {
        System.out.println("Admissions through counselling.");
    }
    public void Staff()                     // if we do not specify them as public here it be default which will cause error.
    {
        System.out.println("Kiet has well trained staff.");
    }
}
public class InterfaceExample
{
    public static void main(String args[])
    {
        Institute cg;
        cg = new ABC();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.Staff();
        Institute.staticConcrete();
        cg.defConcrete();
    }
}