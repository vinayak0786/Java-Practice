/*
 * INVERTED & ROTATED HALF-PYRAMID pattern
     *
    ** 
   ***
  ****  
 */

public class pattern8 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) 
        {

            for(int k=i;k<4;k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
             {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
