package Practice;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        String s,reverse="";

        System.out.println("Check the Palindrome or Not");
        System.out.print("Enter the string :");
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        for(int i=(s.length()-1);i>=0;i--)
        {
            reverse += s.charAt(i);
        }
        if(s.equals(reverse)) {
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
    }
}
