import java.util.*;


public class income_tax {
    public static void main(String args[])
    {
        double tax=0,income;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income");
       income=sc.nextDouble();

        if(income<500000)
        {
            System.out.println("Congrats! you are under 5L income slab");
            System.out.println("The income tax="+tax);
            System.out.println("Income in hand="+income);
        
        }
        else if(income>500000 && income<1000000)
        {
            System.out.println("Congrats! you are between 5L -10L income slab");
            tax=(0.2)*income;
            System.out.println("The income tax="+tax);
            System.out.println("Income in hand="+(income-tax));
        
        }
        else if( income>1000000)
        {
            System.out.println("Congrats! you are above 10L income slab");
            tax=(0.3)*income;
            System.out.println("The income tax="+tax);
            System.out.println("Income in hand="+(income-tax));
        }
        else
        {
            System.out.println("Invalid Input!");
        }
        
        
    }

    
}
