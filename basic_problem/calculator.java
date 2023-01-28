import java.util.*;

public class calculator {
    public static void main(String args[])
    {
        double op1,op2,res=0;
        char optr;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the operand 1");
        op1=sc.nextInt();
        System.out.println("Enter the operand 2");
        op2=sc.nextInt();
        System.out.println("Enter the operator");
        optr=sc.next().charAt(0);

        switch(optr)
        {
            case '+':
            res=op1+op2;
            break;
            case '-':
            res=op1-op2;
            break;
            case '/':
            res=op1/op2;
            break;
            case '*':
            res=op1*op2;
            break;
            case '%':
            res=op1%op2;
            break;
            default:
            System.out.println("Invalid OPERATOR!!!");
            
        }
        
        System.out.println("The result is="+res);

        
    }
    
}
