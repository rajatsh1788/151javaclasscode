class Basket
{
    int data;
    boolean empty;
    
    synchronized void produce(int value)
    {
        while(!empty)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        data=value;
        empty=false;
        System.out.println("Produced: "+data);
        notify();
    } 
    synchronized void consume()
    {
        while(empty)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        empty=true;
        System.out.println("COnsumed data: "+data);
        notify();
    }
}
class Consumer extends Thread{
    Basket b;
    Consumer(Basket b)
    {
        this.b=b;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            b.consume();
        }
    }
}
public class InterThreadCommunication
{
    public static void main(String args[])
    {
        Basket basket = new Basket();
        new Producer(basket().start());
        new Consumer(basket().start());
    }
}
