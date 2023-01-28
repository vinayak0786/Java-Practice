/* Character pattern
A
BC
DEF
GHIJ
 */


//  method:1

// public class pattern6 {
//     public static void main(String args[]) {
//         char ch = 'A';
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(ch++);
//             }

//             System.out.println();
//         }
//     }

// }

// Method :2

public class pattern6 {
     public static void main(String args[]) {
        int ch=65;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch);
                ch++;
            }
            System.out.println();
        }

    }

}

