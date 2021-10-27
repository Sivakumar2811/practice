package Practice;

import java.util.Scanner;

public class Copy_string {
    public static void main(String[] args) {
        String s;

        System.out.print("Enter the string :");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();

        char ch[]=s.toCharArray();
        for (char c:ch)
        {
            s1+=c;
        }

        System.out.println("String of s1 is :"+s1);
    }
}
