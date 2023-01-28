/*Butterfly pattern
 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *
 
 */

public class pattern12 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            //space-2*(n-i)
            for(int k=1;k<=2*(5-i);k++)
            {
                System.out.print(" ");
            }
           

            for(int j=1;j<=i;j++)
            {
               
                System.out.print("*");

            }
          
            System.out.println();
        }
        //another half

        for(int i=5;i>=1;i--)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            //space-2*(n-i)
            for(int k=1;k<=2*(5-i);k++)
            {
                System.out.print(" ");
            }
           

            for(int j=1;j<=i;j++)
            {
               
                System.out.print("*");

            }
          
            System.out.println();
        }
      
        
    }
}
