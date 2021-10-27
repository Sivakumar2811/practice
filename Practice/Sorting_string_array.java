package Practice;

import java.util.Arrays;

public class Sorting_string_array {
    public static void main(String[] args) {
        String s[]={"Honda","TVS","Yamaha","Bajaj","KTM","Royal Enfield","Hero"};

        for(int j=0;j<s.length;j++)
        {
            for(int i=j+1;i<s.length;i++)
            {
                if(s[j].compareTo(s[i])>0)
                {
                    String change=s[j];
                    s[j]=s[i];
                    s[i]=change;
                }
            }
        }
        for (String c:s)
        {
            System.out.println(c);
        }
    }
}
