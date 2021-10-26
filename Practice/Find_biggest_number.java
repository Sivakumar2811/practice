package Practice;

public class Find_biggest_number {
    public static void main(String[] args) {
        int a[] = {2,5,9,66,4,0,19,-100,24,58,66,34,89};
        int big = 0;

        for(int i=0;i< a.length;i++)
        {
            if(a[i]>big)
            {
                big=a[i];
            }
        }
        System.out.println("Biggest number :"+big);
    }
}
