import java.util.*;

/*Write a program that reads a set of integers,
 and then prints the sum of the
even  and odd integers.
*/
public class sum_integers {
    public static void main(String args[]) {
        int even_sum = 0, odd_sum = 0, n, ch;
        Scanner sc = new Scanner(System.in);
        

        do {
            System.out.println("Enter choice:");
            System.out.println("1.Enter a number 2.display result and exit");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter the number");
                n = sc.nextInt();

                if (n % 2 == 0)
                    even_sum += n;
                else
                    odd_sum += n;
            } else
                break;

        } while (true);
        
        System.out.println("Even Sum=" + even_sum);
        System.out.println("ODdSum=" + odd_sum);
        sc.close();

    }

}
