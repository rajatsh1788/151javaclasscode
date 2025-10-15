class ThreadDemo extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName() +" is running");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadExample11
{
    public static void main(String args[])
    {
        ThreadDemo t1 = new ThreadDemo();
        t1.setName("Rajat");
        t1.start();
        ThreadDemo t2 = new ThreadDemo();
        t2.start();
    }
} 