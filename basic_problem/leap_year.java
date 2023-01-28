
//Leap Year (year divisible by 4 and year not a century year but divisible by 400)
import java.util.*;

public class leap_year {
    public static void main(String args[])
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        y=sc.nextInt();
        boolean check=(y%4==0)?true:(y%400==0 && y%100!=0)?true:false;
        if(check==true)
            System.out.println("Its Leap Year");
        else
        System.out.println("Not a Leap Year");




        sc.close();



    }

}
