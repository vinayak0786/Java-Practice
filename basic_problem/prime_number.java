/*
 check prime number 
 method 1: 2 to n-1
 method 2:2 to sqrt(n)
 */

import java.util.*;

public class prime_number {
    public static void main(String args[]) {
        int n,j=2,i;
        boolean flag ;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        while (j<=20) {
            // n = sc.nextInt();
            flag=true;

          
            for ( i = 2; i < Math.sqrt(j); i++) {

                if (j % i == 0)
                {
                    flag = false;
                    break;
                }
                
                
            }
            if (flag == true)
                System.out.println(j);
            // else
            //     System.out.println("Not a prime number");

                j++;

        }

    }
}
