class MyTask implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Thread2
{
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
        
        MyTask task = new MyTask();

        Thread t = new Thread(task);
        t.start();
        Thread t1 = new Thread(task);
        t1.start();
        Thread t2 = new Thread(task);
        t2.start();
    }
}