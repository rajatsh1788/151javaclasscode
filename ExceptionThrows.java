class example{
    int salary;
    example(int salary)
    {
        if(salary<=0)
        {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.salary=salary;
        System.out.println(salary);
    }
}
public class ExceptionThrows
{
    public static void main(String args[])
    {
        try{
            example e=new example(0);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
}