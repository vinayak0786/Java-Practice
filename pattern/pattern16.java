/* NUmber Pyramid
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5    
 */

public class pattern16 {
    public static void main(String ags[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= (5 - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();

        }

    }

}
