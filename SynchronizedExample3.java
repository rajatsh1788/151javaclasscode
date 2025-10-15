class BankAccount1
{
    static int balance=5000;

    static synchronized void withdraw(int amount)
    {
        if(balance>=amount)
        {
            System.out.println(Thread.currentThread().getName() + " is withdrawing "+amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance: "+balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
}
class WithdrawThreads extends Thread
{
    BankAccount1 account;
    int amount;
    WithdrawThreads(BankAccount1 account, int amount)
    {
        this.account=account;
        this.amount=amount;
    }
    public void run()
    {
        account.withdraw(amount);
    }
}
public class SynchronizedExample3
{
    public static void main(String args[])
    {
        BankAccount1 b1 = new BankAccount1();

        WithdrawThreads t1 = new WithdrawThreads(b1,1000);
        WithdrawThreads t2 = new WithdrawThreads(b1,3000);

        t1.start();
        t2.start();
    }
}