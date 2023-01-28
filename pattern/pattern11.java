/*
 0-1 Triangle pattern
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 */
public class pattern11 {

    public static void main(String args[]) {
        int k ;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0)
                k=1;
                else
                k=0;


                System.out.print(k + " ");

            }
            System.out.println();
        }
    }
}
