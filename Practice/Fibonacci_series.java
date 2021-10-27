package Practice;

import java.util.Scanner;

public class Fibonacci_series {
    static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n;

        System.out.print("Enter the upto number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<=n;i++)
        {
            if (fib(i)>n){
                break;
            }
            System.out.print(fib(i)+" ");
        }
    }
}
