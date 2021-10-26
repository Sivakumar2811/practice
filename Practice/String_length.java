package Practice;

import java.util.Scanner;

public class String_length {
    public static void main(String[] args) {
        String s;
        int i=0;
        System.out.print("Enter the string :");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        char ch[]=s.toCharArray();
        for (char c:ch) {
            i++;
        }
        System.out.println("Length of string "+s+" : "+i);
    }
}
