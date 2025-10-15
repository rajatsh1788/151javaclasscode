class PriorityDemo extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
class PriorityExample
{
    public static void main(String args[])
    {
        PriorityDemo t1 = new PriorityDemo();
        t1.setPriority(1);
        t1.setName("Thread1");
        t1.start();
         PriorityDemo t2 = new PriorityDemo();
        t2.setPriority(5);
        t2.setName("Thread2");
        t2.start();
        PriorityDemo t3 = new PriorityDemo();
        t3.setPriority(10);
        t3.setName("Thread3");
        t3.start();
    }
}