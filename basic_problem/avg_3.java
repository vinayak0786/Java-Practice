package basic_problem;
/*In a program,input 3 numbers:A,B and C.
You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
*/
import java.util.*;


public class avg_3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers\n");
        int A,B,C;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        System.out.println("The Average is="+(A+B+C)/3);

    }
    
}
