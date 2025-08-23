import java.util.*;
public class Manager
{
    String name;
    int quantity;
    Manager(String CarName, int quant)
    {
        this.name=CarName;
        this.quantity=quant;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of beasts your agency has");
        n=in.nextInt();
        Manager arr[] = new Manager[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter car name");
            String carName = in.next();
            System.out.println("Enter total number of "+carName+": ");
            int quant=in.nextInt();
            arr[i] = new Manager(carName,quant);
        }
        System.out.println("\nEnter your car name u wish to buy");
        String myCar = in.next();
        System.out.println("Enter how many cars u wish to buy");
        int number = in.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].name + "   "+arr[i].quantity);
        }

        for(int i=0;i<n;i++)
        {
            if((arr[i].name).equals(myCar))
            {
                if(arr[i].quantity!=0)
                {
                    System.out.println("\n\nCongratulations");
                    System.out.println("You got your dream car "+arr[i].name);
                    arr[i].quantity -= number;;
                    break;
                }
                else
                System.out.println("Sorry Sir!\nOutof stock");
            }
        }
        System.out.println("\n");
         for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].name + "   "+arr[i].quantity);
        }
    }
}