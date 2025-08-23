class parent
{
    int id;
    String name;
    String org;
    void details()
    {
        System.out.println("Details are : "+id+" "+name+" "+org);
    }
}
class Faculty extends parent{
String dept;
String subject;
void FacultyDetails()
{
    System.out.println("Department is: "+dept+" Subject: "+subject);
}
}
public class SingleInheritance{
    public static void main(String args[])
    {
        Faculty ob = new Faculty();
        ob.dept="AIML";
        ob.subject="Java";
        ob.id=151;
        ob.name="Rajat";
        ob.org="KIET";
        ob.FacultyDetails();
        ob.details();
    }
}