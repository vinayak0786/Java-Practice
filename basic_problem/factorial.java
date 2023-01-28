//Factorial of a number
import java.util.*;

public class factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter the number to calculate factorial");
        n=sc.nextInt();
        
        while(n>1)
        {
            fact=fact*n;


            n--;
        }

        System.out.println("The factorial ="+fact);



    }
    
}
