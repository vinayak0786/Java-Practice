/* 
      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
    
 */
public class pattern17 {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) 
        {
           
            for (int k = 1; k <=2* (4 - i); k++)
                System.out.print(" ");
                
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j+" ");
                }
                for(int k=2;k<=i;k++)
                {
                    System.out.print(k+" ");
                }

           
            System.out.println();
          
        }

    }

}
