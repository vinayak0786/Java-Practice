/*
 *INVERTED HALF-PYRAMID with Numbers pattern
 12345
 1234
 123
 12
 1
 */
public class pattern9 {
    public static void main(String args[])
    {
        
        for(int i=1;i<=5;i++)
        {
            int k=1;
            for(int j=i;j<=5;j++)
            {
                System.out.print(k++);
            }
            System.out.println();
        }
    }
    
}
