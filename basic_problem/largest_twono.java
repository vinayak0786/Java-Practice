import java.util.*;

public class largest_twono {

  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean res = (a > b) ? true : false;
    if (res)
      System.out.println("A is greater than B");
    else
      System.out.println("B is greater than A");

  }

}
