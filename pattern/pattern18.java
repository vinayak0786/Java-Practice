/* 
       1
     1 2 1
   1 2 3 2 1
1  2 3 4 3 2 1

*/
public class pattern18 {
    public static void main(String args[]) {
        int i,j,k,g;

        for ( i = 1; i <= 4; i++) {

            for ( k = 1; k <= 2 * (4 - i); k++)
                System.out.print(" ");

            for ( j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            g=i-1;
            for ( k = 2; k <= i; k++) {
                System.out.print((g--) + " ");
            }
            

            System.out.println();

        }

    }

}
