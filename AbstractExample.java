abstract class College
{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility()
    {
        System.out.println("Medical facilities are optional.");
    }
}
class KIETT extends College
{
    void Register()
    {
        System.out.println("Kiet is registered with AKTU.");
    }
    void Infrastructure()
    {
        System.out.println("Kiet has digital classrooms and labs.");
    }
    void Students()
    {
        System.out.println("Admissions through counselling.");
    }
    void Staff()
    {
        System.out.println("Kiet has well trained staff.");
    }
    void mediaclFacility()
    {        
        System.out.println("Kiet has its own hospital inside campus.");
    }
}
public class AbstractExample
{
    public static void main(String args[])
    {
        KIETT cg;
        cg=new KIETT();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.medicalFacility();
    }
}
