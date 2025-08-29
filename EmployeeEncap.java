import java.util.*;
class EmployeeEncap
{
    private int Account_balance;
    private int upi_pin=998899;

    public void setBalance(int balance)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter upi pin");
        int pin=in.nextInt();
        if(pin==upi_pin)
        {
            Account_balance = balance;
            System.out.println("Congratulations salary is credited");
        }
        else
        {
            System.out.println("Incorrect pin! salary is not credited");
        }
        
    }
    public void getBalance()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("To know the balance enter upi pin");
        int pin=in.nextInt();
        if(pin==upi_pin)
        System.out.println("Balance is: "+Account_balance);
        else
        System.out.println("Incorrect pin");
    }
    public static void main(String args[])
    {
        EmployeeEncap ob = new EmployeeEncap();
        ob.setBalance(60000);
        ob.getBalance();
    }
}