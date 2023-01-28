import java.util.Scanner;

/*Enter cost of 3 items from the user(using double datatype)-
a pencil,a pen and an eraser. You have to output the total
 cost of the items back to the user as their bill.(Add on : You can also try adding
 18% gst tax to the items in the bill as an advanced problem)
 */
import java.util.*;
public class stationary_bill {
    public static void main(String args[])
    {
        double total;
        double pen,pencil,eraser;
        double final_price;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of pencil ,eraser,pen");
        
        pen=sc.nextInt();
        pencil=sc.nextInt();
        eraser=sc.nextInt();
        total=(pen+pencil+eraser);
        double tax=(0.18f)*total;
        final_price=total+tax;
        System.out.println("the total cost ="+final_price);


    }
}