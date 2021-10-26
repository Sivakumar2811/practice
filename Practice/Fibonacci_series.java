package Practice;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0,b=0,c=1,n;

        System.out.print("Enter the upto number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(true)
        {
            a=b;
            b=c;
            c=a+b;
            if (n>=a)
            {
                System.out.print(a+" ");
            }
            else
            {
                break;
            }
        }
    }
}
