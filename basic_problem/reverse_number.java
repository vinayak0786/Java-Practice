//reverse a number
import java.util.*;
public class reverse_number {
    public static void main(String args[])
    {
        int rev=0,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n=sc.nextInt();
        while(n>0)
        {
            digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;



        }
        System.out.println("The reversed digit="+rev);

        sc.close();


        }
}
