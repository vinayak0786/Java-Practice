import java.util.Scanner;

//Keep printing number until user enters a multiple of 10

public class number_input {
    
    public static void main(String args[]) {
       int n;
       Scanner sc=new Scanner(System.in);
        while (true) {
           

            System.out.println("Enter the number");
            n=sc.nextInt();
            if(n%10==0)
            break;
            else
            System.out.println(n);

            

            
        }
        sc.close();
    }

}
