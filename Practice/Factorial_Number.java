package Practice;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        int n,factorical=1;

        System.out.print("Enter the number n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            factorical *= i;
        }
        System.out.println("Factorial of "+n+" is: "+factorical);
    }
}
