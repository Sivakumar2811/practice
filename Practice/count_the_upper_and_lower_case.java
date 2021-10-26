package Practice;

import java.util.Scanner;

public class count_the_upper_and_lower_case {
    public static void main(String[] args) {
        String s;
        int upper=0,lower=0,number=0,special=0;

        System.out.print("Enter the string :");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        char ch[]=s.toCharArray();
        for (char c:ch) {
            if (c>='A' && c<='Z')
                upper++;
            else if (c>='a' && c<='z')
                lower++;
            else if (c>='0' && c<='9')
                number++;
            else
                special++;
        }

        System.out.println("Upper case :"+upper);
        System.out.println("Lower case :"+lower);
        System.out.println("Numbers :"+number);
        System.out.println("Special Characters :"+special);
    }
}
