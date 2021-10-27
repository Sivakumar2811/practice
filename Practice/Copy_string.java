package Practice;

import java.util.Scanner;

public class Copy_string {
    public static void main(String[] args) {
        String s;

        System.out.print("Enter the string :");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();

        StringBuffer s1 = new StringBuffer(s);

        System.out.println("String of s1 is :"+s1);
    }
}
