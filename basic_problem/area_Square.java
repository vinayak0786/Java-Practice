import java.util.Scanner;

/*In a  program, input the side of a square
You have to output the area of the square.
(Hint : area of a square is (side x side)
*/

public class area_Square{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square");
        double a=sc.nextDouble();
        System.out.println("The area of square is="+(a*a));
    }

}